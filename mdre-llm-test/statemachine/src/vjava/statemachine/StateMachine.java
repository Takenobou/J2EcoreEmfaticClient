/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
/**
 */
package statemachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class StateMachine extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getMachineVariables() <em>Machine Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineVariable> machineVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @generated
	 */
	public List<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new BasicInternalEList<Declaration>(Declaration.class);
		}
		return declarations;
	}

	/**
	 * Returns the value of the '<em><b>Machine Variables</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.StateMachineVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Variables</em>' containment reference list.
	 * @generated
	 */
	public List<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new BasicInternalEList<StateMachineVariable>(StateMachineVariable.class);
		}
		return machineVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReachable()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return ((InternalEList<?>)getMachineVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return getDeclarations();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return getMachineVariables();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
				getMachineVariables().addAll((Collection<? extends StateMachineVariable>)newValue);
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				getMachineVariables().clear();
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
			case StatemachinePackage.STATE_MACHINE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES:
				return machineVariables != null && !machineVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
