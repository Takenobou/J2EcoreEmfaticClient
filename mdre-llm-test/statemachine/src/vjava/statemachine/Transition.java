/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition extends Declaration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLabel()
	 * @generated
	 * @ordered
	 */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The default value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardLabel() <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardLabel()
	 * @generated
	 * @ordered
	 */
	protected String guardLabel = GUARD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return StatemachinePackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		label = newLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSourceLabel the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		sourceLabel = newSourceLabel;
	}

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetLabel the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		targetLabel = newTargetLabel;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && ((EObject)source).eIsProxy())
		{
			InternalEObject oldSource = source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource()
	{
		return source;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSource the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(State newSource)
	{
		source = newSource;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && ((EObject)target).eIsProxy())
		{
			InternalEObject oldTarget = target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTarget the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		target = newTarget;
	}

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardLabel the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		guardLabel = newGuardLabel;
	}

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionLabel the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		actionLabel = newActionLabel;
	}

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGuardExpression the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		guardExpression = newGuardExpression;
	}

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newActionStatement the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		actionStatement = newActionStatement;
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
			case StatemachinePackage.TRANSITION__LABEL:
				return getLabel();
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return getSourceLabel();
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return getTargetLabel();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return getGuardLabel();
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return getActionStatement();
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement((String)newValue);
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
			case StatemachinePackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				setSourceLabel(SOURCE_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				setTargetLabel(TARGET_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				setGuardLabel(GUARD_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.TRANSITION__SOURCE_LABEL:
				return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
			case StatemachinePackage.TRANSITION__TARGET_LABEL:
				return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__GUARD_LABEL:
				return GUARD_LABEL_EDEFAULT == null ? guardLabel != null : !GUARD_LABEL_EDEFAULT.equals(guardLabel);
			case StatemachinePackage.TRANSITION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case StatemachinePackage.TRANSITION__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", sourceLabel: ");
		result.append(sourceLabel);
		result.append(", targetLabel: ");
		result.append(targetLabel);
		result.append(", guardLabel: ");
		result.append(guardLabel);
		result.append(", actionLabel: ");
		result.append(actionLabel);
		result.append(", guardExpression: ");
		result.append(guardExpression);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Transition
