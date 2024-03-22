/**
 */
package argumentation.impl;

import argumentation.Argument;
import argumentation.ArgumentationFramework;
import argumentation.ArgumentationPackage;
import argumentation.Persuader;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persuader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link argumentation.impl.PersuaderImpl#getHasArgumentationFramework <em>Has Argumentation Framework</em>}</li>
 *   <li>{@link argumentation.impl.PersuaderImpl#getID <em>ID</em>}</li>
 *   <li>{@link argumentation.impl.PersuaderImpl#getPutsForward <em>Puts Forward</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersuaderImpl extends EObjectImpl implements Persuader
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
	 * The cached value of the '{@link #getPutsForward() <em>Puts Forward</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPutsForward()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> putsForward;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersuaderImpl()
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
		return ArgumentationPackage.Literals.PERSUADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationFramework getHasArgumentationFramework()
	{
		if (eContainerFeatureID() != ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK) return null;
		return (ArgumentationFramework)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasArgumentationFramework(ArgumentationFramework newHasArgumentationFramework, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newHasArgumentationFramework, ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasArgumentationFramework(ArgumentationFramework newHasArgumentationFramework)
	{
		if (newHasArgumentationFramework != eInternalContainer() || (eContainerFeatureID() != ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK && newHasArgumentationFramework != null))
		{
			if (EcoreUtil.isAncestor(this, newHasArgumentationFramework))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHasArgumentationFramework != null)
				msgs = ((InternalEObject)newHasArgumentationFramework).eInverseAdd(this, ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER, ArgumentationFramework.class, msgs);
			msgs = basicSetHasArgumentationFramework(newHasArgumentationFramework, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK, newHasArgumentationFramework, newHasArgumentationFramework));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.PERSUADER__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getPutsForward()
	{
		if (putsForward == null)
		{
			putsForward = new EObjectResolvingEList<Argument>(Argument.class, this, ArgumentationPackage.PERSUADER__PUTS_FORWARD);
		}
		return putsForward;
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
			case ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHasArgumentationFramework((ArgumentationFramework)otherEnd, msgs);
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
			case ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK:
				return basicSetHasArgumentationFramework(null, msgs);
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
			case ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK:
				return eInternalContainer().eInverseRemove(this, ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER, ArgumentationFramework.class, msgs);
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
			case ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK:
				return getHasArgumentationFramework();
			case ArgumentationPackage.PERSUADER__ID:
				return getID();
			case ArgumentationPackage.PERSUADER__PUTS_FORWARD:
				return getPutsForward();
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
			case ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK:
				setHasArgumentationFramework((ArgumentationFramework)newValue);
				return;
			case ArgumentationPackage.PERSUADER__ID:
				setID((Integer)newValue);
				return;
			case ArgumentationPackage.PERSUADER__PUTS_FORWARD:
				getPutsForward().clear();
				getPutsForward().addAll((Collection<? extends Argument>)newValue);
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
			case ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK:
				setHasArgumentationFramework((ArgumentationFramework)null);
				return;
			case ArgumentationPackage.PERSUADER__ID:
				setID(ID_EDEFAULT);
				return;
			case ArgumentationPackage.PERSUADER__PUTS_FORWARD:
				getPutsForward().clear();
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
			case ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK:
				return getHasArgumentationFramework() != null;
			case ArgumentationPackage.PERSUADER__ID:
				return id != ID_EDEFAULT;
			case ArgumentationPackage.PERSUADER__PUTS_FORWARD:
				return putsForward != null && !putsForward.isEmpty();
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

} //PersuaderImpl
