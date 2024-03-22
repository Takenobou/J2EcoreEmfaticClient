/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExt extends Transition
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
	protected TransitionExt()
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
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProbability the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		probability = newProbability;
	}

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMinTime the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		minTime = newMinTime;
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCost the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(double newCost)
	{
		cost = newCost;
	}

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMaxTime the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		maxTime = newMaxTime;
	}

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newConfidentiality the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
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

} // TransitionExt
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExt extends Transition
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
	protected TransitionExt()
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
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProbability the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		probability = newProbability;
	}

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMinTime the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		minTime = newMinTime;
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCost the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(double newCost)
	{
		cost = newCost;
	}

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMaxTime the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		maxTime = newMaxTime;
	}

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newConfidentiality the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
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

} // TransitionExt
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExt extends Transition
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
	protected TransitionExt()
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
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProbability the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		probability = newProbability;
	}

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMinTime the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		minTime = newMinTime;
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCost the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(double newCost)
	{
		cost = newCost;
	}

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMaxTime the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		maxTime = newMaxTime;
	}

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newConfidentiality the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
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

} // TransitionExt
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExt extends Transition
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
	protected TransitionExt()
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
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProbability the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		probability = newProbability;
	}

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMinTime the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		minTime = newMinTime;
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCost the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(double newCost)
	{
		cost = newCost;
	}

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMaxTime the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		maxTime = newMaxTime;
	}

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newConfidentiality the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
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

} // TransitionExt
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExt extends Transition
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
	protected TransitionExt()
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
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProbability the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		probability = newProbability;
	}

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMinTime the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		minTime = newMinTime;
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCost the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(double newCost)
	{
		cost = newCost;
	}

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMaxTime the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		maxTime = newMaxTime;
	}

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newConfidentiality the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
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

} // TransitionExt
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExt extends Transition
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
	protected TransitionExt()
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
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProbability the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		probability = newProbability;
	}

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMinTime the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		minTime = newMinTime;
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCost the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(double newCost)
	{
		cost = newCost;
	}

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMaxTime the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		maxTime = newMaxTime;
	}

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newConfidentiality the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
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

} // TransitionExt
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExt extends Transition
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
	protected TransitionExt()
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
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProbability the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		probability = newProbability;
	}

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMinTime the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		minTime = newMinTime;
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCost the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(double newCost)
	{
		cost = newCost;
	}

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMaxTime the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		maxTime = newMaxTime;
	}

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newConfidentiality the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
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

} // TransitionExt
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExt extends Transition
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
	protected TransitionExt()
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
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProbability the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		probability = newProbability;
	}

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMinTime the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		minTime = newMinTime;
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCost the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(double newCost)
	{
		cost = newCost;
	}

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMaxTime the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		maxTime = newMaxTime;
	}

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newConfidentiality the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
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

} // TransitionExt
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExt extends Transition
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
	protected TransitionExt()
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
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProbability the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		probability = newProbability;
	}

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMinTime the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		minTime = newMinTime;
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCost the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(double newCost)
	{
		cost = newCost;
	}

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMaxTime the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		maxTime = newMaxTime;
	}

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newConfidentiality the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
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

} // TransitionExt
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExt extends Transition
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
	protected TransitionExt()
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
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProbability the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		probability = newProbability;
	}

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMinTime the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		minTime = newMinTime;
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCost the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(double newCost)
	{
		cost = newCost;
	}

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMaxTime the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		maxTime = newMaxTime;
	}

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newConfidentiality the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
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

} // TransitionExt
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExt extends Transition
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
	protected TransitionExt()
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
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProbability the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		probability = newProbability;
	}

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMinTime the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		minTime = newMinTime;
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCost the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(double newCost)
	{
		cost = newCost;
	}

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMaxTime the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		maxTime = newMaxTime;
	}

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newConfidentiality the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
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

} // TransitionExt
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExt extends Transition
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
	protected TransitionExt()
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
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @generated
	 */
	public double getProbability()
	{
		return probability;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newProbability the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	public void setProbability(double newProbability)
	{
		probability = newProbability;
	}

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @generated
	 */
	public int getMinTime()
	{
		return minTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMinTime the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	public void setMinTime(int newMinTime)
	{
		minTime = newMinTime;
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @generated
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCost the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(double newCost)
	{
		cost = newCost;
	}

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @generated
	 */
	public int getMaxTime()
	{
		return maxTime;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMaxTime the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	public void setMaxTime(int newMaxTime)
	{
		maxTime = newMaxTime;
	}

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @generated
	 */
	public Confidentiality getConfidentiality()
	{
		return confidentiality;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newConfidentiality the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	public void setConfidentiality(Confidentiality newConfidentiality)
	{
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
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

} // TransitionExt
