/**
 */
package argumentation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persuader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.Persuader#getHasArgumentationFramework <em>Has Argumentation Framework</em>}</li>
 *   <li>{@link argumentation.Persuader#getID <em>ID</em>}</li>
 *   <li>{@link argumentation.Persuader#getPutsForward <em>Puts Forward</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Persuader extends Object implements Object
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
	protected Persuader()
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
	 * Returns the value of the '<em><b>Has Argumentation Framework</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link argumentation.ArgumentationFramework#getHasPersuader <em>Has Persuader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Argumentation Framework</em>' container reference.
	 * @see #setHasArgumentationFramework(ArgumentationFramework)
	 * @see argumentation.ArgumentationFramework#getHasPersuader
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
		msgs = eBasicSetContainer(newHasArgumentationFramework, ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link argumentation.Persuader#getHasArgumentationFramework <em>Has Argumentation Framework</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newHasArgumentationFramework the new value of the '<em>Has Argumentation Framework</em>' container reference.
	 * @see #getHasArgumentationFramework()
	 * @generated
	 */
	public void setHasArgumentationFramework(ArgumentationFramework newHasArgumentationFramework)
	{
		if (newHasArgumentationFramework != eInternalContainer() || (eContainerFeatureID() != ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK && newHasArgumentationFramework != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newHasArgumentationFramework))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHasArgumentationFramework != null)
				msgs = newHasArgumentationFramework.eInverseAdd(this, ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER, ArgumentationFramework.class, msgs);
			msgs = basicSetHasArgumentationFramework(newHasArgumentationFramework, msgs);
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
	 * Sets the value of the '{@link argumentation.Persuader#getID <em>ID</em>}' attribute.
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
	 * Returns the value of the '<em><b>Puts Forward</b></em>' reference list.
	 * The list contents are of type {@link argumentation.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puts Forward</em>' reference list.
	 * @generated
	 */
	public List<Argument> getPutsForward()
	{
		if (putsForward == null)
		{
			putsForward = new BasicInternalEList<Argument>(Argument.class);
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

} // Persuader
/**
 */
package argumentation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persuader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.Persuader#getHasArgumentationFramework <em>Has Argumentation Framework</em>}</li>
 *   <li>{@link argumentation.Persuader#getID <em>ID</em>}</li>
 *   <li>{@link argumentation.Persuader#getPutsForward <em>Puts Forward</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Persuader extends Object implements Object
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
	protected Persuader()
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
	 * Returns the value of the '<em><b>Has Argumentation Framework</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link argumentation.ArgumentationFramework#getHasPersuader <em>Has Persuader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Argumentation Framework</em>' container reference.
	 * @see #setHasArgumentationFramework(ArgumentationFramework)
	 * @see argumentation.ArgumentationFramework#getHasPersuader
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
		msgs = eBasicSetContainer(newHasArgumentationFramework, ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link argumentation.Persuader#getHasArgumentationFramework <em>Has Argumentation Framework</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newHasArgumentationFramework the new value of the '<em>Has Argumentation Framework</em>' container reference.
	 * @see #getHasArgumentationFramework()
	 * @generated
	 */
	public void setHasArgumentationFramework(ArgumentationFramework newHasArgumentationFramework)
	{
		if (newHasArgumentationFramework != eInternalContainer() || (eContainerFeatureID() != ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK && newHasArgumentationFramework != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newHasArgumentationFramework))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHasArgumentationFramework != null)
				msgs = newHasArgumentationFramework.eInverseAdd(this, ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER, ArgumentationFramework.class, msgs);
			msgs = basicSetHasArgumentationFramework(newHasArgumentationFramework, msgs);
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
	 * Sets the value of the '{@link argumentation.Persuader#getID <em>ID</em>}' attribute.
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
	 * Returns the value of the '<em><b>Puts Forward</b></em>' reference list.
	 * The list contents are of type {@link argumentation.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puts Forward</em>' reference list.
	 * @generated
	 */
	public List<Argument> getPutsForward()
	{
		if (putsForward == null)
		{
			putsForward = new BasicInternalEList<Argument>(Argument.class);
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

} // Persuader
/**
 */
package argumentation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persuader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.Persuader#getHasArgumentationFramework <em>Has Argumentation Framework</em>}</li>
 *   <li>{@link argumentation.Persuader#getID <em>ID</em>}</li>
 *   <li>{@link argumentation.Persuader#getPutsForward <em>Puts Forward</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Persuader extends Object implements Object
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
	protected Persuader()
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
	 * Returns the value of the '<em><b>Has Argumentation Framework</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link argumentation.ArgumentationFramework#getHasPersuader <em>Has Persuader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Argumentation Framework</em>' container reference.
	 * @see #setHasArgumentationFramework(ArgumentationFramework)
	 * @see argumentation.ArgumentationFramework#getHasPersuader
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
		msgs = eBasicSetContainer(newHasArgumentationFramework, ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link argumentation.Persuader#getHasArgumentationFramework <em>Has Argumentation Framework</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newHasArgumentationFramework the new value of the '<em>Has Argumentation Framework</em>' container reference.
	 * @see #getHasArgumentationFramework()
	 * @generated
	 */
	public void setHasArgumentationFramework(ArgumentationFramework newHasArgumentationFramework)
	{
		if (newHasArgumentationFramework != eInternalContainer() || (eContainerFeatureID() != ArgumentationPackage.PERSUADER__HAS_ARGUMENTATION_FRAMEWORK && newHasArgumentationFramework != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newHasArgumentationFramework))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHasArgumentationFramework != null)
				msgs = newHasArgumentationFramework.eInverseAdd(this, ArgumentationPackage.ARGUMENTATION_FRAMEWORK__HAS_PERSUADER, ArgumentationFramework.class, msgs);
			msgs = basicSetHasArgumentationFramework(newHasArgumentationFramework, msgs);
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
	 * Sets the value of the '{@link argumentation.Persuader#getID <em>ID</em>}' attribute.
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
	 * Returns the value of the '<em><b>Puts Forward</b></em>' reference list.
	 * The list contents are of type {@link argumentation.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puts Forward</em>' reference list.
	 * @generated
	 */
	public List<Argument> getPutsForward()
	{
		if (putsForward == null)
		{
			putsForward = new BasicInternalEList<Argument>(Argument.class);
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

} // Persuader
