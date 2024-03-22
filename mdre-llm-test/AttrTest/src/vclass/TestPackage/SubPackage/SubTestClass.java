/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
/**
 */
package TestPackage.SubPackage;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}</li>
 * </ul>
 *
 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass()
 * @model kind="class"
 * @generated
 */
public class SubTestClass extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected int testIntAttr = TEST_INT_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STRING_ATTR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTestStringAttr() <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStringAttr()
	 * @generated
	 * @ordered
	 */
	protected String testStringAttr = TEST_STRING_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getTestRealAttr() <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRealAttr()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testRealAttr = TEST_REAL_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestBooleanAttr() <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBooleanAttr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BOOLEAN_ATTR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2016-09-09");

	/**
	 * The cached value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected Date testAttr = TEST_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTestClass()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SubPackagePackage.Literals.SUB_TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestIntAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		int oldTestIntAttr = testIntAttr;
		testIntAttr = newTestIntAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR, oldTestIntAttr, testIntAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestStringAttr()
	 * @model default="" ordered="false"
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		String oldTestStringAttr = testStringAttr;
		testStringAttr = newTestStringAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR, oldTestStringAttr, testStringAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestRealAttr()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		BigDecimal oldTestRealAttr = testRealAttr;
		testRealAttr = newTestRealAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR, oldTestRealAttr, testRealAttr));
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestBooleanAttr()
	 * @model default="false" transient="true" volatile="true" ordered="false"
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestBooleanAttr the new value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #isTestBooleanAttr()
	 * @generated
	 */
	public void setTestBooleanAttr(boolean newTestBooleanAttr)
	{
		// TODO: implement this method to set the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2016-09-09"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #setTestAttr(Date)
	 * @see TestPackage.SubPackage.SubPackagePackage#getSubTestClass_TestAttr()
	 * @model default="2016-09-09" transient="true" ordered="false"
	 * @generated
	 */
	public Date getTestAttr()
	{
		return testAttr;
	}

	/**
	 * Sets the value of the '{@link TestPackage.SubPackage.SubTestClass#getTestAttr <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr the new value of the '<em>Test Attr</em>' attribute.
	 * @see #getTestAttr()
	 * @generated
	 */
	public void setTestAttr(Date newTestAttr)
	{
		Date oldTestAttr = testAttr;
		testAttr = newTestAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR, oldTestAttr, testAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return getTestAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				setTestAttr(TEST_ATTR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SubPackagePackage.SUB_TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case SubPackagePackage.SUB_TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case SubPackagePackage.SUB_TEST_CLASS__TEST_ATTR:
				return TEST_ATTR_EDEFAULT == null ? testAttr != null : !TEST_ATTR_EDEFAULT.equals(testAttr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testAttr: ");
		result.append(testAttr);
		result.append(')');
		return result.toString();
	}

} // SubTestClass
