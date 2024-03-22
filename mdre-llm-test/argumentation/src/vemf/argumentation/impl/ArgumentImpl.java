/**
 */
package argumentation.impl;

import argumentation.Argument;
import argumentation.ArgumentationPackage;
import argumentation.PersuadeeArgumentationFramework;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link argumentation.impl.ArgumentImpl#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link argumentation.impl.ArgumentImpl#getID <em>ID</em>}</li>
 *   <li>{@link argumentation.impl.ArgumentImpl#getAssertArgument <em>Assert Argument</em>}</li>
 *   <li>{@link argumentation.impl.ArgumentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentImpl extends EObjectImpl implements Argument
{
	/**
	 * The cached value of the '{@link #getAttacks() <em>Attacks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> attacks;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssertArgument() <em>Assert Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertArgument()
	 * @generated
	 * @ordered
	 */
	protected PersuadeeArgumentationFramework assertArgument;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentImpl()
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
		return ArgumentationPackage.Literals.ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getAttacks()
	{
		if (attacks == null)
		{
			attacks = new EObjectResolvingEList<Argument>(Argument.class, this, ArgumentationPackage.ARGUMENT__ATTACKS);
		}
		return attacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID)
	{
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ARGUMENT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersuadeeArgumentationFramework getAssertArgument()
	{
		if (assertArgument != null && assertArgument.eIsProxy())
		{
			InternalEObject oldAssertArgument = (InternalEObject)assertArgument;
			assertArgument = (PersuadeeArgumentationFramework)eResolveProxy(oldAssertArgument);
			if (assertArgument != oldAssertArgument)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentationPackage.ARGUMENT__ASSERT_ARGUMENT, oldAssertArgument, assertArgument));
			}
		}
		return assertArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersuadeeArgumentationFramework basicGetAssertArgument()
	{
		return assertArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssertArgument(PersuadeeArgumentationFramework newAssertArgument, NotificationChain msgs)
	{
		PersuadeeArgumentationFramework oldAssertArgument = assertArgument;
		assertArgument = newAssertArgument;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ARGUMENT__ASSERT_ARGUMENT, oldAssertArgument, newAssertArgument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssertArgument(PersuadeeArgumentationFramework newAssertArgument)
	{
		if (newAssertArgument != assertArgument)
		{
			NotificationChain msgs = null;
			if (assertArgument != null)
				msgs = ((InternalEObject)assertArgument).eInverseRemove(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT, PersuadeeArgumentationFramework.class, msgs);
			if (newAssertArgument != null)
				msgs = ((InternalEObject)newAssertArgument).eInverseAdd(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT, PersuadeeArgumentationFramework.class, msgs);
			msgs = basicSetAssertArgument(newAssertArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ARGUMENT__ASSERT_ARGUMENT, newAssertArgument, newAssertArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ARGUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ArgumentationPackage.ARGUMENT__ASSERT_ARGUMENT:
				if (assertArgument != null)
					msgs = ((InternalEObject)assertArgument).eInverseRemove(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT, PersuadeeArgumentationFramework.class, msgs);
				return basicSetAssertArgument((PersuadeeArgumentationFramework)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case ArgumentationPackage.ARGUMENT__ASSERT_ARGUMENT:
				return basicSetAssertArgument(null, msgs);
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
			case ArgumentationPackage.ARGUMENT__ATTACKS:
				return getAttacks();
			case ArgumentationPackage.ARGUMENT__ID:
				return getID();
			case ArgumentationPackage.ARGUMENT__ASSERT_ARGUMENT:
				if (resolve) return getAssertArgument();
				return basicGetAssertArgument();
			case ArgumentationPackage.ARGUMENT__NAME:
				return getName();
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
			case ArgumentationPackage.ARGUMENT__ATTACKS:
				getAttacks().clear();
				getAttacks().addAll((Collection<? extends Argument>)newValue);
				return;
			case ArgumentationPackage.ARGUMENT__ID:
				setID((Integer)newValue);
				return;
			case ArgumentationPackage.ARGUMENT__ASSERT_ARGUMENT:
				setAssertArgument((PersuadeeArgumentationFramework)newValue);
				return;
			case ArgumentationPackage.ARGUMENT__NAME:
				setName((String)newValue);
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
			case ArgumentationPackage.ARGUMENT__ATTACKS:
				getAttacks().clear();
				return;
			case ArgumentationPackage.ARGUMENT__ID:
				setID(ID_EDEFAULT);
				return;
			case ArgumentationPackage.ARGUMENT__ASSERT_ARGUMENT:
				setAssertArgument((PersuadeeArgumentationFramework)null);
				return;
			case ArgumentationPackage.ARGUMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case ArgumentationPackage.ARGUMENT__ATTACKS:
				return attacks != null && !attacks.isEmpty();
			case ArgumentationPackage.ARGUMENT__ID:
				return id != ID_EDEFAULT;
			case ArgumentationPackage.ARGUMENT__ASSERT_ARGUMENT:
				return assertArgument != null;
			case ArgumentationPackage.ARGUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ArgumentImpl
