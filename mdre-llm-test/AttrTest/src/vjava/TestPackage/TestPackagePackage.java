/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import TestPackage.SubPackage.SubPackagePackage;

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
 * @see TestPackage.TestPackageFactory
 * @generated
 */
public class TestPackagePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackagePackage eINSTANCE = TestPackage.TestPackagePackage.init();

	/**
	 * The meta object id for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SuperClass
	 * @see TestPackage.TestPackagePackage#getSuperClass()
	 * @generated
	 */
	public static final int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestClass
	 * @see TestPackage.TestPackagePackage#getTestClass()
	 * @generated
	 */
	public static final int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.TestPackagePackage#getTestInterface()
	 * @generated
	 */
	public static final int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.UberClass
	 * @see TestPackage.TestPackagePackage#getUberClass()
	 * @generated
	 */
	public static final int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.TestPackagePackage#getTestEnum()
	 * @generated
	 */
	public static final int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.TestPackagePackage#getTestDataType()
	 * @generated
	 */
	public static final int TEST_DATA_TYPE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uberClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType testDataTypeEDataType = null;

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
	 * @see TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackage()
	{
		super(eNS_URI, TestPackageFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init()
	{
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackagePackage theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackage ? (TestPackagePackage)registeredTestPackagePackage : new TestPackagePackage();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)(registeredPackage instanceof SubPackagePackage ? registeredPackage : SubPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();
		theSubPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();
		theSubPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory()
	{
		return (TestPackageFactory)getEFactoryInstance();
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
		testClassEClass = createEClass(TEST_CLASS);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_STRING_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_REAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_BOOLEAN_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_INT_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR1);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR2);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR3);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR4);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR5);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR6);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR7);
		createEAttribute(testClassEClass, TEST_CLASS__TEST_ATTR8);

		testInterfaceEClass = createEClass(TEST_INTERFACE);

		superClassEClass = createEClass(SUPER_CLASS);

		uberClassEClass = createEClass(UBER_CLASS);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);

		// Create data types
		testDataTypeEDataType = createEDataType(TEST_DATA_TYPE);
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
		SubPackagePackage theSubPackagePackage = (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClassEClass.getESuperTypes().add(this.getSuperClass());
		testClassEClass.getESuperTypes().add(this.getUberClass());
		testInterfaceEClass.getESuperTypes().add(this.getSuperClass());

		// Initialize classes and features; add operations and parameters
		initEClass(testClassEClass, TCname.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass_TestAttr(), ecorePackage.getEDate(), "testAttr", "2017-01-01", 1, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestStringAttr(), ecorePackage.getEString(), "testStringAttr", "", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestRealAttr(), ecorePackage.getEBigDecimal(), "testRealAttr", "0.0", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestBooleanAttr(), ecorePackage.getEBoolean(), "testBooleanAttr", "false", 0, 1, TCname.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestIntAttr(), ecorePackage.getEInt(), "testIntAttr", "1", 0, 1, TCname.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr1(), ecorePackage.getEInt(), "testAttr1", "1", 1, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr2(), ecorePackage.getEInt(), "testAttr2", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr3(), ecorePackage.getEInt(), "testAttr3", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr4(), ecorePackage.getEInt(), "testAttr4", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr5(), ecorePackage.getEInt(), "testAttr5", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestUnlimitedNaturalAttr(), ecorePackage.getEBigInteger(), "testUnlimitedNaturalAttr", "1", 0, 1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestClass_TestAttr6(), ecorePackage.getEInt(), "testAttr6", "1", 0, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr7(), ecorePackage.getEInt(), "testAttr7", "1", 1, -1, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestClass_TestAttr8(), ecorePackage.getEInt(), "testAttr8", "1", 2, 5, TCname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInterfaceEClass, TIname.class, "TestInterface", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(superClassEClass, SuperClass.class, "SuperClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uberClassEClass, UberClass.class, "UberClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");

		// Initialize data types
		initEDataType(testDataTypeEDataType, TDTname.class, "TestDataType", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelwriter.eu/alloyinecore/import
		createImportAnnotations();
		// http://www.modelwriter.eu/alloyinecore/visibility
		createVisibilityAnnotations();
		// http://www.modelwriter.eu/alloyinecore/expression/derivation
		createDerivationAnnotations();
		// http://www.modelwriter.eu/alloyinecore/static
		createStaticAnnotations();
		// http://www.modelwriter.eu/alloyinecore/model
		createModelAnnotations();
		// http://www.modelwriter.eu/alloyinecore/ghost
		createGhostAnnotations();
		// http://www.modelwriter.eu/alloyinecore/nullable
		createNullableAnnotations();
		// http://www.modelwriter.eu/alloyinecore/datatype/primitive
		createPrimitiveAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/import";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/visibility</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVisibilityAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/visibility";
		addAnnotation
		  (testClassEClass,
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
		addAnnotation
		  (getTestClass_TestIntAttr(),
		   source,
		   new String[]
		   {
			   "visibility", "private"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/expression/derivation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivationAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/expression/derivation";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
			   "expression", "~testAttr"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/static</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStaticAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/static";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/model</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModelAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/model";
		addAnnotation
		  (getTestClass_TestAttr(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestStringAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/ghost</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGhostAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/ghost";
		addAnnotation
		  (getTestClass_TestRealAttr(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/nullable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullableAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/nullable";
		addAnnotation
		  (getTestClass_TestAttr6(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr7(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getTestClass_TestAttr8(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.modelwriter.eu/alloyinecore/datatype/primitive</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrimitiveAnnotations()
	{
		String source = "http://www.modelwriter.eu/alloyinecore/datatype/primitive";
		addAnnotation
		  (testDataTypeEDataType,
		   source,
		   new String[]
		   {
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
		 * The meta object literal for the '{@link TestPackage.TestClass <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestClass
		 * @see TestPackage.TestPackagePackage#getTestClass()
		 * @generated
		 */
		public static final EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.TestPackagePackage#getTestInterface()
		 * @generated
		 */
		public static final EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SuperClass <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SuperClass
		 * @see TestPackage.TestPackagePackage#getSuperClass()
		 * @generated
		 */
		public static final EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.UberClass <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.UberClass
		 * @see TestPackage.TestPackagePackage#getUberClass()
		 * @generated
		 */
		public static final EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.TestPackagePackage#getTestEnum()
		 * @generated
		 */
		public static final EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.TestPackagePackage#getTestDataType()
		 * @generated
		 */
		public static final EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
