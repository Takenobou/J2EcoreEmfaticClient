package aam65.j2ecoreClient;

import aam65.j2ecore.*;
import mdre.services.EcoreToEmfaticService;
import org.eclipse.emf.ecore.EPackage;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.stream.Stream;

public class EcoreGeneratorClient {
    private static final Logger LOGGER = Logger.getLogger(EcoreGeneratorClient.class.getName());
    private static final Path projectRoot = Paths.get(System.getProperty("user.dir"), "mdre-llm-test");
    private static final Path metadataPath = projectRoot.resolve("metadata.json");
    private static final EcoreToEmfaticService emfaticService = new EcoreToEmfaticService();
    private static final JSONObject updatedMetadata = new JSONObject();

    public static void main(String[] args) {
        JSONObject metadata;
        try (FileInputStream inputStream = new FileInputStream(metadataPath.toFile())) {
            metadata = new JSONObject(new JSONTokener(inputStream));
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error loading metadata.json", e);
            return;
        }

        for (String projectName : metadata.keySet()) {
            processProject(projectName, metadata.getJSONObject(projectName));
        }

        try {
            Files.write(projectRoot.resolve("metadata_j2ecore.json"), updatedMetadata.toString(4).getBytes());
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error saving updated metadata_j2ecore.json", e);
        }
    }

    private static void processProject(String projectName, JSONObject projectEntry) {
        // Process Java files for each model type (vemf, vclass, vjava)
        String[] modelTypes = {"vemf", "vclass", "vjava"};
        for (String modelType : modelTypes) {
            String baseDirPath = projectEntry.getString(modelType);
            Path baseDir = projectRoot.resolve(baseDirPath);
            Path modelDir = projectRoot.resolve(projectName).resolve("model").resolve(modelType + "_j2ecore_models");
            processDirectory(baseDir, modelDir, projectName, modelType);
        }
    }

    private static void processDirectory(Path baseDir, Path modelDir, String projectName, String modelType) {
        try {
            Files.createDirectories(modelDir);

            EcoreModelManager modelManager = new EcoreModelManager();
            JavaFileParser parser = new JavaFileParser(modelManager);

            try (Stream<Path> paths = Files.walk(baseDir)) {
                paths.filter(Files::isRegularFile)
                        .filter(path -> path.toString().endsWith(".java"))
                        .forEach(path -> {
                            try {
                                parser.parseFile(path);
                                LOGGER.log(Level.INFO, "Parsed file: " + path);
                            } catch (IOException e) {
                                LOGGER.log(Level.SEVERE, "Error parsing file: " + path, e);
                            }
                        });

                modelManager.processReferences();

                Path ecoreFilePath = modelDir.resolve(projectName + "_" + modelType + ".ecore");
                EcoreExporter exporter = new EcoreExporter();
                EPackage ePackage = modelManager.getEPackage();
                exporter.exportModel(ePackage, ecoreFilePath.toString());

                String outputDirectory = modelDir.toAbsolutePath() + "/";
                emfaticService.generate(ecoreFilePath.toAbsolutePath().toString(), outputDirectory);

                Path emfFilePath = modelDir.resolve(projectName + "_" + modelType + ".emf");

                updateMetadata(projectName, modelType, ecoreFilePath, emfFilePath);
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, "Error walking through directory: " + baseDir, e);
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Could not create model directory: " + modelDir, e);
        }
    }

    private static void updateMetadata(String projectName, String modelType, Path ecoreFilePath, Path emfFilePath) {
        Path relativeEcorePath = projectRoot.relativize(ecoreFilePath);
        Path relativeEmfPath = projectRoot.relativize(emfFilePath);

        JSONObject projectEntry = updatedMetadata.optJSONObject(projectName);
        if (projectEntry == null) {
            projectEntry = new JSONObject();
            updatedMetadata.put(projectName, projectEntry);
        }

        projectEntry.put(modelType + "_j2ecore_ecore", relativeEcorePath.toString());
        projectEntry.put(modelType + "_j2ecore_emf", relativeEmfPath.toString());
    }
}
