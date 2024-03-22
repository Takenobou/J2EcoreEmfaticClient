/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.Declaration;
import statemachine.StateMachine;
import statemachine.StateMachineVariable;
import statemachine.StatemachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getMachineVariables <em>Machine Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends EObjectImpl implements StateMachine
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
	protected StateMachineImpl()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, StatemachinePackage.STATE_MACHINE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineVariable> getMachineVariables()
	{
		if (machineVariables == null)
		{
			machineVariables = new EObjectContainmentEList<StateMachineVariable>(StateMachineVariable.class, this, StatemachinePackage.STATE_MACHINE__MACHINE_VARIABLES);
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

} //StateMachineImpl
