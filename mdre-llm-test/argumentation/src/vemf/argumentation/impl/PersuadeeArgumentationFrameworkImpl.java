/**
 */
package argumentation.impl;

import argumentation.Argument;
import argumentation.ArgumentationPackage;
import argumentation.Persuadee;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persuadee Argumentation Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link argumentation.impl.PersuadeeArgumentationFrameworkImpl#getHasArgument <em>Has Argument</em>}</li>
 *   <li>{@link argumentation.impl.PersuadeeArgumentationFrameworkImpl#getHasPersuadee <em>Has Persuadee</em>}</li>
 *   <li>{@link argumentation.impl.PersuadeeArgumentationFrameworkImpl#getID <em>ID</em>}</li>
 *   <li>{@link argumentation.impl.PersuadeeArgumentationFrameworkImpl#getAbsorbsArgument <em>Absorbs Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersuadeeArgumentationFrameworkImpl extends EObjectImpl implements PersuadeeArgumentationFramework
{
	/**
	 * The cached value of the '{@link #getHasArgument() <em>Has Argument</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> hasArgument;

	/**
	 * The cached value of the '{@link #getHasPersuadee() <em>Has Persuadee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPersuadee()
	 * @generated
	 * @ordered
	 */
	protected Persuadee hasPersuadee;

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
	 * The cached value of the '{@link #getAbsorbsArgument() <em>Absorbs Argument</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsorbsArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> absorbsArgument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersuadeeArgumentationFrameworkImpl()
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
		return ArgumentationPackage.Literals.PERSUADEE_ARGUMENTATION_FRAMEWORK;
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
			hasArgument = new EObjectResolvingEList<Argument>(Argument.class, this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT);
		}
		return hasArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persuadee getHasPersuadee()
	{
		return hasPersuadee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPersuadee(Persuadee newHasPersuadee, NotificationChain msgs)
	{
		Persuadee oldHasPersuadee = hasPersuadee;
		hasPersuadee = newHasPersuadee;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE, oldHasPersuadee, newHasPersuadee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPersuadee(Persuadee newHasPersuadee)
	{
		if (newHasPersuadee != hasPersuadee)
		{
			NotificationChain msgs = null;
			if (hasPersuadee != null)
				msgs = ((InternalEObject)hasPersuadee).eInverseRemove(this, ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK, Persuadee.class, msgs);
			if (newHasPersuadee != null)
				msgs = ((InternalEObject)newHasPersuadee).eInverseAdd(this, ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK, Persuadee.class, msgs);
			msgs = basicSetHasPersuadee(newHasPersuadee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE, newHasPersuadee, newHasPersuadee));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getAbsorbsArgument()
	{
		if (absorbsArgument == null)
		{
			absorbsArgument = new EObjectWithInverseResolvingEList<Argument>(Argument.class, this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT, ArgumentationPackage.ARGUMENT__ASSERT_ARGUMENT);
		}
		return absorbsArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE:
				if (hasPersuadee != null)
					msgs = ((InternalEObject)hasPersuadee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE, null, msgs);
				return basicSetHasPersuadee((Persuadee)otherEnd, msgs);
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbsorbsArgument()).basicAdd(otherEnd, msgs);
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
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE:
				return basicSetHasPersuadee(null, msgs);
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT:
				return ((InternalEList<?>)getAbsorbsArgument()).basicRemove(otherEnd, msgs);
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
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT:
				return getHasArgument();
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE:
				return getHasPersuadee();
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ID:
				return getID();
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT:
				return getAbsorbsArgument();
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
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT:
				getHasArgument().clear();
				getHasArgument().addAll((Collection<? extends Argument>)newValue);
				return;
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE:
				setHasPersuadee((Persuadee)newValue);
				return;
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ID:
				setID((Integer)newValue);
				return;
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT:
				getAbsorbsArgument().clear();
				getAbsorbsArgument().addAll((Collection<? extends Argument>)newValue);
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
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT:
				getHasArgument().clear();
				return;
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE:
				setHasPersuadee((Persuadee)null);
				return;
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ID:
				setID(ID_EDEFAULT);
				return;
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT:
				getAbsorbsArgument().clear();
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
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT:
				return hasArgument != null && !hasArgument.isEmpty();
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE:
				return hasPersuadee != null;
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ID:
				return id != ID_EDEFAULT;
			case ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT:
				return absorbsArgument != null && !absorbsArgument.isEmpty();
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

} //PersuadeeArgumentationFrameworkImpl
