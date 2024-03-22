/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
/**
 */
package Courses;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Courses.Person#getName <em>Name</em>}</li>
 *   <li>{@link Courses.Person#getId <em>Id</em>}</li>
 *   <li>{@link Courses.Person#getRole <em>Role</em>}</li>
 *   <li>{@link Courses.Person#getAssignmentDelivery <em>Assignment Delivery</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class Person extends Object implements Object
{
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignmentDelivery() <em>Assignment Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> assignmentDelivery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person()
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
		return CoursesPackage.Literals.PERSON;
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
	 * Sets the value of the '{@link Courses.Person#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId)
	{
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Sets the value of the '{@link Courses.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRole the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(String newRole)
	{
		role = newRole;
	}

	/**
	 * Returns the value of the '<em><b>Assignment Delivery</b></em>' reference list.
	 * The list contents are of type {@link Courses.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Delivery</em>' reference list.
	 * @generated
	 */
	public List<Answer> getAssignmentDelivery()
	{
		if (assignmentDelivery == null)
		{
			assignmentDelivery = new BasicInternalEList<Answer>(Answer.class);
		}
		return assignmentDelivery;
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
			case CoursesPackage.PERSON__NAME:
				return getName();
			case CoursesPackage.PERSON__ID:
				return getId();
			case CoursesPackage.PERSON__ROLE:
				return getRole();
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return getAssignmentDelivery();
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
			case CoursesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursesPackage.PERSON__ID:
				setId((Integer)newValue);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole((String)newValue);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
				getAssignmentDelivery().addAll((Collection<? extends Answer>)newValue);
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
			case CoursesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				getAssignmentDelivery().clear();
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
			case CoursesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursesPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case CoursesPackage.PERSON__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CoursesPackage.PERSON__ASSIGNMENT_DELIVERY:
				return assignmentDelivery != null && !assignmentDelivery.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} // Person
