/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

import TestPackage.TestPackagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @generated
 */
public class SubPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SubPackagePackage eINSTANCE = TestPackage.SubPackage.SubPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestClass
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
	 * @generated
	 */
	public static final int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
	 * @generated
	 */
	public static final int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
	 * @generated
	 */
	public static final int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
	 * @generated
	 */
	public static final int SUB_TEST_DATA_TYPE = 3;

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
	private SubPackagePackage()
	{
		super(eNS_URI, SubPackageFactory.INSTANCE);
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
		SubPackagePackage theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackage ? (SubPackagePackage)registeredSubPackagePackage : new SubPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);
		TestPackagePackage theTestPackagePackage = (TestPackagePackage)(registeredPackage instanceof TestPackagePackage ? registeredPackage : TestPackagePackage.eINSTANCE);

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
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	public EClass getSubTestClass()
	{
		return subTestClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestIntAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestStringAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestRealAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestBooleanAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	public EAttribute getSubTestClass_TestAttr()
	{
		return (EAttribute)subTestClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	public EClass getSubTestInterface()
	{
		return subTestInterfaceEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	public EEnum getSubTestEnum()
	{
		return subTestEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @generated
	 */
	public EDataType getSubTestDataType()
	{
		return subTestDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestClass
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
		 * @generated
		 */
		public static final EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestInterface()
		 * @generated
		 */
		public static final EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestEnum()
		 * @generated
		 */
		public static final EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestDataType()
		 * @generated
		 */
		public static final EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
