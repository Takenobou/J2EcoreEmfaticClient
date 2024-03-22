/**
 */
package argumentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see argumentation.ArgumentationFactory
 * @model kind="package"
 * @generated
 */
public interface ArgumentationPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "argumentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kcl.ac.uk/mdeo/argumentation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "argumentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArgumentationPackage eINSTANCE = argumentation.impl.ArgumentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link argumentation.impl.ArgumentationFrameworkImpl <em>Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.ArgumentationFrameworkImpl
	 * @see argumentation.impl.ArgumentationPackageImpl#getArgumentationFramework()
	 * @generated
	 */
	int ARGUMENTATION_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Persuadee Argumentation Framework</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Has Persuader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_FRAMEWORK__HAS_PERSUADER = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_FRAMEWORK__ID = 2;

	/**
	 * The feature id for the '<em><b>Has Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT = 3;

	/**
	 * The feature id for the '<em><b>Has Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_FRAMEWORK__HAS_TOPIC = 4;

	/**
	 * The number of structural features of the '<em>Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_FRAMEWORK_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link argumentation.impl.PersuaderImpl <em>Persuader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.PersuaderImpl
	 * @see argumentation.impl.ArgumentationPackageImpl#getPersuader()
	 * @generated
	 */
	int PERSUADER = 1;

	/**
	 * The feature id for the '<em><b>Has Argumentation Framework</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSUADER__HAS_ARGUMENTATION_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSUADER__ID = 1;

	/**
	 * The feature id for the '<em><b>Puts Forward</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSUADER__PUTS_FORWARD = 2;

	/**
	 * The number of structural features of the '<em>Persuader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSUADER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link argumentation.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.ArgumentImpl
	 * @see argumentation.impl.ArgumentationPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ATTACKS = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Assert Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ASSERT_ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link argumentation.impl.PersuadeeImpl <em>Persuadee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.PersuadeeImpl
	 * @see argumentation.impl.ArgumentationPackageImpl#getPersuadee()
	 * @generated
	 */
	int PERSUADEE = 3;

	/**
	 * The feature id for the '<em><b>Has Persuadee Argumentation Framework</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSUADEE__ID = 1;

	/**
	 * The number of structural features of the '<em>Persuadee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSUADEE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link argumentation.impl.PersuadeeArgumentationFrameworkImpl <em>Persuadee Argumentation Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.PersuadeeArgumentationFrameworkImpl
	 * @see argumentation.impl.ArgumentationPackageImpl#getPersuadeeArgumentationFramework()
	 * @generated
	 */
	int PERSUADEE_ARGUMENTATION_FRAMEWORK = 4;

	/**
	 * The feature id for the '<em><b>Has Argument</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT = 0;

	/**
	 * The feature id for the '<em><b>Has Persuadee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSUADEE_ARGUMENTATION_FRAMEWORK__ID = 2;

	/**
	 * The feature id for the '<em><b>Absorbs Argument</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT = 3;

	/**
	 * The number of structural features of the '<em>Persuadee Argumentation Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSUADEE_ARGUMENTATION_FRAMEWORK_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link argumentation.ArgumentationFramework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Framework</em>'.
	 * @see argumentation.ArgumentationFramework
	 * @generated
	 */
	EClass getArgumentationFramework();

	/**
	 * Returns the meta object for the containment reference list '{@link argumentation.ArgumentationFramework#getPersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persuadee Argumentation Framework</em>'.
	 * @see argumentation.ArgumentationFramework#getPersuadeeArgumentationFramework()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	EReference getArgumentationFramework_PersuadeeArgumentationFramework();

	/**
	 * Returns the meta object for the containment reference '{@link argumentation.ArgumentationFramework#getHasPersuader <em>Has Persuader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Persuader</em>'.
	 * @see argumentation.ArgumentationFramework#getHasPersuader()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	EReference getArgumentationFramework_HasPersuader();

	/**
	 * Returns the meta object for the attribute '{@link argumentation.ArgumentationFramework#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.ArgumentationFramework#getID()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	EAttribute getArgumentationFramework_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link argumentation.ArgumentationFramework#getHasArgument <em>Has Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Argument</em>'.
	 * @see argumentation.ArgumentationFramework#getHasArgument()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	EReference getArgumentationFramework_HasArgument();

	/**
	 * Returns the meta object for the reference '{@link argumentation.ArgumentationFramework#getHasTopic <em>Has Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Topic</em>'.
	 * @see argumentation.ArgumentationFramework#getHasTopic()
	 * @see #getArgumentationFramework()
	 * @generated
	 */
	EReference getArgumentationFramework_HasTopic();

	/**
	 * Returns the meta object for class '{@link argumentation.Persuader <em>Persuader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persuader</em>'.
	 * @see argumentation.Persuader
	 * @generated
	 */
	EClass getPersuader();

	/**
	 * Returns the meta object for the container reference '{@link argumentation.Persuader#getHasArgumentationFramework <em>Has Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Has Argumentation Framework</em>'.
	 * @see argumentation.Persuader#getHasArgumentationFramework()
	 * @see #getPersuader()
	 * @generated
	 */
	EReference getPersuader_HasArgumentationFramework();

	/**
	 * Returns the meta object for the attribute '{@link argumentation.Persuader#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.Persuader#getID()
	 * @see #getPersuader()
	 * @generated
	 */
	EAttribute getPersuader_ID();

	/**
	 * Returns the meta object for the reference list '{@link argumentation.Persuader#getPutsForward <em>Puts Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Puts Forward</em>'.
	 * @see argumentation.Persuader#getPutsForward()
	 * @see #getPersuader()
	 * @generated
	 */
	EReference getPersuader_PutsForward();

	/**
	 * Returns the meta object for class '{@link argumentation.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see argumentation.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the reference list '{@link argumentation.Argument#getAttacks <em>Attacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attacks</em>'.
	 * @see argumentation.Argument#getAttacks()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Attacks();

	/**
	 * Returns the meta object for the attribute '{@link argumentation.Argument#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.Argument#getID()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_ID();

	/**
	 * Returns the meta object for the reference '{@link argumentation.Argument#getAssertArgument <em>Assert Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assert Argument</em>'.
	 * @see argumentation.Argument#getAssertArgument()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_AssertArgument();

	/**
	 * Returns the meta object for the attribute '{@link argumentation.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see argumentation.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for class '{@link argumentation.Persuadee <em>Persuadee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persuadee</em>'.
	 * @see argumentation.Persuadee
	 * @generated
	 */
	EClass getPersuadee();

	/**
	 * Returns the meta object for the container reference '{@link argumentation.Persuadee#getHasPersuadeeArgumentationFramework <em>Has Persuadee Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Has Persuadee Argumentation Framework</em>'.
	 * @see argumentation.Persuadee#getHasPersuadeeArgumentationFramework()
	 * @see #getPersuadee()
	 * @generated
	 */
	EReference getPersuadee_HasPersuadeeArgumentationFramework();

	/**
	 * Returns the meta object for the attribute '{@link argumentation.Persuadee#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.Persuadee#getID()
	 * @see #getPersuadee()
	 * @generated
	 */
	EAttribute getPersuadee_ID();

	/**
	 * Returns the meta object for class '{@link argumentation.PersuadeeArgumentationFramework <em>Persuadee Argumentation Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persuadee Argumentation Framework</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework
	 * @generated
	 */
	EClass getPersuadeeArgumentationFramework();

	/**
	 * Returns the meta object for the reference list '{@link argumentation.PersuadeeArgumentationFramework#getHasArgument <em>Has Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Argument</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework#getHasArgument()
	 * @see #getPersuadeeArgumentationFramework()
	 * @generated
	 */
	EReference getPersuadeeArgumentationFramework_HasArgument();

	/**
	 * Returns the meta object for the containment reference '{@link argumentation.PersuadeeArgumentationFramework#getHasPersuadee <em>Has Persuadee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Persuadee</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework#getHasPersuadee()
	 * @see #getPersuadeeArgumentationFramework()
	 * @generated
	 */
	EReference getPersuadeeArgumentationFramework_HasPersuadee();

	/**
	 * Returns the meta object for the attribute '{@link argumentation.PersuadeeArgumentationFramework#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework#getID()
	 * @see #getPersuadeeArgumentationFramework()
	 * @generated
	 */
	EAttribute getPersuadeeArgumentationFramework_ID();

	/**
	 * Returns the meta object for the reference list '{@link argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument <em>Absorbs Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Absorbs Argument</em>'.
	 * @see argumentation.PersuadeeArgumentationFramework#getAbsorbsArgument()
	 * @see #getPersuadeeArgumentationFramework()
	 * @generated
	 */
	EReference getPersuadeeArgumentationFramework_AbsorbsArgument();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArgumentationFactory getArgumentationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link argumentation.impl.ArgumentationFrameworkImpl <em>Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.ArgumentationFrameworkImpl
		 * @see argumentation.impl.ArgumentationPackageImpl#getArgumentationFramework()
		 * @generated
		 */
		EClass ARGUMENTATION_FRAMEWORK = eINSTANCE.getArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>Persuadee Argumentation Framework</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK = eINSTANCE.getArgumentationFramework_PersuadeeArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>Has Persuader</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTATION_FRAMEWORK__HAS_PERSUADER = eINSTANCE.getArgumentationFramework_HasPersuader();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENTATION_FRAMEWORK__ID = eINSTANCE.getArgumentationFramework_ID();

		/**
		 * The meta object literal for the '<em><b>Has Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT = eINSTANCE.getArgumentationFramework_HasArgument();

		/**
		 * The meta object literal for the '<em><b>Has Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTATION_FRAMEWORK__HAS_TOPIC = eINSTANCE.getArgumentationFramework_HasTopic();

		/**
		 * The meta object literal for the '{@link argumentation.impl.PersuaderImpl <em>Persuader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.PersuaderImpl
		 * @see argumentation.impl.ArgumentationPackageImpl#getPersuader()
		 * @generated
		 */
		EClass PERSUADER = eINSTANCE.getPersuader();

		/**
		 * The meta object literal for the '<em><b>Has Argumentation Framework</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSUADER__HAS_ARGUMENTATION_FRAMEWORK = eINSTANCE.getPersuader_HasArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSUADER__ID = eINSTANCE.getPersuader_ID();

		/**
		 * The meta object literal for the '<em><b>Puts Forward</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSUADER__PUTS_FORWARD = eINSTANCE.getPersuader_PutsForward();

		/**
		 * The meta object literal for the '{@link argumentation.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.ArgumentImpl
		 * @see argumentation.impl.ArgumentationPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Attacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ATTACKS = eINSTANCE.getArgument_Attacks();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__ID = eINSTANCE.getArgument_ID();

		/**
		 * The meta object literal for the '<em><b>Assert Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ASSERT_ARGUMENT = eINSTANCE.getArgument_AssertArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '{@link argumentation.impl.PersuadeeImpl <em>Persuadee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.PersuadeeImpl
		 * @see argumentation.impl.ArgumentationPackageImpl#getPersuadee()
		 * @generated
		 */
		EClass PERSUADEE = eINSTANCE.getPersuadee();

		/**
		 * The meta object literal for the '<em><b>Has Persuadee Argumentation Framework</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK = eINSTANCE.getPersuadee_HasPersuadeeArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSUADEE__ID = eINSTANCE.getPersuadee_ID();

		/**
		 * The meta object literal for the '{@link argumentation.impl.PersuadeeArgumentationFrameworkImpl <em>Persuadee Argumentation Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.PersuadeeArgumentationFrameworkImpl
		 * @see argumentation.impl.ArgumentationPackageImpl#getPersuadeeArgumentationFramework()
		 * @generated
		 */
		EClass PERSUADEE_ARGUMENTATION_FRAMEWORK = eINSTANCE.getPersuadeeArgumentationFramework();

		/**
		 * The meta object literal for the '<em><b>Has Argument</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT = eINSTANCE.getPersuadeeArgumentationFramework_HasArgument();

		/**
		 * The meta object literal for the '<em><b>Has Persuadee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE = eINSTANCE.getPersuadeeArgumentationFramework_HasPersuadee();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSUADEE_ARGUMENTATION_FRAMEWORK__ID = eINSTANCE.getPersuadeeArgumentationFramework_ID();

		/**
		 * The meta object literal for the '<em><b>Absorbs Argument</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT = eINSTANCE.getPersuadeeArgumentationFramework_AbsorbsArgument();

	}

} //ArgumentationPackage
