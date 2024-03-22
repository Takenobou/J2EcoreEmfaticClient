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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.Argument#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link argumentation.Argument#getID <em>ID</em>}</li>
 *   <li>{@link argumentation.Argument#getAssertArgument <em>Assert Argument</em>}</li>
 *   <li>{@link argumentation.Argument#getName <em>Name</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Argument extends Object implements Object
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
	protected Argument()
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
	 * Returns the value of the '<em><b>Attacks</b></em>' reference list.
	 * The list contents are of type {@link argumentation.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacks</em>' reference list.
	 * @generated
	 */
	public List<Argument> getAttacks()
	{
		if (attacks == null)
		{
			attacks = new BasicInternalEList<Argument>(Argument.class);
		}
		return attacks;
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
	 * Sets the value of the '{@link argumentation.Argument#getID <em>ID</em>}' attribute.
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
	 * Returns the value of the '<em><b>Assert Argument</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument <em>Absorbs Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert Argument</em>' reference.
	 * @see #setAssertArgument(PersuadeeArgumentationFramework)
	 * @see argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument
	 * @generated
	 */
	public PersuadeeArgumentationFramework getAssertArgument()
	{
		if (assertArgument != null && ((EObject)assertArgument).eIsProxy())
		{
			InternalEObject oldAssertArgument = assertArgument;
			assertArgument = (PersuadeeArgumentationFramework)eResolveProxy(oldAssertArgument);
			if (assertArgument != oldAssertArgument)
			{
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
		return msgs;
	}

	/**
	 * Sets the value of the '{@link argumentation.Argument#getAssertArgument <em>Assert Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAssertArgument the new value of the '<em>Assert Argument</em>' reference.
	 * @see #getAssertArgument()
	 * @generated
	 */
	public void setAssertArgument(PersuadeeArgumentationFramework newAssertArgument)
	{
		if (newAssertArgument != assertArgument)
		{
			NotificationChain msgs = null;
			if (assertArgument != null)
				msgs = assertArgument.eInverseRemove(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT, PersuadeeArgumentationFramework.class, msgs);
			if (newAssertArgument != null)
				msgs = newAssertArgument.eInverseAdd(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT, PersuadeeArgumentationFramework.class, msgs);
			msgs = basicSetAssertArgument(newAssertArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link argumentation.Argument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
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
					msgs = assertArgument.eInverseRemove(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT, PersuadeeArgumentationFramework.class, msgs);
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

} // Argument
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.Argument#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link argumentation.Argument#getID <em>ID</em>}</li>
 *   <li>{@link argumentation.Argument#getAssertArgument <em>Assert Argument</em>}</li>
 *   <li>{@link argumentation.Argument#getName <em>Name</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Argument extends Object implements Object
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
	protected Argument()
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
	 * Returns the value of the '<em><b>Attacks</b></em>' reference list.
	 * The list contents are of type {@link argumentation.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacks</em>' reference list.
	 * @generated
	 */
	public List<Argument> getAttacks()
	{
		if (attacks == null)
		{
			attacks = new BasicInternalEList<Argument>(Argument.class);
		}
		return attacks;
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
	 * Sets the value of the '{@link argumentation.Argument#getID <em>ID</em>}' attribute.
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
	 * Returns the value of the '<em><b>Assert Argument</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument <em>Absorbs Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert Argument</em>' reference.
	 * @see #setAssertArgument(PersuadeeArgumentationFramework)
	 * @see argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument
	 * @generated
	 */
	public PersuadeeArgumentationFramework getAssertArgument()
	{
		if (assertArgument != null && ((EObject)assertArgument).eIsProxy())
		{
			InternalEObject oldAssertArgument = assertArgument;
			assertArgument = (PersuadeeArgumentationFramework)eResolveProxy(oldAssertArgument);
			if (assertArgument != oldAssertArgument)
			{
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
		return msgs;
	}

	/**
	 * Sets the value of the '{@link argumentation.Argument#getAssertArgument <em>Assert Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAssertArgument the new value of the '<em>Assert Argument</em>' reference.
	 * @see #getAssertArgument()
	 * @generated
	 */
	public void setAssertArgument(PersuadeeArgumentationFramework newAssertArgument)
	{
		if (newAssertArgument != assertArgument)
		{
			NotificationChain msgs = null;
			if (assertArgument != null)
				msgs = assertArgument.eInverseRemove(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT, PersuadeeArgumentationFramework.class, msgs);
			if (newAssertArgument != null)
				msgs = newAssertArgument.eInverseAdd(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT, PersuadeeArgumentationFramework.class, msgs);
			msgs = basicSetAssertArgument(newAssertArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link argumentation.Argument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
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
					msgs = assertArgument.eInverseRemove(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT, PersuadeeArgumentationFramework.class, msgs);
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

} // Argument
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.Argument#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link argumentation.Argument#getID <em>ID</em>}</li>
 *   <li>{@link argumentation.Argument#getAssertArgument <em>Assert Argument</em>}</li>
 *   <li>{@link argumentation.Argument#getName <em>Name</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Argument extends Object implements Object
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
	protected Argument()
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
	 * Returns the value of the '<em><b>Attacks</b></em>' reference list.
	 * The list contents are of type {@link argumentation.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacks</em>' reference list.
	 * @generated
	 */
	public List<Argument> getAttacks()
	{
		if (attacks == null)
		{
			attacks = new BasicInternalEList<Argument>(Argument.class);
		}
		return attacks;
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
	 * Sets the value of the '{@link argumentation.Argument#getID <em>ID</em>}' attribute.
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
	 * Returns the value of the '<em><b>Assert Argument</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument <em>Absorbs Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert Argument</em>' reference.
	 * @see #setAssertArgument(PersuadeeArgumentationFramework)
	 * @see argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument
	 * @generated
	 */
	public PersuadeeArgumentationFramework getAssertArgument()
	{
		if (assertArgument != null && ((EObject)assertArgument).eIsProxy())
		{
			InternalEObject oldAssertArgument = assertArgument;
			assertArgument = (PersuadeeArgumentationFramework)eResolveProxy(oldAssertArgument);
			if (assertArgument != oldAssertArgument)
			{
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
		return msgs;
	}

	/**
	 * Sets the value of the '{@link argumentation.Argument#getAssertArgument <em>Assert Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAssertArgument the new value of the '<em>Assert Argument</em>' reference.
	 * @see #getAssertArgument()
	 * @generated
	 */
	public void setAssertArgument(PersuadeeArgumentationFramework newAssertArgument)
	{
		if (newAssertArgument != assertArgument)
		{
			NotificationChain msgs = null;
			if (assertArgument != null)
				msgs = assertArgument.eInverseRemove(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT, PersuadeeArgumentationFramework.class, msgs);
			if (newAssertArgument != null)
				msgs = newAssertArgument.eInverseAdd(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT, PersuadeeArgumentationFramework.class, msgs);
			msgs = basicSetAssertArgument(newAssertArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link argumentation.Argument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
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
					msgs = assertArgument.eInverseRemove(this, ArgumentationPackage.PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT, PersuadeeArgumentationFramework.class, msgs);
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

} // Argument