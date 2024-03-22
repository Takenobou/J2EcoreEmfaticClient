/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
/**
 */
package TestPackage.SubPackage.impl;

import TestPackage.SubPackage.SubPackageFactory;
import TestPackage.SubPackage.SubPackagePackage;
import TestPackage.SubPackage.SubTestClass;
import TestPackage.SubPackage.SubTestEnum;
import TestPackage.SubPackage.SubTestInterface;

import TestPackage.TestPackagePackage;

import TestPackage.impl.TestPackagePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subTestEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subTestDataTypeEDataType = null;

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
	 * @see TestPackage.SubPackage.SubPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackagePackageImpl()
	{
		super(eNS_URI, SubPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackagePackage init()
	{
		if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(registeredPackage instanceof TestPackagePackageImpl ? registeredPackage : TestPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackagePackage.createPackageContents();
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theSubPackagePackage.initializePackageContents();
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
		return theSubPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageFactory getSubPackageFactory()
	{
		return (SubPackageFactory)getEFactoryInstance();
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
		subTestClassEClass = createEClass(SUB_TEST_CLASS);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(subTestClassEClass, SUB_TEST_CLASS__TEST_ATTR);

		subTestInterfaceEClass = createEClass(SUB_TEST_INTERFACE);

		// Create enums
		subTestEnumEEnum = createEEnum(SUB_TEST_ENUM);

		// Create data types
		subTestDataTypeEDataType = createEDataType(SUB_TEST_DATA_TYPE);
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
		initEClass(subTestClassEClass, SubTestClass.class, "SubTestClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0", 0, 1, SubTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, SubTestClass.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2016-09-09", 0, 1, SubTestClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subTestInterfaceEClass, SubTestInterface.class, "SubTestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(subTestEnumEEnum, SubTestEnum.class, "SubTestEnum");

		// Initialize data types
		initEDataType(subTestDataTypeEDataType, STDTname.class, "SubTestDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //SubPackagePackageImpl
