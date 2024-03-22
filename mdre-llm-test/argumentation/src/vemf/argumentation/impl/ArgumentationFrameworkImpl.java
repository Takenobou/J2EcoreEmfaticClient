/**
 */
package argumentation.impl;

import argumentation.Argument;
import argumentation.ArgumentationFramework;
import argumentation.ArgumentationPackage;
import argumentation.PersuadeeArgumentationFramework;
import argumentation.Persuader;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link argumentation.impl.ArgumentationFrameworkImpl#getPersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}</li>
 *   <li>{@link argumentation.impl.ArgumentationFrameworkImpl#getHasPersuader <em>Has Persuader</em>}</li>
 *   <li>{@link argumentation.impl.ArgumentationFrameworkImpl#getID <em>ID</em>}</li>
 *   <li>{@link argumentation.impl.ArgumentationFrameworkImpl#getHasArgument <em>Has Argument</em>}</li>
 *   <li>{@link argumentation.impl.ArgumentationFrameworkImpl#getHasTopic <em>Has Topic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentationFrameworkImpl extends EObjectImpl implements ArgumentationFramework
{
	/**
	 * The cached value of the '{@link #getPersuadeeArgumentationFramework() <em>Persuadee Argumentation Framework</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersuadeeArgumentationFramework()
	 * @generated
	 * @ordered
	 */
	protected EList<PersuadeeArgumentationFramework> persuadeeArgumentationFramework;

	/**
	 * The cached value of the '{@link #getHasPersuader() <em>Has Persuader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPersuader()
	 * @generated
	 * @ordered
	 */
	protected Persuader hasPersuader;

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
	 * The cached value of the '{@link #getHasArgument() <em>Has Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> hasArgument;

	/**
	 * The cached value of the '{@link #getHasTopic() <em>Has Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTopic()
	 * @generated
	 * @ordered
	 */
	protected Argument hasTopic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentationFrameworkImpl()
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
		return ArgumentationPackage.Literals.ARGUMENTATION_FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersuadeeArgumentationFramework> getPersuadeeArgumentationFramework()
	{
		if (persuadeeArgumentationFramework == null)
		{
			persuadeeArgumentationFramework = new EObjectContainmentEList<PersuadeeArgumentationFramework>(PersuadeeArgumentationFramework.class, this, ArgumentationPackage.ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK);
		}
		return persuadeeArgumentationFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persuader getHasPersuader()
	{
		return hasPersuader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPersuader(Persuader newHasPersuader, NotificationChain msgs)
	{
		Persuader oldHasPersuader = hasPersuader;
		hasPersuader = newHasPersuader;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER, oldHasPersuader, newHasPersuader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPersuader(Persuader newHasPersuader)
	{
		if (newHasPersuader != hasPersuader)
		{
			NotificationChain msgs = null;
			if (hasPersuader != null)
				msgs = ((InternalEObject)hasPersuader).eInverseRemove(this, ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK, Persuader.class, msgs);
			if (newHasPersuader != null)
				msgs = ((InternalEObject)newHasPersuader).eInverseAdd(this, ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK, Persuader.class, msgs);
			msgs = basicSetHasPersuader(newHasPersuader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER, newHasPersuader, newHasPersuader));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ARGUMENTATION_FRAMEWORK__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getHasArgument()
	{
		if (hasArgument == null)
		{
			hasArgument = new EObjectContainmentEList<Argument>(Argument.class, this, ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT);
		}
		return hasArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument getHasTopic()
	{
		if (hasTopic != null && hasTopic.eIsProxy())
		{
			InternalEObject oldHasTopic = (InternalEObject)hasTopic;
			hasTopic = (Argument)eResolveProxy(oldHasTopic);
			if (hasTopic != oldHasTopic)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_TOPIC, oldHasTopic, hasTopic));
			}
		}
		return hasTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument basicGetHasTopic()
	{
		return hasTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTopic(Argument newHasTopic)
	{
		Argument oldHasTopic = hasTopic;
		hasTopic = newHasTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_TOPIC, oldHasTopic, hasTopic));
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
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER:
				if (hasPersuader != null)
					msgs = ((InternalEObject)hasPersuader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER, null, msgs);
				return basicSetHasPersuader((Persuader)otherEnd, msgs);
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
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK:
				return ((InternalEList<?>)getPersuadeeArgumentationFramework()).basicRemove(otherEnd, msgs);
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER:
				return basicSetHasPersuader(null, msgs);
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT:
				return ((InternalEList<?>)getHasArgument()).basicRemove(otherEnd, msgs);
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
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK:
				return getPersuadeeArgumentationFramework();
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER:
				return getHasPersuader();
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__ID:
				return getID();
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT:
				return getHasArgument();
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_TOPIC:
				if (resolve) return getHasTopic();
				return basicGetHasTopic();
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
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK:
				getPersuadeeArgumentationFramework().clear();
				getPersuadeeArgumentationFramework().addAll((Collection<? extends PersuadeeArgumentationFramework>)newValue);
				return;
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER:
				setHasPersuader((Persuader)newValue);
				return;
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__ID:
				setID((Integer)newValue);
				return;
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT:
				getHasArgument().clear();
				getHasArgument().addAll((Collection<? extends Argument>)newValue);
				return;
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_TOPIC:
				setHasTopic((Argument)newValue);
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
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK:
				getPersuadeeArgumentationFramework().clear();
				return;
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER:
				setHasPersuader((Persuader)null);
				return;
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__ID:
				setID(ID_EDEFAULT);
				return;
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT:
				getHasArgument().clear();
				return;
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_TOPIC:
				setHasTopic((Argument)null);
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
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK:
				return persuadeeArgumentationFramework != null && !persuadeeArgumentationFramework.isEmpty();
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER:
				return hasPersuader != null;
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__ID:
				return id != ID_EDEFAULT;
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT:
				return hasArgument != null && !hasArgument.isEmpty();
			case ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_TOPIC:
				return hasTopic != null;
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
		result.append(')');
		return result.toString();
	}

} //ArgumentationFrameworkImpl
