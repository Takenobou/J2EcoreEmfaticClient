/**
 */
package argumentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 * @see argumentation.ArgumentationPackage#getPersuader()
 * @model
 * @generated
 */
public interface Persuader extends EObject
{
	/**
	 * Returns the value of the '<em><b>Has Argumentation Framework</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link argumentation.ArgumentationFramework#getHasPersuader <em>Has Persuader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Argumentation Framework</em>' container reference.
	 * @see #setHasArgumentationFramework(ArgumentationFramework)
	 * @see argumentation.ArgumentationPackage#getPersuader_HasArgumentationFramework()
	 * @see argumentation.ArgumentationFramework#getHasPersuader
	 * @model opposite="hasPersuader" required="true" transient="false"
	 * @generated
	 */
	ArgumentationFramework getHasArgumentationFramework();

	/**
	 * Sets the value of the '{@link argumentation.Persuader#getHasArgumentationFramework <em>Has Argumentation Framework</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Argumentation Framework</em>' container reference.
	 * @see #getHasArgumentationFramework()
	 * @generated
	 */
	void setHasArgumentationFramework(ArgumentationFramework value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see argumentation.ArgumentationPackage#getPersuader_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link argumentation.Persuader#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Puts Forward</b></em>' reference list.
	 * The list contents are of type {@link argumentation.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puts Forward</em>' reference list.
	 * @see argumentation.ArgumentationPackage#getPersuader_PutsForward()
	 * @model
	 * @generated
	 */
	EList<Argument> getPutsForward();

} // Persuader
