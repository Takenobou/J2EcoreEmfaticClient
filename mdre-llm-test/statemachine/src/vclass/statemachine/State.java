/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
/**
 */
package statemachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model kind="class" abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public abstract class State extends Declaration
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<State> successors;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<State> reachable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLabel the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__LABEL, oldLabel, label));
	}

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	public EList<State> getSuccessors()
	{
		if (successors == null)
		{
			successors = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public EList<State> getReachable()
	{
		if (reachable == null)
		{
			reachable = new EObjectResolvingEList<State>(State.class, this, StatemachinePackage.STATE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__ID, oldId, id));
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
			case StatemachinePackage.STATE__LABEL:
				return getLabel();
			case StatemachinePackage.STATE__SUCCESSORS:
				return getSuccessors();
			case StatemachinePackage.STATE__REACHABLE:
				return getReachable();
			case StatemachinePackage.STATE__ID:
				return getId();
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
			case StatemachinePackage.STATE__LABEL:
				setLabel((String)newValue);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE__ID:
				setId((Integer)newValue);
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
			case StatemachinePackage.STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatemachinePackage.STATE__SUCCESSORS:
				getSuccessors().clear();
				return;
			case StatemachinePackage.STATE__REACHABLE:
				getReachable().clear();
				return;
			case StatemachinePackage.STATE__ID:
				setId(ID_EDEFAULT);
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
			case StatemachinePackage.STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case StatemachinePackage.STATE__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case StatemachinePackage.STATE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case StatemachinePackage.STATE__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // State
