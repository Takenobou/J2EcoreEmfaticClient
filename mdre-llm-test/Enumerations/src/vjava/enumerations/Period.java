/**
 */
package enumerations;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}</li>
 *   <li>{@link enumerations.Period#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Period extends Object implements Object
{
	/**
	 * The default value of the '{@link #getNanosecond() <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanosecond()
	 * @generated
	 * @ordered
	 */
	protected static final long NANOSECOND_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNanosecond() <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanosecond()
	 * @generated
	 * @ordered
	 */
	protected long nanosecond = NANOSECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected int second = SECOND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Period()
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
		return EnumerationsPackage.Literals.PERIOD;
	}

	/**
	 * Returns the value of the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nanosecond</em>' attribute.
	 * @see #setNanosecond(long)
	 * @generated
	 */
	public long getNanosecond()
	{
		return nanosecond;
	}

	/**
	 * Sets the value of the '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newNanosecond the new value of the '<em>Nanosecond</em>' attribute.
	 * @see #getNanosecond()
	 * @generated
	 */
	public void setNanosecond(long newNanosecond)
	{
		nanosecond = newNanosecond;
	}

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(int)
	 * @generated
	 */
	public int getSecond()
	{
		return second;
	}

	/**
	 * Sets the value of the '{@link enumerations.Period#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSecond the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	public void setSecond(int newSecond)
	{
		second = newSecond;
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				return getNanosecond();
			case EnumerationsPackage.PERIOD__SECOND:
				return getSecond();
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				setNanosecond((Long)newValue);
				return;
			case EnumerationsPackage.PERIOD__SECOND:
				setSecond((Integer)newValue);
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				setNanosecond(NANOSECOND_EDEFAULT);
				return;
			case EnumerationsPackage.PERIOD__SECOND:
				setSecond(SECOND_EDEFAULT);
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				return nanosecond != NANOSECOND_EDEFAULT;
			case EnumerationsPackage.PERIOD__SECOND:
				return second != SECOND_EDEFAULT;
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
		result.append(" (nanosecond: ");
		result.append(nanosecond);
		result.append(", second: ");
		result.append(second);
		result.append(')');
		return result.toString();
	}

} // Period
/**
 */
package enumerations;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}</li>
 *   <li>{@link enumerations.Period#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Period extends Object implements Object
{
	/**
	 * The default value of the '{@link #getNanosecond() <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanosecond()
	 * @generated
	 * @ordered
	 */
	protected static final long NANOSECOND_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNanosecond() <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanosecond()
	 * @generated
	 * @ordered
	 */
	protected long nanosecond = NANOSECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected int second = SECOND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Period()
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
		return EnumerationsPackage.Literals.PERIOD;
	}

	/**
	 * Returns the value of the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nanosecond</em>' attribute.
	 * @see #setNanosecond(long)
	 * @generated
	 */
	public long getNanosecond()
	{
		return nanosecond;
	}

	/**
	 * Sets the value of the '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newNanosecond the new value of the '<em>Nanosecond</em>' attribute.
	 * @see #getNanosecond()
	 * @generated
	 */
	public void setNanosecond(long newNanosecond)
	{
		nanosecond = newNanosecond;
	}

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(int)
	 * @generated
	 */
	public int getSecond()
	{
		return second;
	}

	/**
	 * Sets the value of the '{@link enumerations.Period#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSecond the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	public void setSecond(int newSecond)
	{
		second = newSecond;
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				return getNanosecond();
			case EnumerationsPackage.PERIOD__SECOND:
				return getSecond();
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				setNanosecond((Long)newValue);
				return;
			case EnumerationsPackage.PERIOD__SECOND:
				setSecond((Integer)newValue);
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				setNanosecond(NANOSECOND_EDEFAULT);
				return;
			case EnumerationsPackage.PERIOD__SECOND:
				setSecond(SECOND_EDEFAULT);
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				return nanosecond != NANOSECOND_EDEFAULT;
			case EnumerationsPackage.PERIOD__SECOND:
				return second != SECOND_EDEFAULT;
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
		result.append(" (nanosecond: ");
		result.append(nanosecond);
		result.append(", second: ");
		result.append(second);
		result.append(')');
		return result.toString();
	}

} // Period
/**
 */
package enumerations;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}</li>
 *   <li>{@link enumerations.Period#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Period extends Object implements Object
{
	/**
	 * The default value of the '{@link #getNanosecond() <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanosecond()
	 * @generated
	 * @ordered
	 */
	protected static final long NANOSECOND_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNanosecond() <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanosecond()
	 * @generated
	 * @ordered
	 */
	protected long nanosecond = NANOSECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected int second = SECOND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Period()
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
		return EnumerationsPackage.Literals.PERIOD;
	}

	/**
	 * Returns the value of the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nanosecond</em>' attribute.
	 * @see #setNanosecond(long)
	 * @generated
	 */
	public long getNanosecond()
	{
		return nanosecond;
	}

	/**
	 * Sets the value of the '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newNanosecond the new value of the '<em>Nanosecond</em>' attribute.
	 * @see #getNanosecond()
	 * @generated
	 */
	public void setNanosecond(long newNanosecond)
	{
		nanosecond = newNanosecond;
	}

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(int)
	 * @generated
	 */
	public int getSecond()
	{
		return second;
	}

	/**
	 * Sets the value of the '{@link enumerations.Period#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSecond the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	public void setSecond(int newSecond)
	{
		second = newSecond;
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				return getNanosecond();
			case EnumerationsPackage.PERIOD__SECOND:
				return getSecond();
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				setNanosecond((Long)newValue);
				return;
			case EnumerationsPackage.PERIOD__SECOND:
				setSecond((Integer)newValue);
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				setNanosecond(NANOSECOND_EDEFAULT);
				return;
			case EnumerationsPackage.PERIOD__SECOND:
				setSecond(SECOND_EDEFAULT);
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				return nanosecond != NANOSECOND_EDEFAULT;
			case EnumerationsPackage.PERIOD__SECOND:
				return second != SECOND_EDEFAULT;
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
		result.append(" (nanosecond: ");
		result.append(nanosecond);
		result.append(", second: ");
		result.append(second);
		result.append(')');
		return result.toString();
	}

} // Period
/**
 */
package enumerations;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}</li>
 *   <li>{@link enumerations.Period#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Period extends Object implements Object
{
	/**
	 * The default value of the '{@link #getNanosecond() <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanosecond()
	 * @generated
	 * @ordered
	 */
	protected static final long NANOSECOND_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNanosecond() <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanosecond()
	 * @generated
	 * @ordered
	 */
	protected long nanosecond = NANOSECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected int second = SECOND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Period()
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
		return EnumerationsPackage.Literals.PERIOD;
	}

	/**
	 * Returns the value of the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nanosecond</em>' attribute.
	 * @see #setNanosecond(long)
	 * @generated
	 */
	public long getNanosecond()
	{
		return nanosecond;
	}

	/**
	 * Sets the value of the '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newNanosecond the new value of the '<em>Nanosecond</em>' attribute.
	 * @see #getNanosecond()
	 * @generated
	 */
	public void setNanosecond(long newNanosecond)
	{
		nanosecond = newNanosecond;
	}

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(int)
	 * @generated
	 */
	public int getSecond()
	{
		return second;
	}

	/**
	 * Sets the value of the '{@link enumerations.Period#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSecond the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	public void setSecond(int newSecond)
	{
		second = newSecond;
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				return getNanosecond();
			case EnumerationsPackage.PERIOD__SECOND:
				return getSecond();
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				setNanosecond((Long)newValue);
				return;
			case EnumerationsPackage.PERIOD__SECOND:
				setSecond((Integer)newValue);
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				setNanosecond(NANOSECOND_EDEFAULT);
				return;
			case EnumerationsPackage.PERIOD__SECOND:
				setSecond(SECOND_EDEFAULT);
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				return nanosecond != NANOSECOND_EDEFAULT;
			case EnumerationsPackage.PERIOD__SECOND:
				return second != SECOND_EDEFAULT;
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
		result.append(" (nanosecond: ");
		result.append(nanosecond);
		result.append(", second: ");
		result.append(second);
		result.append(')');
		return result.toString();
	}

} // Period
/**
 */
package enumerations;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}</li>
 *   <li>{@link enumerations.Period#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Period extends Object implements Object
{
	/**
	 * The default value of the '{@link #getNanosecond() <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanosecond()
	 * @generated
	 * @ordered
	 */
	protected static final long NANOSECOND_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNanosecond() <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanosecond()
	 * @generated
	 * @ordered
	 */
	protected long nanosecond = NANOSECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected int second = SECOND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Period()
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
		return EnumerationsPackage.Literals.PERIOD;
	}

	/**
	 * Returns the value of the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nanosecond</em>' attribute.
	 * @see #setNanosecond(long)
	 * @generated
	 */
	public long getNanosecond()
	{
		return nanosecond;
	}

	/**
	 * Sets the value of the '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newNanosecond the new value of the '<em>Nanosecond</em>' attribute.
	 * @see #getNanosecond()
	 * @generated
	 */
	public void setNanosecond(long newNanosecond)
	{
		nanosecond = newNanosecond;
	}

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(int)
	 * @generated
	 */
	public int getSecond()
	{
		return second;
	}

	/**
	 * Sets the value of the '{@link enumerations.Period#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSecond the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	public void setSecond(int newSecond)
	{
		second = newSecond;
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				return getNanosecond();
			case EnumerationsPackage.PERIOD__SECOND:
				return getSecond();
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				setNanosecond((Long)newValue);
				return;
			case EnumerationsPackage.PERIOD__SECOND:
				setSecond((Integer)newValue);
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				setNanosecond(NANOSECOND_EDEFAULT);
				return;
			case EnumerationsPackage.PERIOD__SECOND:
				setSecond(SECOND_EDEFAULT);
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				return nanosecond != NANOSECOND_EDEFAULT;
			case EnumerationsPackage.PERIOD__SECOND:
				return second != SECOND_EDEFAULT;
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
		result.append(" (nanosecond: ");
		result.append(nanosecond);
		result.append(", second: ");
		result.append(second);
		result.append(')');
		return result.toString();
	}

} // Period
/**
 */
package enumerations;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}</li>
 *   <li>{@link enumerations.Period#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Period extends Object implements Object
{
	/**
	 * The default value of the '{@link #getNanosecond() <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanosecond()
	 * @generated
	 * @ordered
	 */
	protected static final long NANOSECOND_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNanosecond() <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanosecond()
	 * @generated
	 * @ordered
	 */
	protected long nanosecond = NANOSECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected int second = SECOND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Period()
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
		return EnumerationsPackage.Literals.PERIOD;
	}

	/**
	 * Returns the value of the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nanosecond</em>' attribute.
	 * @see #setNanosecond(long)
	 * @generated
	 */
	public long getNanosecond()
	{
		return nanosecond;
	}

	/**
	 * Sets the value of the '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newNanosecond the new value of the '<em>Nanosecond</em>' attribute.
	 * @see #getNanosecond()
	 * @generated
	 */
	public void setNanosecond(long newNanosecond)
	{
		nanosecond = newNanosecond;
	}

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(int)
	 * @generated
	 */
	public int getSecond()
	{
		return second;
	}

	/**
	 * Sets the value of the '{@link enumerations.Period#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSecond the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	public void setSecond(int newSecond)
	{
		second = newSecond;
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				return getNanosecond();
			case EnumerationsPackage.PERIOD__SECOND:
				return getSecond();
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				setNanosecond((Long)newValue);
				return;
			case EnumerationsPackage.PERIOD__SECOND:
				setSecond((Integer)newValue);
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				setNanosecond(NANOSECOND_EDEFAULT);
				return;
			case EnumerationsPackage.PERIOD__SECOND:
				setSecond(SECOND_EDEFAULT);
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
			case EnumerationsPackage.PERIOD__NANOSECOND:
				return nanosecond != NANOSECOND_EDEFAULT;
			case EnumerationsPackage.PERIOD__SECOND:
				return second != SECOND_EDEFAULT;
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
		result.append(" (nanosecond: ");
		result.append(nanosecond);
		result.append(", second: ");
		result.append(second);
		result.append(')');
		return result.toString();
	}

} // Period
