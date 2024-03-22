/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Action#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Action#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Action extends Object implements Object
{
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
	protected Action()
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
		return StatemachinePackage.Literals.ACTION;
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
	 * Sets the value of the '{@link statemachine.Action#getActionLabel <em>Action Label</em>}' attribute.
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
	 * Sets the value of the '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}' attribute.
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return getActionLabel();
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel((String)newValue);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
			case StatemachinePackage.ACTION__ACTION_LABEL:
				return ACTION_LABEL_EDEFAULT == null ? actionLabel != null : !ACTION_LABEL_EDEFAULT.equals(actionLabel);
			case StatemachinePackage.ACTION__ACTION_STATEMENT:
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} // Action
