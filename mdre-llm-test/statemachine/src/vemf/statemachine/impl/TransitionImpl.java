/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
/**
 */
package statemachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.impl.TransitionImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends DeclarationImpl implements Transition
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
	protected TransitionImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLabel()
	{
		return sourceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLabel(String newSourceLabel)
	{
		String oldSourceLabel = sourceLabel;
		sourceLabel = newSourceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE_LABEL, oldSourceLabel, sourceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel)
	{
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET_LABEL, oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource)
	{
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget)
	{
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardLabel()
	{
		return guardLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardLabel(String newGuardLabel)
	{
		String oldGuardLabel = guardLabel;
		guardLabel = newGuardLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_LABEL, oldGuardLabel, guardLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionLabel()
	{
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(String newActionLabel)
	{
		String oldActionLabel = actionLabel;
		actionLabel = newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression()
	{
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression)
	{
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement()
	{
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement)
	{
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION_STATEMENT, oldActionStatement, actionStatement));
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

} //TransitionImpl
