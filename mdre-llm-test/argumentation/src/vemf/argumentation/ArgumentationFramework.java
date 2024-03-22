/**
 */
package argumentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.ArgumentationFramework#getPersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}</li>
 *   <li>{@link argumentation.ArgumentationFramework#getHasPersuader <em>Has Persuader</em>}</li>
 *   <li>{@link argumentation.ArgumentationFramework#getID <em>ID</em>}</li>
 *   <li>{@link argumentation.ArgumentationFramework#getHasArgument <em>Has Argument</em>}</li>
 *   <li>{@link argumentation.ArgumentationFramework#getHasTopic <em>Has Topic</em>}</li>
 * </ul>
 *
 * @see argumentation.ArgumentationPackage#getArgumentationFramework()
 * @model
 * @generated
 */
public interface ArgumentationFramework extends EObject
{
	/**
	 * Returns the value of the '<em><b>Persuadee Argumentation Framework</b></em>' containment reference list.
	 * The list contents are of type {@link argumentation.PersuadeeArgumentationFramework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persuadee Argumentation Framework</em>' containment reference list.
	 * @see argumentation.ArgumentationPackage#getArgumentationFramework_PersuadeeArgumentationFramework()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PersuadeeArgumentationFramework> getPersuadeeArgumentationFramework();

	/**
	 * Returns the value of the '<em><b>Has Persuader</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link argumentation.Persuader#getHasArgumentationFramework <em>Has Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Persuader</em>' containment reference.
	 * @see #setHasPersuader(Persuader)
	 * @see argumentation.ArgumentationPackage#getArgumentationFramework_HasPersuader()
	 * @see argumentation.Persuader#getHasArgumentationFramework
	 * @model opposite="hasArgumentationFramework" containment="true" required="true"
	 * @generated
	 */
	Persuader getHasPersuader();

	/**
	 * Sets the value of the '{@link argumentation.ArgumentationFramework#getHasPersuader <em>Has Persuader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Persuader</em>' containment reference.
	 * @see #getHasPersuader()
	 * @generated
	 */
	void setHasPersuader(Persuader value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see argumentation.ArgumentationPackage#getArgumentationFramework_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link argumentation.ArgumentationFramework#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Has Argument</b></em>' containment reference list.
	 * The list contents are of type {@link argumentation.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Argument</em>' containment reference list.
	 * @see argumentation.ArgumentationPackage#getArgumentationFramework_HasArgument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Argument> getHasArgument();

	/**
	 * Returns the value of the '<em><b>Has Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Topic</em>' reference.
	 * @see #setHasTopic(Argument)
	 * @see argumentation.ArgumentationPackage#getArgumentationFramework_HasTopic()
	 * @model
	 * @generated
	 */
	Argument getHasTopic();

	/**
	 * Sets the value of the '{@link argumentation.ArgumentationFramework#getHasTopic <em>Has Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Topic</em>' reference.
	 * @see #getHasTopic()
	 * @generated
	 */
	void setHasTopic(Argument value);

} // ArgumentationFramework
