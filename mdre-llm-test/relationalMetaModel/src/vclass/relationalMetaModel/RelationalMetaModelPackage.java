/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public class RelationalMetaModelPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relationalMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "relationalMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalMetaModelPackage eINSTANCE = relationalMetaModel.RelationalMetaModelPackage.init();

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalSchema
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
	 * @generated
	 */
	public static final int RELATIONAL_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalTable
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
	 * @generated
	 */
	public static final int RELATIONAL_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE__REFERENCED_BY = 3;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relationalMetaModel.RelationalForeignKey
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
	 * @generated
	 */
	public static final int RELATIONAL_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

	/**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalMetaModelPackage()
	{
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalMetaModelPackage init()
	{
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationalMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationalMetaModelPackage theRelationalMetaModelPackage = registeredRelationalMetaModelPackage instanceof RelationalMetaModelPackage ? (RelationalMetaModelPackage)registeredRelationalMetaModelPackage : new RelationalMetaModelPackage();

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
	public EClass getRelationalSchema()
	{
		return relationalSchemaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EAttribute getRelationalSchema_Name()
	{
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	public EReference getRelationalSchema_Tables()
	{
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
	public EClass getRelationalTable()
	{
		return relationalTableEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_Schema()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EAttribute getRelationalTable_Name()
	{
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ForeignKeys()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy()
	{
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
	public EClass getRelationalForeignKey()
	{
		return relationalForeignKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EAttribute getRelationalForeignKey_Name()
	{
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_OwnedByTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
	public EReference getRelationalForeignKey_ReferencedTable()
	{
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalMetaModelFactory getRelationalMetaModelFactory()
	{
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.diagram";
		addAnnotation
		  (relationalSchemaEClass,
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations()
	{
		String source = "gmf.node";
		addAnnotation
		  (relationalTableEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
		addAnnotation
		  (relationalForeignKeyEClass,
		   source,
		   new String[]
		   {
			   "label", "Name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getRelationalTable_ForeignKeys(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
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
		 * The meta object literal for the '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalSchema
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
		 * @generated
		 */
		public static final EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalTable
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
		 * @generated
		 */
		public static final EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

		/**
		 * The meta object literal for the '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relationalMetaModel.RelationalForeignKey
		 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
		 * @generated
		 */
		public static final EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

	}

} //RelationalMetaModelPackage
