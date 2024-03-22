/**
 */
package argumentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persuadee Argumentation Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.PersuadeeArgumentationFramework#getHasArgument <em>Has Argument</em>}</li>
 *   <li>{@link argumentation.PersuadeeArgumentationFramework#getHasPersuadee <em>Has Persuadee</em>}</li>
 *   <li>{@link argumentation.PersuadeeArgumentationFramework#getID <em>ID</em>}</li>
 *   <li>{@link argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument <em>Absorbs Argument</em>}</li>
 * </ul>
 *
 * @see argumentation.ArgumentationPackage#getPersuadeeArgumentationFramework()
 * @model
 * @generated
 */
public interface PersuadeeArgumentationFramework extends EObject
{
	/**
	 * Returns the value of the '<em><b>Has Argument</b></em>' reference list.
	 * The list contents are of type {@link argumentation.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Argument</em>' reference list.
	 * @see argumentation.ArgumentationPackage#getPersuadeeArgumentationFramework_HasArgument()
	 * @model required="true"
	 * @generated
	 */
	EList<Argument> getHasArgument();

	/**
	 * Returns the value of the '<em><b>Has Persuadee</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link argumentation.Persuadee#getHasPersuadeeArgumentationFramework <em>Has Persuadee Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Persuadee</em>' containment reference.
	 * @see #setHasPersuadee(Persuadee)
	 * @see argumentation.ArgumentationPackage#getPersuadeeArgumentationFramework_HasPersuadee()
	 * @see argumentation.Persuadee#getHasPersuadeeArgumentationFramework
	 * @model opposite="hasPersuadeeArgumentationFramework" containment="true" required="true"
	 * @generated
	 */
	Persuadee getHasPersuadee();

	/**
	 * Sets the value of the '{@link argumentation.PersuadeeArgumentationFramework#getHasPersuadee <em>Has Persuadee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Persuadee</em>' containment reference.
	 * @see #getHasPersuadee()
	 * @generated
	 */
	void setHasPersuadee(Persuadee value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see argumentation.ArgumentationPackage#getPersuadeeArgumentationFramework_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link argumentation.PersuadeeArgumentationFramework#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Absorbs Argument</b></em>' reference list.
	 * The list contents are of type {@link argumentation.Argument}.
	 * It is bidirectional and its opposite is '{@link argumentation.Argument#getAssertArgument <em>Assert Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absorbs Argument</em>' reference list.
	 * @see argumentation.ArgumentationPackage#getPersuadeeArgumentationFramework_AbsorbsArgument()
	 * @see argumentation.Argument#getAssertArgument
	 * @model opposite="assertArgument"
	 * @generated
	 */
	EList<Argument> getAbsorbsArgument();

} // PersuadeeArgumentationFramework
