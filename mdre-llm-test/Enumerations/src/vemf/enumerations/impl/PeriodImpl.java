/**
 */
package enumerations.impl;

import enumerations.EnumerationsPackage;
import enumerations.Period;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enumerations.impl.PeriodImpl#getNanosecond <em>Nanosecond</em>}</li>
 *   <li>{@link enumerations.impl.PeriodImpl#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodImpl extends EObjectImpl implements Period
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
	protected PeriodImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNanosecond()
	{
		return nanosecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNanosecond(long newNanosecond)
	{
		long oldNanosecond = nanosecond;
		nanosecond = newNanosecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnumerationsPackage.PERIOD__NANOSECOND, oldNanosecond, nanosecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecond()
	{
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(int newSecond)
	{
		int oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnumerationsPackage.PERIOD__SECOND, oldSecond, second));
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

} //PeriodImpl
/**
 */
package enumerations.impl;

import enumerations.EnumerationsPackage;
import enumerations.Period;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enumerations.impl.PeriodImpl#getNanosecond <em>Nanosecond</em>}</li>
 *   <li>{@link enumerations.impl.PeriodImpl#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodImpl extends EObjectImpl implements Period
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
	protected PeriodImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNanosecond()
	{
		return nanosecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNanosecond(long newNanosecond)
	{
		long oldNanosecond = nanosecond;
		nanosecond = newNanosecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnumerationsPackage.PERIOD__NANOSECOND, oldNanosecond, nanosecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecond()
	{
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(int newSecond)
	{
		int oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnumerationsPackage.PERIOD__SECOND, oldSecond, second));
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

} //PeriodImpl
/**
 */
package enumerations.impl;

import enumerations.EnumerationsPackage;
import enumerations.Period;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enumerations.impl.PeriodImpl#getNanosecond <em>Nanosecond</em>}</li>
 *   <li>{@link enumerations.impl.PeriodImpl#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodImpl extends EObjectImpl implements Period
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
	protected PeriodImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNanosecond()
	{
		return nanosecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNanosecond(long newNanosecond)
	{
		long oldNanosecond = nanosecond;
		nanosecond = newNanosecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnumerationsPackage.PERIOD__NANOSECOND, oldNanosecond, nanosecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecond()
	{
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(int newSecond)
	{
		int oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnumerationsPackage.PERIOD__SECOND, oldSecond, second));
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

} //PeriodImpl
/**
 */
package enumerations.impl;

import enumerations.EnumerationsPackage;
import enumerations.Period;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enumerations.impl.PeriodImpl#getNanosecond <em>Nanosecond</em>}</li>
 *   <li>{@link enumerations.impl.PeriodImpl#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodImpl extends EObjectImpl implements Period
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
	protected PeriodImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNanosecond()
	{
		return nanosecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNanosecond(long newNanosecond)
	{
		long oldNanosecond = nanosecond;
		nanosecond = newNanosecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnumerationsPackage.PERIOD__NANOSECOND, oldNanosecond, nanosecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecond()
	{
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(int newSecond)
	{
		int oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnumerationsPackage.PERIOD__SECOND, oldSecond, second));
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

} //PeriodImpl
