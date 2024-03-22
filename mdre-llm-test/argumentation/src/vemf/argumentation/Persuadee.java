/**
 */
package argumentation;

import org.eclipse.emf.ecore.EObject;

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
 * @see argumentation.ArgumentationPackage#getPersuadee()
 * @model
 * @generated
 */
public interface Persuadee extends EObject
{
	/**
	 * Returns the value of the '<em><b>Has Persuadee Argumentation Framework</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link argumentation.PersuadeeArgumentationFramework#getHasPersuadee <em>Has Persuadee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Persuadee Argumentation Framework</em>' container reference.
	 * @see #setHasPersuadeeArgumentationFramework(PersuadeeArgumentationFramework)
	 * @see argumentation.ArgumentationPackage#getPersuadee_HasPersuadeeArgumentationFramework()
	 * @see argumentation.PersuadeeArgumentationFramework#getHasPersuadee
	 * @model opposite="hasPersuadee" required="true" transient="false"
	 * @generated
	 */
	PersuadeeArgumentationFramework getHasPersuadeeArgumentationFramework();

	/**
	 * Sets the value of the '{@link argumentation.Persuadee#getHasPersuadeeArgumentationFramework <em>Has Persuadee Argumentation Framework</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Persuadee Argumentation Framework</em>' container reference.
	 * @see #getHasPersuadeeArgumentationFramework()
	 * @generated
	 */
	void setHasPersuadeeArgumentationFramework(PersuadeeArgumentationFramework value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see argumentation.ArgumentationPackage#getPersuadee_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link argumentation.Persuadee#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

} // Persuadee
