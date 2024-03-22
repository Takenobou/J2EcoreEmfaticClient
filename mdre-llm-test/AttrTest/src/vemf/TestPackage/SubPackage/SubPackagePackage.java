/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
/**
 */
package TestPackage.SubPackage;

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
 * @see TestPackage.SubPackage.SubPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SubPackagePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SubPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.sub.testpackage.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubPackagePackage eINSTANCE = TestPackage.SubPackage.impl.SubPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.impl.SubTestClassImpl
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
	 * @generated
	 */
	int SUB_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Test Int Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_INT_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Test String Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_STRING_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Test Real Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_REAL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Test Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS__TEST_ATTR = 4;

	/**
	 * The number of structural features of the '<em>Sub Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
	 * @generated
	 */
	int SUB_TEST_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Sub Test Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
	 * @generated
	 */
	int SUB_TEST_ENUM = 2;

	/**
	 * The meta object id for the '<em>Sub Test Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see STDTname
	 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
	 * @generated
	 */
	int SUB_TEST_DATA_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestClass <em>Sub Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Class</em>'.
	 * @see TestPackage.SubPackage.SubTestClass
	 * @generated
	 */
	EClass getSubTestClass();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Int Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestIntAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestIntAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test String Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestStringAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestStringAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Real Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestRealAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestRealAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Boolean Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#isTestBooleanAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestBooleanAttr();

	/**
	 * Returns the meta object for the attribute '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Attr</em>'.
	 * @see TestPackage.SubPackage.SubTestClass#getTestAttr()
	 * @see #getSubTestClass()
	 * @generated
	 */
	EAttribute getSubTestClass_TestAttr();

	/**
	 * Returns the meta object for class '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Test Interface</em>'.
	 * @see TestPackage.SubPackage.SubTestInterface
	 * @generated
	 */
	EClass getSubTestInterface();

	/**
	 * Returns the meta object for enum '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Test Enum</em>'.
	 * @see TestPackage.SubPackage.SubTestEnum
	 * @generated
	 */
	EEnum getSubTestEnum();

	/**
	 * Returns the meta object for data type '{@link STDTname <em>Sub Test Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Test Data Type</em>'.
	 * @see STDTname
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSubTestDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubPackageFactory getSubPackageFactory();

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
		 * The meta object literal for the '{@link TestPackage.SubPackage.impl.SubTestClassImpl <em>Sub Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.impl.SubTestClassImpl
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestClass()
		 * @generated
		 */
		EClass SUB_TEST_CLASS = eINSTANCE.getSubTestClass();

		/**
		 * The meta object literal for the '<em><b>Test Int Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_INT_ATTR = eINSTANCE.getSubTestClass_TestIntAttr();

		/**
		 * The meta object literal for the '<em><b>Test String Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_STRING_ATTR = eINSTANCE.getSubTestClass_TestStringAttr();

		/**
		 * The meta object literal for the '<em><b>Test Real Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_REAL_ATTR = eINSTANCE.getSubTestClass_TestRealAttr();

		/**
		 * The meta object literal for the '<em><b>Test Boolean Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_BOOLEAN_ATTR = eINSTANCE.getSubTestClass_TestBooleanAttr();

		/**
		 * The meta object literal for the '<em><b>Test Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TEST_CLASS__TEST_ATTR = eINSTANCE.getSubTestClass_TestAttr();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestInterface <em>Sub Test Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestInterface
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestInterface()
		 * @generated
		 */
		EClass SUB_TEST_INTERFACE = eINSTANCE.getSubTestInterface();

		/**
		 * The meta object literal for the '{@link TestPackage.SubPackage.SubTestEnum <em>Sub Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestPackage.SubPackage.SubTestEnum
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestEnum()
		 * @generated
		 */
		EEnum SUB_TEST_ENUM = eINSTANCE.getSubTestEnum();

		/**
		 * The meta object literal for the '<em>Sub Test Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see STDTname
		 * @see TestPackage.SubPackage.impl.SubPackagePackageImpl#getSubTestDataType()
		 * @generated
		 */
		EDataType SUB_TEST_DATA_TYPE = eINSTANCE.getSubTestDataType();

	}

} //SubPackagePackage
