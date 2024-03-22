/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
/**
 */
package TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @model kind="package"
 *        annotation="http://www.modelwriter.eu/alloyinecore/import Ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TestPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.SuperClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
	 * @generated
	 */
	int SUPER_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.TestClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_STRING_ATTR = SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_REAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_BOOLEAN_ATTR = SUPER_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_INT_ATTR = SUPER_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR1 = SUPER_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR2 = SUPER_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Attr3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR3 = SUPER_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test Attr4</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR4 = SUPER_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Attr5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR5 = SUPER_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = SUPER_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Attr6</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR6 = SUPER_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Attr7</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR7 = SUPER_CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Attr8</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_ATTR8 = SUPER_CLASS_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link TIname <em>Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
	 * @generated
	 */
	int TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTERFACE_FEATURE_COUNT = SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.impl.UberClassImpl
	 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
	 * @generated
	 */
	int UBER_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Uber Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.TestEnum
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 4;

	/**
	 * The meta object id for the '<em>Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDTname
	 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
	 * @generated
	 */
	int TEST_DATA_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link TCname <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see TCname
	 * @model instanceClass="TCname"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/visibility visibility='private'"
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TCname#getTestAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TCname#getTestStringAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TCname#getTestRealAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TCname#isTestBooleanAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TCname#getTestIntAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr1 <em>Test Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr1</em>'.
	 * @see TCname#getTestAttr1()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr2 <em>Test Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr2</em>'.
	 * @see TCname#getTestAttr2()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr2();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr3 <em>Test Attr3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr3</em>'.
	 * @see TCname#getTestAttr3()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr3();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr4 <em>Test Attr4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr4</em>'.
	 * @see TCname#getTestAttr4()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr4();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestAttr5 <em>Test Attr5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr5</em>'.
	 * @see TCname#getTestAttr5()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr5();

	/**
	 * Returns the meta object for the attribute '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Unlimited Natural Attr</em>'.
	 * @see TCname#getTestUnlimitedNaturalAttr()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestUnlimitedNaturalAttr();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr6 <em>Test Attr6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr6</em>'.
	 * @see TCname#getTestAttr6()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr6();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr7 <em>Test Attr7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr7</em>'.
	 * @see TCname#getTestAttr7()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr7();

	/**
	 * Returns the meta object for the attribute list '{@link TCname#getTestAttr8 <em>Test Attr8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Attr8</em>'.
	 * @see TCname#getTestAttr8()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_TestAttr8();

	/**
	 * Returns the meta object for class '{@link TIname <em>Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Interface</em>'.
	 * @see TIname
	 * @model instanceClass="TIname"
	 * @generated
	 */
	EClass getTestInterface();

	/**
	 * Returns the meta object for class '{@link TestPackage.SuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class</em>'.
	 * @see TestPackage.SuperClass
	 * @generated
	 */
	EClass getSuperClass();

	/**
	 * Returns the meta object for class '{@link TestPackage.UberClass <em>Uber Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber Class</em>'.
	 * @see TestPackage.UberClass
	 * @generated
	 */
	EClass getUberClass();

	/**
	 * Returns the meta object for enum '{@link TestPackage.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see TestPackage.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for data type '{@link TDTname <em>Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Test Data Type</em>'.
	 * @see TDTname
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 *        annotation="http://www.modelwriter.eu/alloyinecore/datatype/primitive"
	 * @generated
	 */
	EDataType getTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link TestPackage.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.TestClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR = eINSTANCE.getTestClass_TestAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR1 = eINSTANCE.getTestClass_TestAttr1();

		/**
		 * The meta object literal for the '<em><b>Test Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR2 = eINSTANCE.getTestClass_TestAttr2();

		/**
		 * The meta object literal for the '<em><b>Test Attr3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR3 = eINSTANCE.getTestClass_TestAttr3();

		/**
		 * The meta object literal for the '<em><b>Test Attr4</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR4 = eINSTANCE.getTestClass_TestAttr4();

		/**
		 * The meta object literal for the '<em><b>Test Attr5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR5 = eINSTANCE.getTestClass_TestAttr5();

		/**
		 * The meta object literal for the '<em><b>Test Unlimited Natural Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR = eINSTANCE.getTestClass_TestUnlimitedNaturalAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr6</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR6 = eINSTANCE.getTestClass_TestAttr6();

		/**
		 * The meta object literal for the '<em><b>Test Attr7</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR7 = eINSTANCE.getTestClass_TestAttr7();

		/**
		 * The meta object literal for the '<em><b>Test Attr8</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__TEST_ATTR8 = eINSTANCE.getTestClass_TestAttr8();

		/**
		 * The meta object literal for the '{@link TIname <em>Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestInterface()
		 * @generated
		 */
		EClass TEST_INTERFACE = eINSTANCE.getTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.SuperClassImpl <em>Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.SuperClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getSuperClass()
		 * @generated
		 */
		EClass SUPER_CLASS = eINSTANCE.getSuperClass();

		/**
		 * The meta object literal for the '{@link TestPackage.impl.UberClassImpl <em>Uber Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.impl.UberClassImpl
		 * @see TestPackage.impl.TestPackagePackageImpl#getUberClass()
		 * @generated
		 */
		EClass UBER_CLASS = eINSTANCE.getUberClass();

		/**
		 * The meta object literal for the '{@link TestPackage.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.TestEnum
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '<em>Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDTname
		 * @see TestPackage.impl.TestPackagePackageImpl#getTestDataType()
		 * @generated
		 */
		EDataType TEST_DATA_TYPE = eINSTANCE.getTestDataType();

	}

} //TestPackagePackage
