/**
 */
package argumentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see argumentation.ArgumentationPackage
 * @generated
 */
public interface ArgumentationFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArgumentationFactory eINSTANCE = argumentation.impl.ArgumentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Framework</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Framework</em>'.
	 * @generated
	 */
	ArgumentationFramework createArgumentationFramework();

	/**
	 * Returns a new object of class '<em>Persuader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persuader</em>'.
	 * @generated
	 */
	Persuader createPersuader();

	/**
	 * Returns a new object of class '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument</em>'.
	 * @generated
	 */
	Argument createArgument();

	/**
	 * Returns a new object of class '<em>Persuadee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persuadee</em>'.
	 * @generated
	 */
	Persuadee createPersuadee();

	/**
	 * Returns a new object of class '<em>Persuadee Argumentation Framework</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persuadee Argumentation Framework</em>'.
	 * @generated
	 */
	PersuadeeArgumentationFramework createPersuadeeArgumentationFramework();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArgumentationPackage getArgumentationPackage();

} //ArgumentationFactory
