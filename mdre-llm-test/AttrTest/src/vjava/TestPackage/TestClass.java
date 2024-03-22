/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
/**
 */
package TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TCname#getTestAttr <em>Test Attr</em>}</li>
 *   <li>{@link TCname#getTestStringAttr <em>Test String Attr</em>}</li>
 *   <li>{@link TCname#getTestRealAttr <em>Test Real Attr</em>}</li>
 *   <li>{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}</li>
 *   <li>{@link TCname#getTestIntAttr <em>Test Int Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr1 <em>Test Attr1</em>}</li>
 *   <li>{@link TCname#getTestAttr2 <em>Test Attr2</em>}</li>
 *   <li>{@link TCname#getTestAttr3 <em>Test Attr3</em>}</li>
 *   <li>{@link TCname#getTestAttr4 <em>Test Attr4</em>}</li>
 *   <li>{@link TCname#getTestAttr5 <em>Test Attr5</em>}</li>
 *   <li>{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}</li>
 *   <li>{@link TCname#getTestAttr6 <em>Test Attr6</em>}</li>
 *   <li>{@link TCname#getTestAttr7 <em>Test Attr7</em>}</li>
 *   <li>{@link TCname#getTestAttr8 <em>Test Attr8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClass extends SuperClass implements TCname
{
	/**
	 * The default value of the '{@link #getTestAttr() <em>Test Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEST_ATTR_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2017-01-01");

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
	protected static final BigDecimal TEST_REAL_ATTR_EDEFAULT = new BigDecimal("0.0");

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
	 * The default value of the '{@link #getTestIntAttr() <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntAttr()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_INT_ATTR_EDEFAULT = 1;

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
	 * The default value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR1_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr1() <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr1()
	 * @generated
	 * @ordered
	 */
	protected int testAttr1 = TEST_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr2() <em>Test Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr2;

	/**
	 * The cached value of the '{@link #getTestAttr3() <em>Test Attr3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr3()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr3;

	/**
	 * The cached value of the '{@link #getTestAttr4() <em>Test Attr4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr4()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr4;

	/**
	 * The default value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ATTR5_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTestAttr5() <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr5()
	 * @generated
	 * @ordered
	 */
	protected int testAttr5 = TEST_ATTR5_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTestUnlimitedNaturalAttr() <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger testUnlimitedNaturalAttr = TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestAttr6() <em>Test Attr6</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr6()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr6;

	/**
	 * The cached value of the '{@link #getTestAttr7() <em>Test Attr7</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr7()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr7;

	/**
	 * The cached value of the '{@link #getTestAttr8() <em>Test Attr8</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestAttr8()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> testAttr8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass()
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
		return TestPackagePackage.Literals.TEST_CLASS;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr</b></em>' attribute.
	 * The default value is <code>"2017-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr</em>' attribute.
	 * @see #isSetTestAttr()
	 * @generated
	 */
	public Date getTestAttr()
	{
		// TODO: implement this method to return the 'Test Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns whether the value of the '{@link TCname#getTestAttr <em>Test Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Attr</em>' attribute is set.
	 * @see #getTestAttr()
	 * @generated
	 */
	public boolean isSetTestAttr()
	{
		// TODO: implement this method to return whether the 'Test Attr' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Test String Attr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test String Attr</em>' attribute.
	 * @see #setTestStringAttr(String)
	 * @generated
	 */
	public String getTestStringAttr()
	{
		return testStringAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestStringAttr <em>Test String Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestStringAttr the new value of the '<em>Test String Attr</em>' attribute.
	 * @see #getTestStringAttr()
	 * @generated
	 */
	public void setTestStringAttr(String newTestStringAttr)
	{
		testStringAttr = newTestStringAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Real Attr</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Real Attr</em>' attribute.
	 * @see #setTestRealAttr(BigDecimal)
	 * @generated
	 */
	public BigDecimal getTestRealAttr()
	{
		return testRealAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestRealAttr <em>Test Real Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestRealAttr the new value of the '<em>Test Real Attr</em>' attribute.
	 * @see #getTestRealAttr()
	 * @generated
	 */
	public void setTestRealAttr(BigDecimal newTestRealAttr)
	{
		testRealAttr = newTestRealAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Boolean Attr</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Boolean Attr</em>' attribute.
	 * @see #setTestBooleanAttr(boolean)
	 * @generated
	 */
	public boolean isTestBooleanAttr()
	{
		// TODO: implement this method to return the 'Test Boolean Attr' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link TCname#isTestBooleanAttr <em>Test Boolean Attr</em>}' attribute.
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
	 * Returns the value of the '<em><b>Test Int Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Int Attr</em>' attribute.
	 * @see #setTestIntAttr(int)
	 * @generated
	 */
	public int getTestIntAttr()
	{
		return testIntAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestIntAttr <em>Test Int Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestIntAttr the new value of the '<em>Test Int Attr</em>' attribute.
	 * @see #getTestIntAttr()
	 * @generated
	 */
	public void setTestIntAttr(int newTestIntAttr)
	{
		testIntAttr = newTestIntAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr1</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr1</em>' attribute.
	 * @see #setTestAttr1(int)
	 * @generated
	 */
	public int getTestAttr1()
	{
		return testAttr1;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr1 <em>Test Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr1 the new value of the '<em>Test Attr1</em>' attribute.
	 * @see #getTestAttr1()
	 * @generated
	 */
	public void setTestAttr1(int newTestAttr1)
	{
		testAttr1 = newTestAttr1;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr2</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr2()
	{
		if (testAttr2 == null)
		{
			testAttr2 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr2;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr3</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr3()
	{
		if (testAttr3 == null)
		{
			testAttr3 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr3;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr4</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr4</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr4()
	{
		if (testAttr4 == null)
		{
			testAttr4 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr4;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr5</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr5</em>' attribute.
	 * @see #setTestAttr5(int)
	 * @generated
	 */
	public int getTestAttr5()
	{
		return testAttr5;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestAttr5 <em>Test Attr5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestAttr5 the new value of the '<em>Test Attr5</em>' attribute.
	 * @see #getTestAttr5()
	 * @generated
	 */
	public void setTestAttr5(int newTestAttr5)
	{
		testAttr5 = newTestAttr5;
	}

	/**
	 * Returns the value of the '<em><b>Test Unlimited Natural Attr</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #setTestUnlimitedNaturalAttr(BigInteger)
	 * @generated
	 */
	public BigInteger getTestUnlimitedNaturalAttr()
	{
		return testUnlimitedNaturalAttr;
	}

	/**
	 * Sets the value of the '{@link TCname#getTestUnlimitedNaturalAttr <em>Test Unlimited Natural Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTestUnlimitedNaturalAttr the new value of the '<em>Test Unlimited Natural Attr</em>' attribute.
	 * @see #getTestUnlimitedNaturalAttr()
	 * @generated
	 */
	public void setTestUnlimitedNaturalAttr(BigInteger newTestUnlimitedNaturalAttr)
	{
		testUnlimitedNaturalAttr = newTestUnlimitedNaturalAttr;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr6</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr6</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr6()
	{
		if (testAttr6 == null)
		{
			testAttr6 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr6;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr7</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr7</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr7()
	{
		if (testAttr7 == null)
		{
			testAttr7 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr7;
	}

	/**
	 * Returns the value of the '<em><b>Test Attr8</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Attr8</em>' attribute list.
	 * @generated
	 */
	public List<Integer> getTestAttr8()
	{
		if (testAttr8 == null)
		{
			testAttr8 = new BasicInternalEList<Integer>(int.class);
		}
		return testAttr8;
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return getTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return getTestStringAttr();
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return getTestRealAttr();
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr();
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return getTestIntAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return getTestAttr1();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return getTestAttr2();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return getTestAttr3();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return getTestAttr4();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return getTestAttr5();
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return getTestUnlimitedNaturalAttr();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return getTestAttr6();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return getTestAttr7();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return getTestAttr8();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr((String)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr((BigDecimal)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr((Boolean)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				getTestAttr2().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				getTestAttr3().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				getTestAttr4().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5((Integer)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr((BigInteger)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				getTestAttr6().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				getTestAttr7().addAll((Collection<? extends Integer>)newValue);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
				getTestAttr8().addAll((Collection<? extends Integer>)newValue);
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
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				setTestStringAttr(TEST_STRING_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				setTestRealAttr(TEST_REAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				setTestBooleanAttr(TEST_BOOLEAN_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				setTestIntAttr(TEST_INT_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				setTestAttr1(TEST_ATTR1_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				getTestAttr2().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				getTestAttr3().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				getTestAttr4().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				setTestAttr5(TEST_ATTR5_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				setTestUnlimitedNaturalAttr(TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT);
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				getTestAttr6().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				getTestAttr7().clear();
				return;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				getTestAttr8().clear();
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
			case TestPackagePackage.TEST_CLASS__TEST_ATTR:
				return isSetTestAttr();
			case TestPackagePackage.TEST_CLASS__TEST_STRING_ATTR:
				return TEST_STRING_ATTR_EDEFAULT == null ? testStringAttr != null : !TEST_STRING_ATTR_EDEFAULT.equals(testStringAttr);
			case TestPackagePackage.TEST_CLASS__TEST_REAL_ATTR:
				return TEST_REAL_ATTR_EDEFAULT == null ? testRealAttr != null : !TEST_REAL_ATTR_EDEFAULT.equals(testRealAttr);
			case TestPackagePackage.TEST_CLASS__TEST_BOOLEAN_ATTR:
				return isTestBooleanAttr() != TEST_BOOLEAN_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_INT_ATTR:
				return testIntAttr != TEST_INT_ATTR_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR1:
				return testAttr1 != TEST_ATTR1_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_ATTR2:
				return testAttr2 != null && !testAttr2.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR3:
				return testAttr3 != null && !testAttr3.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR4:
				return testAttr4 != null && !testAttr4.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR5:
				return testAttr5 != TEST_ATTR5_EDEFAULT;
			case TestPackagePackage.TEST_CLASS__TEST_UNLIMITED_NATURAL_ATTR:
				return TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT == null ? testUnlimitedNaturalAttr != null : !TEST_UNLIMITED_NATURAL_ATTR_EDEFAULT.equals(testUnlimitedNaturalAttr);
			case TestPackagePackage.TEST_CLASS__TEST_ATTR6:
				return testAttr6 != null && !testAttr6.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR7:
				return testAttr7 != null && !testAttr7.isEmpty();
			case TestPackagePackage.TEST_CLASS__TEST_ATTR8:
				return testAttr8 != null && !testAttr8.isEmpty();
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
		result.append(" (testStringAttr: ");
		result.append(testStringAttr);
		result.append(", testRealAttr: ");
		result.append(testRealAttr);
		result.append(", testIntAttr: ");
		result.append(testIntAttr);
		result.append(", testAttr1: ");
		result.append(testAttr1);
		result.append(", testAttr2: ");
		result.append(testAttr2);
		result.append(", testAttr3: ");
		result.append(testAttr3);
		result.append(", testAttr4: ");
		result.append(testAttr4);
		result.append(", testAttr5: ");
		result.append(testAttr5);
		result.append(", testUnlimitedNaturalAttr: ");
		result.append(testUnlimitedNaturalAttr);
		result.append(", testAttr6: ");
		result.append(testAttr6);
		result.append(", testAttr7: ");
		result.append(testAttr7);
		result.append(", testAttr8: ");
		result.append(testAttr8);
		result.append(')');
		return result.toString();
	}

} // TestClass
