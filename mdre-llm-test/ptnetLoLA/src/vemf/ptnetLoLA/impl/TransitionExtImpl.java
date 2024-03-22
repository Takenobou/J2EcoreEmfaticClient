/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ptnetLoLA.Confidentiality;
import ptnetLoLA.PtnetLoLAPackage;
import ptnetLoLA.TransitionExt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExtImpl extends TransitionImpl implements TransitionExt
{
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected int minTime = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected int maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final Confidentiality CONFIDENTIALITY_EDEFAULT = Confidentiality.UNKNOWN;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected Confidentiality confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionExtImpl()
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
		return PtnetLoLAPackage.Literals.TRANSITION_EXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		int oldMinTime = minTime;
		minTime = newMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME, oldMinTime, minTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost)
	{
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		int oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME, oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		Confidentiality oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY, oldConfidentiality, confidentiality));
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return getProbability();
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return getMinTime();
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return getCost();
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return getMaxTime();
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return getConfidentiality();
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality((Confidentiality)newValue);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime(MIN_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost(COST_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime(MAX_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality(CONFIDENTIALITY_EDEFAULT);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return minTime != MIN_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return cost != COST_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return maxTime != MAX_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return confidentiality != CONFIDENTIALITY_EDEFAULT;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(", minTime: ");
		result.append(minTime);
		result.append(", cost: ");
		result.append(cost);
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(", confidentiality: ");
		result.append(confidentiality);
		result.append(')');
		return result.toString();
	}

} //TransitionExtImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ptnetLoLA.Confidentiality;
import ptnetLoLA.PtnetLoLAPackage;
import ptnetLoLA.TransitionExt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExtImpl extends TransitionImpl implements TransitionExt
{
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected int minTime = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected int maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final Confidentiality CONFIDENTIALITY_EDEFAULT = Confidentiality.UNKNOWN;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected Confidentiality confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionExtImpl()
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
		return PtnetLoLAPackage.Literals.TRANSITION_EXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		int oldMinTime = minTime;
		minTime = newMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME, oldMinTime, minTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost)
	{
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		int oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME, oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		Confidentiality oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY, oldConfidentiality, confidentiality));
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return getProbability();
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return getMinTime();
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return getCost();
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return getMaxTime();
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return getConfidentiality();
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality((Confidentiality)newValue);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime(MIN_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost(COST_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime(MAX_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality(CONFIDENTIALITY_EDEFAULT);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return minTime != MIN_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return cost != COST_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return maxTime != MAX_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return confidentiality != CONFIDENTIALITY_EDEFAULT;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(", minTime: ");
		result.append(minTime);
		result.append(", cost: ");
		result.append(cost);
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(", confidentiality: ");
		result.append(confidentiality);
		result.append(')');
		return result.toString();
	}

} //TransitionExtImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ptnetLoLA.Confidentiality;
import ptnetLoLA.PtnetLoLAPackage;
import ptnetLoLA.TransitionExt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExtImpl extends TransitionImpl implements TransitionExt
{
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected int minTime = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected int maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final Confidentiality CONFIDENTIALITY_EDEFAULT = Confidentiality.UNKNOWN;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected Confidentiality confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionExtImpl()
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
		return PtnetLoLAPackage.Literals.TRANSITION_EXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		int oldMinTime = minTime;
		minTime = newMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME, oldMinTime, minTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost)
	{
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		int oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME, oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		Confidentiality oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY, oldConfidentiality, confidentiality));
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return getProbability();
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return getMinTime();
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return getCost();
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return getMaxTime();
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return getConfidentiality();
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality((Confidentiality)newValue);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime(MIN_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost(COST_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime(MAX_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality(CONFIDENTIALITY_EDEFAULT);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return minTime != MIN_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return cost != COST_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return maxTime != MAX_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return confidentiality != CONFIDENTIALITY_EDEFAULT;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(", minTime: ");
		result.append(minTime);
		result.append(", cost: ");
		result.append(cost);
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(", confidentiality: ");
		result.append(confidentiality);
		result.append(')');
		return result.toString();
	}

} //TransitionExtImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ptnetLoLA.Confidentiality;
import ptnetLoLA.PtnetLoLAPackage;
import ptnetLoLA.TransitionExt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExtImpl extends TransitionImpl implements TransitionExt
{
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected int minTime = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected int maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final Confidentiality CONFIDENTIALITY_EDEFAULT = Confidentiality.UNKNOWN;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected Confidentiality confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionExtImpl()
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
		return PtnetLoLAPackage.Literals.TRANSITION_EXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		int oldMinTime = minTime;
		minTime = newMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME, oldMinTime, minTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost)
	{
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		int oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME, oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		Confidentiality oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY, oldConfidentiality, confidentiality));
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return getProbability();
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return getMinTime();
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return getCost();
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return getMaxTime();
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return getConfidentiality();
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality((Confidentiality)newValue);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime(MIN_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost(COST_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime(MAX_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality(CONFIDENTIALITY_EDEFAULT);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return minTime != MIN_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return cost != COST_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return maxTime != MAX_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return confidentiality != CONFIDENTIALITY_EDEFAULT;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(", minTime: ");
		result.append(minTime);
		result.append(", cost: ");
		result.append(cost);
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(", confidentiality: ");
		result.append(confidentiality);
		result.append(')');
		return result.toString();
	}

} //TransitionExtImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ptnetLoLA.Confidentiality;
import ptnetLoLA.PtnetLoLAPackage;
import ptnetLoLA.TransitionExt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExtImpl extends TransitionImpl implements TransitionExt
{
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected int minTime = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected int maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final Confidentiality CONFIDENTIALITY_EDEFAULT = Confidentiality.UNKNOWN;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected Confidentiality confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionExtImpl()
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
		return PtnetLoLAPackage.Literals.TRANSITION_EXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		int oldMinTime = minTime;
		minTime = newMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME, oldMinTime, minTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost)
	{
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		int oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME, oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		Confidentiality oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY, oldConfidentiality, confidentiality));
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return getProbability();
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return getMinTime();
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return getCost();
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return getMaxTime();
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return getConfidentiality();
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality((Confidentiality)newValue);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime(MIN_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost(COST_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime(MAX_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality(CONFIDENTIALITY_EDEFAULT);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return minTime != MIN_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return cost != COST_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return maxTime != MAX_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return confidentiality != CONFIDENTIALITY_EDEFAULT;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(", minTime: ");
		result.append(minTime);
		result.append(", cost: ");
		result.append(cost);
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(", confidentiality: ");
		result.append(confidentiality);
		result.append(')');
		return result.toString();
	}

} //TransitionExtImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ptnetLoLA.Confidentiality;
import ptnetLoLA.PtnetLoLAPackage;
import ptnetLoLA.TransitionExt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExtImpl extends TransitionImpl implements TransitionExt
{
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected int minTime = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected int maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final Confidentiality CONFIDENTIALITY_EDEFAULT = Confidentiality.UNKNOWN;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected Confidentiality confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionExtImpl()
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
		return PtnetLoLAPackage.Literals.TRANSITION_EXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		int oldMinTime = minTime;
		minTime = newMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME, oldMinTime, minTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost)
	{
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		int oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME, oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		Confidentiality oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY, oldConfidentiality, confidentiality));
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return getProbability();
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return getMinTime();
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return getCost();
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return getMaxTime();
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return getConfidentiality();
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality((Confidentiality)newValue);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime(MIN_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost(COST_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime(MAX_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality(CONFIDENTIALITY_EDEFAULT);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return minTime != MIN_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return cost != COST_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return maxTime != MAX_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return confidentiality != CONFIDENTIALITY_EDEFAULT;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(", minTime: ");
		result.append(minTime);
		result.append(", cost: ");
		result.append(cost);
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(", confidentiality: ");
		result.append(confidentiality);
		result.append(')');
		return result.toString();
	}

} //TransitionExtImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ptnetLoLA.Confidentiality;
import ptnetLoLA.PtnetLoLAPackage;
import ptnetLoLA.TransitionExt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExtImpl extends TransitionImpl implements TransitionExt
{
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected int minTime = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected int maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final Confidentiality CONFIDENTIALITY_EDEFAULT = Confidentiality.UNKNOWN;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected Confidentiality confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionExtImpl()
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
		return PtnetLoLAPackage.Literals.TRANSITION_EXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		int oldMinTime = minTime;
		minTime = newMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME, oldMinTime, minTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost)
	{
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		int oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME, oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		Confidentiality oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY, oldConfidentiality, confidentiality));
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return getProbability();
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return getMinTime();
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return getCost();
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return getMaxTime();
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return getConfidentiality();
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality((Confidentiality)newValue);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime(MIN_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost(COST_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime(MAX_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality(CONFIDENTIALITY_EDEFAULT);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return minTime != MIN_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return cost != COST_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return maxTime != MAX_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return confidentiality != CONFIDENTIALITY_EDEFAULT;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(", minTime: ");
		result.append(minTime);
		result.append(", cost: ");
		result.append(cost);
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(", confidentiality: ");
		result.append(confidentiality);
		result.append(')');
		return result.toString();
	}

} //TransitionExtImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ptnetLoLA.Confidentiality;
import ptnetLoLA.PtnetLoLAPackage;
import ptnetLoLA.TransitionExt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExtImpl extends TransitionImpl implements TransitionExt
{
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected int minTime = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected int maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final Confidentiality CONFIDENTIALITY_EDEFAULT = Confidentiality.UNKNOWN;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected Confidentiality confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionExtImpl()
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
		return PtnetLoLAPackage.Literals.TRANSITION_EXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		int oldMinTime = minTime;
		minTime = newMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME, oldMinTime, minTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost)
	{
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		int oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME, oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		Confidentiality oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY, oldConfidentiality, confidentiality));
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return getProbability();
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return getMinTime();
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return getCost();
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return getMaxTime();
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return getConfidentiality();
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality((Confidentiality)newValue);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime(MIN_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost(COST_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime(MAX_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality(CONFIDENTIALITY_EDEFAULT);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return minTime != MIN_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return cost != COST_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return maxTime != MAX_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return confidentiality != CONFIDENTIALITY_EDEFAULT;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(", minTime: ");
		result.append(minTime);
		result.append(", cost: ");
		result.append(cost);
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(", confidentiality: ");
		result.append(confidentiality);
		result.append(')');
		return result.toString();
	}

} //TransitionExtImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ptnetLoLA.Confidentiality;
import ptnetLoLA.PtnetLoLAPackage;
import ptnetLoLA.TransitionExt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExtImpl extends TransitionImpl implements TransitionExt
{
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected int minTime = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected int maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final Confidentiality CONFIDENTIALITY_EDEFAULT = Confidentiality.UNKNOWN;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected Confidentiality confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionExtImpl()
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
		return PtnetLoLAPackage.Literals.TRANSITION_EXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		int oldMinTime = minTime;
		minTime = newMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME, oldMinTime, minTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost)
	{
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		int oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME, oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		Confidentiality oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY, oldConfidentiality, confidentiality));
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return getProbability();
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return getMinTime();
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return getCost();
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return getMaxTime();
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return getConfidentiality();
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality((Confidentiality)newValue);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime(MIN_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost(COST_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime(MAX_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality(CONFIDENTIALITY_EDEFAULT);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return minTime != MIN_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return cost != COST_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return maxTime != MAX_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return confidentiality != CONFIDENTIALITY_EDEFAULT;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(", minTime: ");
		result.append(minTime);
		result.append(", cost: ");
		result.append(cost);
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(", confidentiality: ");
		result.append(confidentiality);
		result.append(')');
		return result.toString();
	}

} //TransitionExtImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ptnetLoLA.Confidentiality;
import ptnetLoLA.PtnetLoLAPackage;
import ptnetLoLA.TransitionExt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.impl.TransitionExtImpl#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExtImpl extends TransitionImpl implements TransitionExt
{
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected int minTime = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected int maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final Confidentiality CONFIDENTIALITY_EDEFAULT = Confidentiality.UNKNOWN;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected Confidentiality confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionExtImpl()
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
		return PtnetLoLAPackage.Literals.TRANSITION_EXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		int oldMinTime = minTime;
		minTime = newMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME, oldMinTime, minTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost)
	{
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		int oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME, oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		Confidentiality oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY, oldConfidentiality, confidentiality));
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return getProbability();
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return getMinTime();
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return getCost();
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return getMaxTime();
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return getConfidentiality();
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost((Double)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime((Integer)newValue);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality((Confidentiality)newValue);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				setMinTime(MIN_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				setCost(COST_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				setMaxTime(MAX_TIME_EDEFAULT);
				return;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				setConfidentiality(CONFIDENTIALITY_EDEFAULT);
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
			case PtnetLoLAPackage.TRANSITION_EXT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MIN_TIME:
				return minTime != MIN_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__COST:
				return cost != COST_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__MAX_TIME:
				return maxTime != MAX_TIME_EDEFAULT;
			case PtnetLoLAPackage.TRANSITION_EXT__CONFIDENTIALITY:
				return confidentiality != CONFIDENTIALITY_EDEFAULT;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(", minTime: ");
		result.append(minTime);
		result.append(", cost: ");
		result.append(cost);
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(", confidentiality: ");
		result.append(confidentiality);
		result.append(')');
		return result.toString();
	}

} //TransitionExtImpl
