/**
 */
package argumentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 * @see argumentation.ArgumentationPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject
{
	/**
	 * Returns the value of the '<em><b>Attacks</b></em>' reference list.
	 * The list contents are of type {@link argumentation.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacks</em>' reference list.
	 * @see argumentation.ArgumentationPackage#getArgument_Attacks()
	 * @model
	 * @generated
	 */
	EList<Argument> getAttacks();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see argumentation.ArgumentationPackage#getArgument_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link argumentation.Argument#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Assert Argument</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument <em>Absorbs Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert Argument</em>' reference.
	 * @see #setAssertArgument(PersuadeeArgumentationFramework)
	 * @see argumentation.ArgumentationPackage#getArgument_AssertArgument()
	 * @see argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument
	 * @model opposite="absorbsArgument"
	 * @generated
	 */
	PersuadeeArgumentationFramework getAssertArgument();

	/**
	 * Sets the value of the '{@link argumentation.Argument#getAssertArgument <em>Assert Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert Argument</em>' reference.
	 * @see #getAssertArgument()
	 * @generated
	 */
	void setAssertArgument(PersuadeeArgumentationFramework value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see argumentation.ArgumentationPackage#getArgument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link argumentation.Argument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Argument
