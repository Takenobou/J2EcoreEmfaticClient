/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
/**
 */
package TestPackage.impl;

import TestPackage.SubPackage.SubPackagePackage;

import TestPackage.SubPackage.impl.SubPackagePackageImpl;

import TestPackage.SuperClass;
import TestPackage.TestEnum;
import TestPackage.TestPackageFactory;
import TestPackage.TestPackagePackage;
import TestPackage.UberClass;

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
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage
{
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
	private TestPackagePackageImpl()
	{
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
		TestPackagePackageImpl theTestPackagePackage = registeredTestPackagePackage instanceof TestPackagePackageImpl ? (TestPackagePackageImpl)registeredTestPackagePackage : new TestPackagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);
		SubPackagePackageImpl theSubPackagePackage = (SubPackagePackageImpl)(registeredPackage instanceof SubPackagePackageImpl ? registeredPackage : SubPackagePackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass()
	{
		return testClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestStringAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestRealAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestBooleanAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestIntAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr1()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr2()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr3()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr4()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr5()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestUnlimitedNaturalAttr()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr6()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr7()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass_TestAttr8()
	{
		return (EAttribute)testClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInterface()
	{
		return testInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperClass()
	{
		return superClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUberClass()
	{
		return uberClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum()
	{
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTestDataType()
	{
		return testDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //TestPackagePackageImpl
