/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
/**
 */
package main.sub.subsub.impl;

import main.MainPackage;

import main.impl.MainPackageImpl;

import main.sub.subsub.SubsubFactory;
import main.sub.subsub.SubsubPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsubPackageImpl extends EPackageImpl implements SubsubPackage
{
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
	private SubsubPackageImpl()
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
		SubsubPackageImpl theSubsubPackage = registeredSubsubPackage instanceof SubsubPackageImpl ? (SubsubPackageImpl)registeredSubsubPackage : new SubsubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);
		MainPackageImpl theMainPackage = (MainPackageImpl)(registeredPackage instanceof MainPackageImpl ? registeredPackage : MainPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSC()
	{
		return sscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //SubsubPackageImpl
