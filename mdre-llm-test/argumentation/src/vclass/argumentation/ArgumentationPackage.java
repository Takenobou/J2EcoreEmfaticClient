/**
 */
package argumentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see argumentation.ArgumentationFactory
 * @model kind="package"
 * @generated
 */
public class ArgumentationPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "argumentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.kcl.ac.uk/mdeo/argumentation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "argumentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ArgumentationPackage eINSTANCE = argumentation.ArgumentationPackage.init();

	/**
	 * The meta object id for the '{@link argumentation.ArgumentationFramework <em>Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.ArgumentationFramework
	 * @see argumentation.ArgumentationPackage#getArgumentationFramework()
	 * @generated
	 */
	public static final int ARGUMENTATION_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Persuadee Argumentation Framework</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Has Persuader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENTATION_FRAMEWORK__HAS_PERSUADER = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENTATION_FRAMEWORK__ID = 2;

	/**
	 * The feature id for the '<em><b>Has Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT = 3;

	/**
	 * The feature id for the '<em><b>Has Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENTATION_FRAMEWORK__HAS_TOPIC = 4;

	/**
	 * The number of structural features of the '<em>Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENTATION_FRAMEWORK_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link argumentation.Persuader <em>Persuader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.Persuader
	 * @see argumentation.ArgumentationPackage#getPersuader()
	 * @generated
	 */
	public static final int PERSUADER = 1;

	/**
	 * The feature id for the '<em><b>Has Argumentation Framework</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADER__HAS_ARGUMENTATION_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADER__ID = 1;

	/**
	 * The feature id for the '<em><b>Puts Forward</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADER__PUTS_FORWARD = 2;

	/**
	 * The number of structural features of the '<em>Persuader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link argumentation.Argument <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.Argument
	 * @see argumentation.ArgumentationPackage#getArgument()
	 * @generated
	 */
	public static final int ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENT__ATTACKS = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Assert Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENT__ASSERT_ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link argumentation.Persuadee <em>Persuadee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.Persuadee
	 * @see argumentation.ArgumentationPackage#getPersuadee()
	 * @generated
	 */
	public static final int PERSUADEE = 3;

	/**
	 * The feature id for the '<em><b>Has Persuadee Argumentation Framework</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE__ID = 1;

	/**
	 * The number of structural features of the '<em>Persuadee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link argumentation.PersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.PersuadeeArgumentationFramework
	 * @see argumentation.ArgumentationPackage#getPersuadeeArgumentationFramework()
	 * @generated
	 */
	public static final int PERSUADEE_ARGUMENTATION_FRAMEWORK = 4;

	/**
	 * The feature id for the '<em><b>Has Argument</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT = 0;

	/**
	 * The feature id for the '<em><b>Has Persuadee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE_ARGUMENTATION_FRAMEWORK__ID = 2;

	/**
	 * The feature id for the '<em><b>Absorbs Argument</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT = 3;

	/**
	 * The number of structural features of the '<em>Persuadee Argumentation Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE_ARGUMENTATION_FRAMEWORK_FEATURE_COUNT = 4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentationFrameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persuaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persuadeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persuadeeArgumentationFrameworkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see argumentation.ArgumentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArgumentationPackage()
	{
		super(eNS_URI, ArgumentationFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ArgumentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArgumentationPackage init()
	{
		if (isInited) return (ArgumentationPackage)EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArgumentationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArgumentationPackage theArgumentationPackage = registeredArgumentationPackage instanceof ArgumentationPackage ? (ArgumentationPackage)registeredArgumentationPackage : new ArgumentationPackage();

		isInited = true;

		// Create package meta-data objects
		theArgumentationPackage.createPackageContents();

		// Initialize created meta-data
		theArgumentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArgumentationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArgumentationPackage.eNS_URI, theArgumentationPackage);
		return theArgumentationPackage;
	}


	/**
	 * Returns the meta object for class '{@link argumentation.ArgumentationFramework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Framework</em>'.
	 * @see argumentation.ArgumentationFramework
	 * @generated
	 */
	public EClass getArgumentationFramework()
	{
		return argumentationFrameworkEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link argumentation.ArgumentationFramework#getPersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persuadee Argumentation Framework</em>'.
	 * @see argumentation.ArgumentationFramework#getPersuadeeArgumentationFramework()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	public EReference getArgumentationFramework_PersuadeeArgumentationFramework()
	{
		return (EReference)argumentationFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link argumentation.ArgumentationFramework#getHasPersuader <em>Has Persuader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Persuader</em>'.
	 * @see argumentation.ArgumentationFramework#getHasPersuader()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	public EReference getArgumentationFramework_HasPersuader()
	{
		return (EReference)argumentationFrameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link argumentation.ArgumentationFramework#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.ArgumentationFramework#getID()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	public EAttribute getArgumentationFramework_ID()
	{
		return (EAttribute)argumentationFrameworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link argumentation.ArgumentationFramework#getHasArgument <em>Has Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Argument</em>'.
	 * @see argumentation.ArgumentationFramework#getHasArgument()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	public EReference getArgumentationFramework_HasArgument()
	{
		return (EReference)argumentationFrameworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link argumentation.ArgumentationFramework#getHasTopic <em>Has Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Topic</em>'.
	 * @see argumentation.ArgumentationFramework#getHasTopic()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	public EReference getArgumentationFramework_HasTopic()
	{
		return (EReference)argumentationFrameworkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link argumentation.Persuader <em>Persuader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persuader</em>'.
	 * @see argumentation.Persuader
	 * @generated
	 */
	public EClass getPersuader()
	{
		return persuaderEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link argumentation.Persuader#getHasArgumentationFramework <em>Has Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Has Argumentation Framework</em>'.
	 * @see argumentation.Persuader#getHasArgumentationFramework()
	 * @see #getPersuader()
	 * @generated
	 */
	public EReference getPersuader_HasArgumentationFramework()
	{
		return (EReference)persuaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link argumentation.Persuader#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.Persuader#getID()
	 * @see #getPersuader()
	 * @generated
	 */
	public EAttribute getPersuader_ID()
	{
		return (EAttribute)persuaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link argumentation.Persuader#getPutsForward <em>Puts Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Puts Forward</em>'.
	 * @see argumentation.Persuader#getPutsForward()
	 * @see #getPersuader()
	 * @generated
	 */
	public EReference getPersuader_PutsForward()
	{
		return (EReference)persuaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link argumentation.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see argumentation.Argument
	 * @generated
	 */
	public EClass getArgument()
	{
		return argumentEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link argumentation.Argument#getAttacks <em>Attacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attacks</em>'.
	 * @see argumentation.Argument#getAttacks()
	 * @see #getArgument()
	 * @generated
	 */
	public EReference getArgument_Attacks()
	{
		return (EReference)argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link argumentation.Argument#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.Argument#getID()
	 * @see #getArgument()
	 * @generated
	 */
	public EAttribute getArgument_ID()
	{
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link argumentation.Argument#getAssertArgument <em>Assert Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assert Argument</em>'.
	 * @see argumentation.Argument#getAssertArgument()
	 * @see #getArgument()
	 * @generated
	 */
	public EReference getArgument_AssertArgument()
	{
		return (EReference)argumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link argumentation.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see argumentation.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	public EAttribute getArgument_Name()
	{
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link argumentation.Persuadee <em>Persuadee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persuadee</em>'.
	 * @see argumentation.Persuadee
	 * @generated
	 */
	public EClass getPersuadee()
	{
		return persuadeeEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link argumentation.Persuadee#getHasPersuadeeArgumentationFramework <em>Has Persuadee Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Has Persuadee Argumentation Framework</em>'.
	 * @see argumentation.Persuadee#getHasPersuadeeArgumentationFramework()
	 * @see #getPersuadee()
	 * @generated
	 */
	public EReference getPersuadee_HasPersuadeeArgumentationFramework()
	{
		return (EReference)persuadeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link argumentation.Persuadee#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.Persuadee#getID()
	 * @see #getPersuadee()
	 * @generated
	 */
	public EAttribute getPersuadee_ID()
	{
		return (EAttribute)persuadeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link argumentation.PersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persuadee Argumentation Framework</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework
	 * @generated
	 */
	public EClass getPersuadeeArgumentationFramework()
	{
		return persuadeeArgumentationFrameworkEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link argumentation.PersuadeeArgumentationFramework#getHasArgument <em>Has Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Argument</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework#getHasArgument()
	 * @see #getPersuadeeArgumentationFramework()
	 * @generated
	 */
	public EReference getPersuadeeArgumentationFramework_HasArgument()
	{
		return (EReference)persuadeeArgumentationFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link argumentation.PersuadeeArgumentationFramework#getHasPersuadee <em>Has Persuadee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Persuadee</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework#getHasPersuadee()
	 * @see #getPersuadeeArgumentationFramework()
	 * @generated
	 */
	public EReference getPersuadeeArgumentationFramework_HasPersuadee()
	{
		return (EReference)persuadeeArgumentationFrameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link argumentation.PersuadeeArgumentationFramework#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework#getID()
	 * @see #getPersuadeeArgumentationFramework()
	 * @generated
	 */
	public EAttribute getPersuadeeArgumentationFramework_ID()
	{
		return (EAttribute)persuadeeArgumentationFrameworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument <em>Absorbs Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Absorbs Argument</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument()
	 * @see #getPersuadeeArgumentationFramework()
	 * @generated
	 */
	public EReference getPersuadeeArgumentationFramework_AbsorbsArgument()
	{
		return (EReference)persuadeeArgumentationFrameworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ArgumentationFactory getArgumentationFactory()
	{
		return (ArgumentationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		argumentationFrameworkEClass = createEClass(ARGUMENTATION_FRAMEWORK);
		createEReference(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK);
		createEReference(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__HAS_PERSUADER);
		createEAttribute(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__ID);
		createEReference(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT);
		createEReference(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__HAS_TOPIC);

		persuaderEClass = createEClass(PERSUADER);
		createEReference(persuaderEClass, PERSUADER__HAS_ARGUMENTATION_FRAMEWORK);
		createEAttribute(persuaderEClass, PERSUADER__ID);
		createEReference(persuaderEClass, PERSUADER__PUTS_FORWARD);

		argumentEClass = createEClass(ARGUMENT);
		createEReference(argumentEClass, ARGUMENT__ATTACKS);
		createEAttribute(argumentEClass, ARGUMENT__ID);
		createEReference(argumentEClass, ARGUMENT__ASSERT_ARGUMENT);
		createEAttribute(argumentEClass, ARGUMENT__NAME);

		persuadeeEClass = createEClass(PERSUADEE);
		createEReference(persuadeeEClass, PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK);
		createEAttribute(persuadeeEClass, PERSUADEE__ID);

		persuadeeArgumentationFrameworkEClass = createEClass(PERSUADEE_ARGUMENTATION_FRAMEWORK);
		createEReference(persuadeeArgumentationFrameworkEClass, PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT);
		createEReference(persuadeeArgumentationFrameworkEClass, PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE);
		createEAttribute(persuadeeArgumentationFrameworkEClass, PERSUADEE_ARGUMENTATION_FRAMEWORK__ID);
		createEReference(persuadeeArgumentationFrameworkEClass, PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(argumentationFrameworkEClass, ArgumentationFramework.class, "ArgumentationFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentationFramework_PersuadeeArgumentationFramework(), this.getPersuadeeArgumentationFramework(), null, "persuadeeArgumentationFramework", null, 1, -1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentationFramework_HasPersuader(), this.getPersuader(), this.getPersuader_HasArgumentationFramework(), "hasPersuader", null, 1, 1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgumentationFramework_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentationFramework_HasArgument(), this.getArgument(), null, "hasArgument", null, 1, -1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentationFramework_HasTopic(), this.getArgument(), null, "hasTopic", null, 0, 1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persuaderEClass, Persuader.class, "Persuader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersuader_HasArgumentationFramework(), this.getArgumentationFramework(), this.getArgumentationFramework_HasPersuader(), "hasArgumentationFramework", null, 1, 1, Persuader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersuader_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Persuader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersuader_PutsForward(), this.getArgument(), null, "putsForward", null, 0, -1, Persuader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgument_Attacks(), this.getArgument(), null, "attacks", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_AssertArgument(), this.getPersuadeeArgumentationFramework(), this.getPersuadeeArgumentationFramework_AbsorbsArgument(), "assertArgument", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persuadeeEClass, Persuadee.class, "Persuadee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersuadee_HasPersuadeeArgumentationFramework(), this.getPersuadeeArgumentationFramework(), this.getPersuadeeArgumentationFramework_HasPersuadee(), "hasPersuadeeArgumentationFramework", null, 1, 1, Persuadee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersuadee_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Persuadee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persuadeeArgumentationFrameworkEClass, PersuadeeArgumentationFramework.class, "PersuadeeArgumentationFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersuadeeArgumentationFramework_HasArgument(), this.getArgument(), null, "hasArgument", null, 1, -1, PersuadeeArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersuadeeArgumentationFramework_HasPersuadee(), this.getPersuadee(), this.getPersuadee_HasPersuadeeArgumentationFramework(), "hasPersuadee", null, 1, 1, PersuadeeArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersuadeeArgumentationFramework_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, PersuadeeArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersuadeeArgumentationFramework_AbsorbsArgument(), this.getArgument(), this.getArgument_AssertArgument(), "absorbsArgument", null, 0, -1, PersuadeeArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link argumentation.ArgumentationFramework <em>Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.ArgumentationFramework
		 * @see argumentation.ArgumentationPackage#getArgumentationFramework()
		 * @generated
		 */
		public static final EClass ARGUMENTATION_FRAMEWORK = eINSTANCE.getArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>Persuadee Argumentation Framework</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK = eINSTANCE.getArgumentationFramework_PersuadeeArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>Has Persuader</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARGUMENTATION_FRAMEWORK__HAS_PERSUADER = eINSTANCE.getArgumentationFramework_HasPersuader();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARGUMENTATION_FRAMEWORK__ID = eINSTANCE.getArgumentationFramework_ID();

		/**
		 * The meta object literal for the '<em><b>Has Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT = eINSTANCE.getArgumentationFramework_HasArgument();

		/**
		 * The meta object literal for the '<em><b>Has Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARGUMENTATION_FRAMEWORK__HAS_TOPIC = eINSTANCE.getArgumentationFramework_HasTopic();

		/**
		 * The meta object literal for the '{@link argumentation.Persuader <em>Persuader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.Persuader
		 * @see argumentation.ArgumentationPackage#getPersuader()
		 * @generated
		 */
		public static final EClass PERSUADER = eINSTANCE.getPersuader();

		/**
		 * The meta object literal for the '<em><b>Has Argumentation Framework</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERSUADER__HAS_ARGUMENTATION_FRAMEWORK = eINSTANCE.getPersuader_HasArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERSUADER__ID = eINSTANCE.getPersuader_ID();

		/**
		 * The meta object literal for the '<em><b>Puts Forward</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERSUADER__PUTS_FORWARD = eINSTANCE.getPersuader_PutsForward();

		/**
		 * The meta object literal for the '{@link argumentation.Argument <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.Argument
		 * @see argumentation.ArgumentationPackage#getArgument()
		 * @generated
		 */
		public static final EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Attacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARGUMENT__ATTACKS = eINSTANCE.getArgument_Attacks();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARGUMENT__ID = eINSTANCE.getArgument_ID();

		/**
		 * The meta object literal for the '<em><b>Assert Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARGUMENT__ASSERT_ARGUMENT = eINSTANCE.getArgument_AssertArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '{@link argumentation.Persuadee <em>Persuadee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.Persuadee
		 * @see argumentation.ArgumentationPackage#getPersuadee()
		 * @generated
		 */
		public static final EClass PERSUADEE = eINSTANCE.getPersuadee();

		/**
		 * The meta object literal for the '<em><b>Has Persuadee Argumentation Framework</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK = eINSTANCE.getPersuadee_HasPersuadeeArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERSUADEE__ID = eINSTANCE.getPersuadee_ID();

		/**
		 * The meta object literal for the '{@link argumentation.PersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.PersuadeeArgumentationFramework
		 * @see argumentation.ArgumentationPackage#getPersuadeeArgumentationFramework()
		 * @generated
		 */
		public static final EClass PERSUADEE_ARGUMENTATION_FRAMEWORK = eINSTANCE.getPersuadeeArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>Has Argument</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT = eINSTANCE.getPersuadeeArgumentationFramework_HasArgument();

		/**
		 * The meta object literal for the '<em><b>Has Persuadee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE = eINSTANCE.getPersuadeeArgumentationFramework_HasPersuadee();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERSUADEE_ARGUMENTATION_FRAMEWORK__ID = eINSTANCE.getPersuadeeArgumentationFramework_ID();

		/**
		 * The meta object literal for the '<em><b>Absorbs Argument</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT = eINSTANCE.getPersuadeeArgumentationFramework_AbsorbsArgument();

	}

} //ArgumentationPackage
/**
 */
package argumentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see argumentation.ArgumentationFactory
 * @model kind="package"
 * @generated
 */
public class ArgumentationPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "argumentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.kcl.ac.uk/mdeo/argumentation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "argumentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ArgumentationPackage eINSTANCE = argumentation.ArgumentationPackage.init();

	/**
	 * The meta object id for the '{@link argumentation.ArgumentationFramework <em>Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.ArgumentationFramework
	 * @see argumentation.ArgumentationPackage#getArgumentationFramework()
	 * @generated
	 */
	public static final int ARGUMENTATION_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Persuadee Argumentation Framework</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Has Persuader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENTATION_FRAMEWORK__HAS_PERSUADER = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENTATION_FRAMEWORK__ID = 2;

	/**
	 * The feature id for the '<em><b>Has Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT = 3;

	/**
	 * The feature id for the '<em><b>Has Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENTATION_FRAMEWORK__HAS_TOPIC = 4;

	/**
	 * The number of structural features of the '<em>Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENTATION_FRAMEWORK_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link argumentation.Persuader <em>Persuader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.Persuader
	 * @see argumentation.ArgumentationPackage#getPersuader()
	 * @generated
	 */
	public static final int PERSUADER = 1;

	/**
	 * The feature id for the '<em><b>Has Argumentation Framework</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADER__HAS_ARGUMENTATION_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADER__ID = 1;

	/**
	 * The feature id for the '<em><b>Puts Forward</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADER__PUTS_FORWARD = 2;

	/**
	 * The number of structural features of the '<em>Persuader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link argumentation.Argument <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.Argument
	 * @see argumentation.ArgumentationPackage#getArgument()
	 * @generated
	 */
	public static final int ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENT__ATTACKS = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Assert Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENT__ASSERT_ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link argumentation.Persuadee <em>Persuadee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.Persuadee
	 * @see argumentation.ArgumentationPackage#getPersuadee()
	 * @generated
	 */
	public static final int PERSUADEE = 3;

	/**
	 * The feature id for the '<em><b>Has Persuadee Argumentation Framework</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE__ID = 1;

	/**
	 * The number of structural features of the '<em>Persuadee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link argumentation.PersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.PersuadeeArgumentationFramework
	 * @see argumentation.ArgumentationPackage#getPersuadeeArgumentationFramework()
	 * @generated
	 */
	public static final int PERSUADEE_ARGUMENTATION_FRAMEWORK = 4;

	/**
	 * The feature id for the '<em><b>Has Argument</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT = 0;

	/**
	 * The feature id for the '<em><b>Has Persuadee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE_ARGUMENTATION_FRAMEWORK__ID = 2;

	/**
	 * The feature id for the '<em><b>Absorbs Argument</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT = 3;

	/**
	 * The number of structural features of the '<em>Persuadee Argumentation Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSUADEE_ARGUMENTATION_FRAMEWORK_FEATURE_COUNT = 4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentationFrameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persuaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persuadeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persuadeeArgumentationFrameworkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see argumentation.ArgumentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArgumentationPackage()
	{
		super(eNS_URI, ArgumentationFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ArgumentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArgumentationPackage init()
	{
		if (isInited) return (ArgumentationPackage)EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArgumentationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArgumentationPackage theArgumentationPackage = registeredArgumentationPackage instanceof ArgumentationPackage ? (ArgumentationPackage)registeredArgumentationPackage : new ArgumentationPackage();

		isInited = true;

		// Create package meta-data objects
		theArgumentationPackage.createPackageContents();

		// Initialize created meta-data
		theArgumentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArgumentationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArgumentationPackage.eNS_URI, theArgumentationPackage);
		return theArgumentationPackage;
	}


	/**
	 * Returns the meta object for class '{@link argumentation.ArgumentationFramework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Framework</em>'.
	 * @see argumentation.ArgumentationFramework
	 * @generated
	 */
	public EClass getArgumentationFramework()
	{
		return argumentationFrameworkEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link argumentation.ArgumentationFramework#getPersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persuadee Argumentation Framework</em>'.
	 * @see argumentation.ArgumentationFramework#getPersuadeeArgumentationFramework()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	public EReference getArgumentationFramework_PersuadeeArgumentationFramework()
	{
		return (EReference)argumentationFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link argumentation.ArgumentationFramework#getHasPersuader <em>Has Persuader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Persuader</em>'.
	 * @see argumentation.ArgumentationFramework#getHasPersuader()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	public EReference getArgumentationFramework_HasPersuader()
	{
		return (EReference)argumentationFrameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link argumentation.ArgumentationFramework#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.ArgumentationFramework#getID()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	public EAttribute getArgumentationFramework_ID()
	{
		return (EAttribute)argumentationFrameworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link argumentation.ArgumentationFramework#getHasArgument <em>Has Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Argument</em>'.
	 * @see argumentation.ArgumentationFramework#getHasArgument()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	public EReference getArgumentationFramework_HasArgument()
	{
		return (EReference)argumentationFrameworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link argumentation.ArgumentationFramework#getHasTopic <em>Has Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Topic</em>'.
	 * @see argumentation.ArgumentationFramework#getHasTopic()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	public EReference getArgumentationFramework_HasTopic()
	{
		return (EReference)argumentationFrameworkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link argumentation.Persuader <em>Persuader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persuader</em>'.
	 * @see argumentation.Persuader
	 * @generated
	 */
	public EClass getPersuader()
	{
		return persuaderEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link argumentation.Persuader#getHasArgumentationFramework <em>Has Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Has Argumentation Framework</em>'.
	 * @see argumentation.Persuader#getHasArgumentationFramework()
	 * @see #getPersuader()
	 * @generated
	 */
	public EReference getPersuader_HasArgumentationFramework()
	{
		return (EReference)persuaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link argumentation.Persuader#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.Persuader#getID()
	 * @see #getPersuader()
	 * @generated
	 */
	public EAttribute getPersuader_ID()
	{
		return (EAttribute)persuaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link argumentation.Persuader#getPutsForward <em>Puts Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Puts Forward</em>'.
	 * @see argumentation.Persuader#getPutsForward()
	 * @see #getPersuader()
	 * @generated
	 */
	public EReference getPersuader_PutsForward()
	{
		return (EReference)persuaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link argumentation.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see argumentation.Argument
	 * @generated
	 */
	public EClass getArgument()
	{
		return argumentEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link argumentation.Argument#getAttacks <em>Attacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attacks</em>'.
	 * @see argumentation.Argument#getAttacks()
	 * @see #getArgument()
	 * @generated
	 */
	public EReference getArgument_Attacks()
	{
		return (EReference)argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link argumentation.Argument#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.Argument#getID()
	 * @see #getArgument()
	 * @generated
	 */
	public EAttribute getArgument_ID()
	{
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link argumentation.Argument#getAssertArgument <em>Assert Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assert Argument</em>'.
	 * @see argumentation.Argument#getAssertArgument()
	 * @see #getArgument()
	 * @generated
	 */
	public EReference getArgument_AssertArgument()
	{
		return (EReference)argumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link argumentation.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see argumentation.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	public EAttribute getArgument_Name()
	{
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link argumentation.Persuadee <em>Persuadee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persuadee</em>'.
	 * @see argumentation.Persuadee
	 * @generated
	 */
	public EClass getPersuadee()
	{
		return persuadeeEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link argumentation.Persuadee#getHasPersuadeeArgumentationFramework <em>Has Persuadee Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Has Persuadee Argumentation Framework</em>'.
	 * @see argumentation.Persuadee#getHasPersuadeeArgumentationFramework()
	 * @see #getPersuadee()
	 * @generated
	 */
	public EReference getPersuadee_HasPersuadeeArgumentationFramework()
	{
		return (EReference)persuadeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link argumentation.Persuadee#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.Persuadee#getID()
	 * @see #getPersuadee()
	 * @generated
	 */
	public EAttribute getPersuadee_ID()
	{
		return (EAttribute)persuadeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link argumentation.PersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persuadee Argumentation Framework</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework
	 * @generated
	 */
	public EClass getPersuadeeArgumentationFramework()
	{
		return persuadeeArgumentationFrameworkEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link argumentation.PersuadeeArgumentationFramework#getHasArgument <em>Has Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Argument</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework#getHasArgument()
	 * @see #getPersuadeeArgumentationFramework()
	 * @generated
	 */
	public EReference getPersuadeeArgumentationFramework_HasArgument()
	{
		return (EReference)persuadeeArgumentationFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link argumentation.PersuadeeArgumentationFramework#getHasPersuadee <em>Has Persuadee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Persuadee</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework#getHasPersuadee()
	 * @see #getPersuadeeArgumentationFramework()
	 * @generated
	 */
	public EReference getPersuadeeArgumentationFramework_HasPersuadee()
	{
		return (EReference)persuadeeArgumentationFrameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link argumentation.PersuadeeArgumentationFramework#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework#getID()
	 * @see #getPersuadeeArgumentationFramework()
	 * @generated
	 */
	public EAttribute getPersuadeeArgumentationFramework_ID()
	{
		return (EAttribute)persuadeeArgumentationFrameworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument <em>Absorbs Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Absorbs Argument</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument()
	 * @see #getPersuadeeArgumentationFramework()
	 * @generated
	 */
	public EReference getPersuadeeArgumentationFramework_AbsorbsArgument()
	{
		return (EReference)persuadeeArgumentationFrameworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ArgumentationFactory getArgumentationFactory()
	{
		return (ArgumentationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		argumentationFrameworkEClass = createEClass(ARGUMENTATION_FRAMEWORK);
		createEReference(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK);
		createEReference(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__HAS_PERSUADER);
		createEAttribute(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__ID);
		createEReference(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT);
		createEReference(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__HAS_TOPIC);

		persuaderEClass = createEClass(PERSUADER);
		createEReference(persuaderEClass, PERSUADER__HAS_ARGUMENTATION_FRAMEWORK);
		createEAttribute(persuaderEClass, PERSUADER__ID);
		createEReference(persuaderEClass, PERSUADER__PUTS_FORWARD);

		argumentEClass = createEClass(ARGUMENT);
		createEReference(argumentEClass, ARGUMENT__ATTACKS);
		createEAttribute(argumentEClass, ARGUMENT__ID);
		createEReference(argumentEClass, ARGUMENT__ASSERT_ARGUMENT);
		createEAttribute(argumentEClass, ARGUMENT__NAME);

		persuadeeEClass = createEClass(PERSUADEE);
		createEReference(persuadeeEClass, PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK);
		createEAttribute(persuadeeEClass, PERSUADEE__ID);

		persuadeeArgumentationFrameworkEClass = createEClass(PERSUADEE_ARGUMENTATION_FRAMEWORK);
		createEReference(persuadeeArgumentationFrameworkEClass, PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT);
		createEReference(persuadeeArgumentationFrameworkEClass, PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE);
		createEAttribute(persuadeeArgumentationFrameworkEClass, PERSUADEE_ARGUMENTATION_FRAMEWORK__ID);
		createEReference(persuadeeArgumentationFrameworkEClass, PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(argumentationFrameworkEClass, ArgumentationFramework.class, "ArgumentationFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentationFramework_PersuadeeArgumentationFramework(), this.getPersuadeeArgumentationFramework(), null, "persuadeeArgumentationFramework", null, 1, -1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentationFramework_HasPersuader(), this.getPersuader(), this.getPersuader_HasArgumentationFramework(), "hasPersuader", null, 1, 1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgumentationFramework_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentationFramework_HasArgument(), this.getArgument(), null, "hasArgument", null, 1, -1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentationFramework_HasTopic(), this.getArgument(), null, "hasTopic", null, 0, 1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persuaderEClass, Persuader.class, "Persuader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersuader_HasArgumentationFramework(), this.getArgumentationFramework(), this.getArgumentationFramework_HasPersuader(), "hasArgumentationFramework", null, 1, 1, Persuader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersuader_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Persuader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersuader_PutsForward(), this.getArgument(), null, "putsForward", null, 0, -1, Persuader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgument_Attacks(), this.getArgument(), null, "attacks", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_AssertArgument(), this.getPersuadeeArgumentationFramework(), this.getPersuadeeArgumentationFramework_AbsorbsArgument(), "assertArgument", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persuadeeEClass, Persuadee.class, "Persuadee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersuadee_HasPersuadeeArgumentationFramework(), this.getPersuadeeArgumentationFramework(), this.getPersuadeeArgumentationFramework_HasPersuadee(), "hasPersuadeeArgumentationFramework", null, 1, 1, Persuadee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersuadee_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Persuadee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persuadeeArgumentationFrameworkEClass, PersuadeeArgumentationFramework.class, "PersuadeeArgumentationFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersuadeeArgumentationFramework_HasArgument(), this.getArgument(), null, "hasArgument", null, 1, -1, PersuadeeArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersuadeeArgumentationFramework_HasPersuadee(), this.getPersuadee(), this.getPersuadee_HasPersuadeeArgumentationFramework(), "hasPersuadee", null, 1, 1, PersuadeeArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersuadeeArgumentationFramework_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, PersuadeeArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersuadeeArgumentationFramework_AbsorbsArgument(), this.getArgument(), this.getArgument_AssertArgument(), "absorbsArgument", null, 0, -1, PersuadeeArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link argumentation.ArgumentationFramework <em>Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.ArgumentationFramework
		 * @see argumentation.ArgumentationPackage#getArgumentationFramework()
		 * @generated
		 */
		public static final EClass ARGUMENTATION_FRAMEWORK = eINSTANCE.getArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>Persuadee Argumentation Framework</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK = eINSTANCE.getArgumentationFramework_PersuadeeArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>Has Persuader</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARGUMENTATION_FRAMEWORK__HAS_PERSUADER = eINSTANCE.getArgumentationFramework_HasPersuader();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARGUMENTATION_FRAMEWORK__ID = eINSTANCE.getArgumentationFramework_ID();

		/**
		 * The meta object literal for the '<em><b>Has Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT = eINSTANCE.getArgumentationFramework_HasArgument();

		/**
		 * The meta object literal for the '<em><b>Has Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARGUMENTATION_FRAMEWORK__HAS_TOPIC = eINSTANCE.getArgumentationFramework_HasTopic();

		/**
		 * The meta object literal for the '{@link argumentation.Persuader <em>Persuader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.Persuader
		 * @see argumentation.ArgumentationPackage#getPersuader()
		 * @generated
		 */
		public static final EClass PERSUADER = eINSTANCE.getPersuader();

		/**
		 * The meta object literal for the '<em><b>Has Argumentation Framework</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERSUADER__HAS_ARGUMENTATION_FRAMEWORK = eINSTANCE.getPersuader_HasArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERSUADER__ID = eINSTANCE.getPersuader_ID();

		/**
		 * The meta object literal for the '<em><b>Puts Forward</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERSUADER__PUTS_FORWARD = eINSTANCE.getPersuader_PutsForward();

		/**
		 * The meta object literal for the '{@link argumentation.Argument <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.Argument
		 * @see argumentation.ArgumentationPackage#getArgument()
		 * @generated
		 */
		public static final EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Attacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARGUMENT__ATTACKS = eINSTANCE.getArgument_Attacks();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARGUMENT__ID = eINSTANCE.getArgument_ID();

		/**
		 * The meta object literal for the '<em><b>Assert Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARGUMENT__ASSERT_ARGUMENT = eINSTANCE.getArgument_AssertArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '{@link argumentation.Persuadee <em>Persuadee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.Persuadee
		 * @see argumentation.ArgumentationPackage#getPersuadee()
		 * @generated
		 */
		public static final EClass PERSUADEE = eINSTANCE.getPersuadee();

		/**
		 * The meta object literal for the '<em><b>Has Persuadee Argumentation Framework</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK = eINSTANCE.getPersuadee_HasPersuadeeArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERSUADEE__ID = eINSTANCE.getPersuadee_ID();

		/**
		 * The meta object literal for the '{@link argumentation.PersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.PersuadeeArgumentationFramework
		 * @see argumentation.ArgumentationPackage#getPersuadeeArgumentationFramework()
		 * @generated
		 */
		public static final EClass PERSUADEE_ARGUMENTATION_FRAMEWORK = eINSTANCE.getPersuadeeArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>Has Argument</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT = eINSTANCE.getPersuadeeArgumentationFramework_HasArgument();

		/**
		 * The meta object literal for the '<em><b>Has Persuadee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE = eINSTANCE.getPersuadeeArgumentationFramework_HasPersuadee();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERSUADEE_ARGUMENTATION_FRAMEWORK__ID = eINSTANCE.getPersuadeeArgumentationFramework_ID();

		/**
		 * The meta object literal for the '<em><b>Absorbs Argument</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT = eINSTANCE.getPersuadeeArgumentationFramework_AbsorbsArgument();

	}

} //ArgumentationPackage
