/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
/**
 */
package main.impl;

import main.MainFactory;
import main.MainPackage;

import main.sub.subsub.SubsubPackage;

import main.sub.subsub.impl.SubsubPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

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
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl()
	{
		super(eNS_URI, MainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init()
	{
		if (isInited) return (MainPackage)EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MainPackageImpl theMainPackage = registeredMainPackage instanceof MainPackageImpl ? (MainPackageImpl)registeredMainPackage : new MainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);
		SubsubPackageImpl theSubsubPackage = (SubsubPackageImpl)(registeredPackage instanceof SubsubPackageImpl ? registeredPackage : SubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theMainPackage.createPackageContents();
		theSubsubPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();
		theSubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MainPackage.eNS_URI, theMainPackage);
		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM()
	{
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P()
	{
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactory getMainFactory()
	{
		return (MainFactory)getEFactoryInstance();
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
		mEClass = createEClass(M);
		createEReference(mEClass, M__P);
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

		// Obtain other dependent packages
		SubsubPackage theSubsubPackage = (SubsubPackage)EPackage.Registry.INSTANCE.getEPackage(SubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mEClass, main.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), theSubsubPackage.getSSC(), null, "p", null, 1, 1, main.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MainPackageImpl
