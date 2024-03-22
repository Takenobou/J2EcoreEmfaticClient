/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
/**
 */
package main.sub.subsub;

import main.MainPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see main.sub.subsub.SubsubFactory
 * @model kind="package"
 * @generated
 */
public class SubsubPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "subsub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://subsub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubsubPackage eINSTANCE = main.sub.subsub.SubsubPackage.init();

	/**
	 * The meta object id for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.sub.subsub.SSC
	 * @see main.sub.subsub.SubsubPackage#getSSC()
	 * @generated
	 */
	public static final int SSC = 0;

	/**
	 * The number of structural features of the '<em>SSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SSC_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sscEClass = null;

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
	 * @see main.sub.subsub.SubsubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubsubPackage()
	{
		super(eNS_URI, SubsubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubsubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubsubPackage init()
	{
		if (isInited) return (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubsubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubsubPackage theSubsubPackage = registeredSubsubPackage instanceof SubsubPackage ? (SubsubPackage)registeredSubsubPackage : new SubsubPackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackage theMainPackage = (MainPackage)(registeredPackage instanceof MainPackage ? registeredPackage : MainPackage.eINSTANCE);

		// Create package meta-data objects
		theSubsubPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theSubsubPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubsubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubsubPackage.eNS_URI, theSubsubPackage);
		return theSubsubPackage;
	}


	/**
	 * Returns the meta object for class '{@link main.sub.subsub.SSC <em>SSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSC</em>'.
	 * @see main.sub.subsub.SSC
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SubsubFactory getSubsubFactory()
	{
		return (SubsubFactory)getEFactoryInstance();
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
		sscEClass = createEClass(SSC);
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
		initEClass(sscEClass, main.sub.subsub.SSC.class, "SSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link main.sub.subsub.SSC <em>SSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.sub.subsub.SSC
		 * @see main.sub.subsub.SubsubPackage#getSSC()
		 * @generated
		 */
		public static final EClass SSC = eINSTANCE.getSSC();

	}

} //SubsubPackage
