/**
 */
package argumentation.impl;

import argumentation.ArgumentationPackage;
import argumentation.Persuadee;
import argumentation.PersuadeeArgumentationFramework;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persuadee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link argumentation.impl.PersuadeeImpl#getHasPersuadeeArgumentationFramework <em>Has Persuadee Argumentation Framework</em>}</li>
 *   <li>{@link argumentation.impl.PersuadeeImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersuadeeImpl extends EObjectImpl implements Persuadee
{
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersuadeeImpl()
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
		return ArgumentationPackage.Literals.PERSUADEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersuadeeArgumentationFramework getHasPersuadeeArgumentationFramework()
	{
		if (eContainerFeatureID() != ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK) return null;
		return (PersuadeeArgumentationFramework)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPersuadeeArgumentationFramework(PersuadeeArgumentationFramework newHasPersuadeeArgumentationFramework, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newHasPersuadeeArgumentationFramework, ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPersuadeeArgumentationFramework(PersuadeeArgumentationFramework newHasPersuadeeArgumentationFramework)
	{
		if (newHasPersuadeeArgumentationFramework != eInternalContainer() || (eContainerFeatureID() != ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK && newHasPersuadeeArgumentationFramework != null))
		{
			if (EcoreUtil.isAncestor(this, newHasPersuadeeArgumentationFramework))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHasPersuadeeArgumentationFramework != null)
				msgs = ((InternalEObject)newHasPersuadeeArgumentationFramework).eInverseAdd(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE, PersuadeeArgumentationFramework.class, msgs);
			msgs = basicSetHasPersuadeeArgumentationFramework(newHasPersuadeeArgumentationFramework, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK, newHasPersuadeeArgumentationFramework, newHasPersuadeeArgumentationFramework));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.PERSUADEE__ID, oldID, id));
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
			case ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHasPersuadeeArgumentationFramework((PersuadeeArgumentationFramework)otherEnd, msgs);
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
			case ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK:
				return basicSetHasPersuadeeArgumentationFramework(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK:
				return eInternalContainer().eInverseRemove(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE, PersuadeeArgumentationFramework.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK:
				return getHasPersuadeeArgumentationFramework();
			case ArgumentationPackage.PERSUADEE__ID:
				return getID();
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
			case ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK:
				setHasPersuadeeArgumentationFramework((PersuadeeArgumentationFramework)newValue);
				return;
			case ArgumentationPackage.PERSUADEE__ID:
				setID((Integer)newValue);
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
			case ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK:
				setHasPersuadeeArgumentationFramework((PersuadeeArgumentationFramework)null);
				return;
			case ArgumentationPackage.PERSUADEE__ID:
				setID(ID_EDEFAULT);
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
			case ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK:
				return getHasPersuadeeArgumentationFramework() != null;
			case ArgumentationPackage.PERSUADEE__ID:
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PersuadeeImpl
