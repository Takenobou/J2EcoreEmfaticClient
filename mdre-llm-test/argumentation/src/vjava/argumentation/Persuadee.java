/**
 */
package argumentation;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persuadee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.Persuadee#getHasPersuadeeArgumentationFramework <em>Has Persuadee Argumentation Framework</em>}</li>
 *   <li>{@link argumentation.Persuadee#getID <em>ID</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Persuadee extends Object implements Object
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
	protected Persuadee()
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
	 * Returns the value of the '<em><b>Has Persuadee Argumentation Framework</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link argumentation.PersuadeeArgumentationFramework#getHasPersuadee <em>Has Persuadee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Persuadee Argumentation Framework</em>' container reference.
	 * @see #setHasPersuadeeArgumentationFramework(PersuadeeArgumentationFramework)
	 * @see argumentation.PersuadeeArgumentationFramework#getHasPersuadee
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
		msgs = eBasicSetContainer(newHasPersuadeeArgumentationFramework, ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link argumentation.Persuadee#getHasPersuadeeArgumentationFramework <em>Has Persuadee Argumentation Framework</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newHasPersuadeeArgumentationFramework the new value of the '<em>Has Persuadee Argumentation Framework</em>' container reference.
	 * @see #getHasPersuadeeArgumentationFramework()
	 * @generated
	 */
	public void setHasPersuadeeArgumentationFramework(PersuadeeArgumentationFramework newHasPersuadeeArgumentationFramework)
	{
		if (newHasPersuadeeArgumentationFramework != eInternalContainer() || (eContainerFeatureID() != ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK && newHasPersuadeeArgumentationFramework != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newHasPersuadeeArgumentationFramework))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHasPersuadeeArgumentationFramework != null)
				msgs = newHasPersuadeeArgumentationFramework.eInverseAdd(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE, PersuadeeArgumentationFramework.class, msgs);
			msgs = basicSetHasPersuadeeArgumentationFramework(newHasPersuadeeArgumentationFramework, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @generated
	 */
	public int getID()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link argumentation.Persuadee#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newID the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	public void setID(int newID)
	{
		id = newID;
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

} // Persuadee
/**
 */
package argumentation;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persuadee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.Persuadee#getHasPersuadeeArgumentationFramework <em>Has Persuadee Argumentation Framework</em>}</li>
 *   <li>{@link argumentation.Persuadee#getID <em>ID</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Persuadee extends Object implements Object
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
	protected Persuadee()
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
	 * Returns the value of the '<em><b>Has Persuadee Argumentation Framework</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link argumentation.PersuadeeArgumentationFramework#getHasPersuadee <em>Has Persuadee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Persuadee Argumentation Framework</em>' container reference.
	 * @see #setHasPersuadeeArgumentationFramework(PersuadeeArgumentationFramework)
	 * @see argumentation.PersuadeeArgumentationFramework#getHasPersuadee
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
		msgs = eBasicSetContainer(newHasPersuadeeArgumentationFramework, ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link argumentation.Persuadee#getHasPersuadeeArgumentationFramework <em>Has Persuadee Argumentation Framework</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newHasPersuadeeArgumentationFramework the new value of the '<em>Has Persuadee Argumentation Framework</em>' container reference.
	 * @see #getHasPersuadeeArgumentationFramework()
	 * @generated
	 */
	public void setHasPersuadeeArgumentationFramework(PersuadeeArgumentationFramework newHasPersuadeeArgumentationFramework)
	{
		if (newHasPersuadeeArgumentationFramework != eInternalContainer() || (eContainerFeatureID() != ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK && newHasPersuadeeArgumentationFramework != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newHasPersuadeeArgumentationFramework))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHasPersuadeeArgumentationFramework != null)
				msgs = newHasPersuadeeArgumentationFramework.eInverseAdd(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE, PersuadeeArgumentationFramework.class, msgs);
			msgs = basicSetHasPersuadeeArgumentationFramework(newHasPersuadeeArgumentationFramework, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @generated
	 */
	public int getID()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link argumentation.Persuadee#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newID the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	public void setID(int newID)
	{
		id = newID;
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

} // Persuadee
/**
 */
package argumentation;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persuadee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.Persuadee#getHasPersuadeeArgumentationFramework <em>Has Persuadee Argumentation Framework</em>}</li>
 *   <li>{@link argumentation.Persuadee#getID <em>ID</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Persuadee extends Object implements Object
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
	protected Persuadee()
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
	 * Returns the value of the '<em><b>Has Persuadee Argumentation Framework</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link argumentation.PersuadeeArgumentationFramework#getHasPersuadee <em>Has Persuadee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Persuadee Argumentation Framework</em>' container reference.
	 * @see #setHasPersuadeeArgumentationFramework(PersuadeeArgumentationFramework)
	 * @see argumentation.PersuadeeArgumentationFramework#getHasPersuadee
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
		msgs = eBasicSetContainer(newHasPersuadeeArgumentationFramework, ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link argumentation.Persuadee#getHasPersuadeeArgumentationFramework <em>Has Persuadee Argumentation Framework</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newHasPersuadeeArgumentationFramework the new value of the '<em>Has Persuadee Argumentation Framework</em>' container reference.
	 * @see #getHasPersuadeeArgumentationFramework()
	 * @generated
	 */
	public void setHasPersuadeeArgumentationFramework(PersuadeeArgumentationFramework newHasPersuadeeArgumentationFramework)
	{
		if (newHasPersuadeeArgumentationFramework != eInternalContainer() || (eContainerFeatureID() != ArgumentationPackage.PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK && newHasPersuadeeArgumentationFramework != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newHasPersuadeeArgumentationFramework))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHasPersuadeeArgumentationFramework != null)
				msgs = newHasPersuadeeArgumentationFramework.eInverseAdd(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE, PersuadeeArgumentationFramework.class, msgs);
			msgs = basicSetHasPersuadeeArgumentationFramework(newHasPersuadeeArgumentationFramework, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @generated
	 */
	public int getID()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link argumentation.Persuadee#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newID the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	public void setID(int newID)
	{
		id = newID;
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

} // Persuadee
