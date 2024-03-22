/**
 */
package argumentation.impl;

import argumentation.Argument;
import argumentation.ArgumentationFactory;
import argumentation.ArgumentationFramework;
import argumentation.ArgumentationPackage;
import argumentation.Persuadee;
import argumentation.PersuadeeArgumentationFramework;
import argumentation.Persuader;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentationPackageImpl extends EPackageImpl implements ArgumentationPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentationFrameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persuaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persuadeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persuadeeArgumentationFrameworkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see argumentation.ArgumentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArgumentationPackageImpl()
	{
		super(eNS_URI, ArgumentationFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ArgumentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArgumentationPackage init()
	{
		if (isInited) return (ArgumentationPackage)EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArgumentationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArgumentationPackageImpl theArgumentationPackage = registeredArgumentationPackage instanceof ArgumentationPackageImpl ? (ArgumentationPackageImpl)registeredArgumentationPackage : new ArgumentationPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theArgumentationPackage.createPackageContents();

		// Initialize created meta-data
		theArgumentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArgumentationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArgumentationPackage.eNS_URI, theArgumentationPackage);
		return theArgumentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentationFramework()
	{
		return argumentationFrameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentationFramework_PersuadeeArgumentationFramework()
	{
		return (EReference)argumentationFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentationFramework_HasPersuader()
	{
		return (EReference)argumentationFrameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentationFramework_ID()
	{
		return (EAttribute)argumentationFrameworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentationFramework_HasArgument()
	{
		return (EReference)argumentationFrameworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentationFramework_HasTopic()
	{
		return (EReference)argumentationFrameworkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersuader()
	{
		return persuaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersuader_HasArgumentationFramework()
	{
		return (EReference)persuaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersuader_ID()
	{
		return (EAttribute)persuaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersuader_PutsForward()
	{
		return (EReference)persuaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument()
	{
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_Attacks()
	{
		return (EReference)argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgument_ID()
	{
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_AssertArgument()
	{
		return (EReference)argumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgument_Name()
	{
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersuadee()
	{
		return persuadeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersuadee_HasPersuadeeArgumentationFramework()
	{
		return (EReference)persuadeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersuadee_ID()
	{
		return (EAttribute)persuadeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersuadeeArgumentationFramework()
	{
		return persuadeeArgumentationFrameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersuadeeArgumentationFramework_HasArgument()
	{
		return (EReference)persuadeeArgumentationFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersuadeeArgumentationFramework_HasPersuadee()
	{
		return (EReference)persuadeeArgumentationFrameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersuadeeArgumentationFramework_ID()
	{
		return (EAttribute)persuadeeArgumentationFrameworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersuadeeArgumentationFramework_AbsorbsArgument()
	{
		return (EReference)persuadeeArgumentationFrameworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationFactory getArgumentationFactory()
	{
		return (ArgumentationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		argumentationFrameworkEClass = createEClass(ARGUMENTATION_FRAMEWORK);
		createEReference(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__PERSUADEE_ARGUMENTATION_FRAMEWORK);
		createEReference(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__HAS_PERSUADER);
		createEAttribute(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__ID);
		createEReference(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT);
		createEReference(argumentationFrameworkEClass, ARGUMENTATION_FRAMEWORK__HAS_TOPIC);

		persuaderEClass = createEClass(PERSUADER);
		createEReference(persuaderEClass, PERSUADER__HAS_ARGUMENTATION_FRAMEWORK);
		createEAttribute(persuaderEClass, PERSUADER__ID);
		createEReference(persuaderEClass, PERSUADER__PUTS_FORWARD);

		argumentEClass = createEClass(ARGUMENT);
		createEReference(argumentEClass, ARGUMENT__ATTACKS);
		createEAttribute(argumentEClass, ARGUMENT__ID);
		createEReference(argumentEClass, ARGUMENT__ASSERT_ARGUMENT);
		createEAttribute(argumentEClass, ARGUMENT__NAME);

		persuadeeEClass = createEClass(PERSUADEE);
		createEReference(persuadeeEClass, PERSUADEE__HAS_PERSUADEE_ARGUMENTATION_FRAMEWORK);
		createEAttribute(persuadeeEClass, PERSUADEE__ID);

		persuadeeArgumentationFrameworkEClass = createEClass(PERSUADEE_ARGUMENTATION_FRAMEWORK);
		createEReference(persuadeeArgumentationFrameworkEClass, PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_ARGUMENT);
		createEReference(persuadeeArgumentationFrameworkEClass, PERSUADEE_ARGUMENTATION_FRAMEWORK__HAS_PERSUADEE);
		createEAttribute(persuadeeArgumentationFrameworkEClass, PERSUADEE_ARGUMENTATION_FRAMEWORK__ID);
		createEReference(persuadeeArgumentationFrameworkEClass, PERSUADEE_ARGUMENTATION_FRAMEWORK__ABSORBS_ARGUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(argumentationFrameworkEClass, ArgumentationFramework.class, "ArgumentationFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentationFramework_PersuadeeArgumentationFramework(), this.getPersuadeeArgumentationFramework(), null, "persuadeeArgumentationFramework", null, 1, -1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentationFramework_HasPersuader(), this.getPersuader(), this.getPersuader_HasArgumentationFramework(), "hasPersuader", null, 1, 1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgumentationFramework_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentationFramework_HasArgument(), this.getArgument(), null, "hasArgument", null, 1, -1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentationFramework_HasTopic(), this.getArgument(), null, "hasTopic", null, 0, 1, ArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persuaderEClass, Persuader.class, "Persuader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersuader_HasArgumentationFramework(), this.getArgumentationFramework(), this.getArgumentationFramework_HasPersuader(), "hasArgumentationFramework", null, 1, 1, Persuader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersuader_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Persuader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersuader_PutsForward(), this.getArgument(), null, "putsForward", null, 0, -1, Persuader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgument_Attacks(), this.getArgument(), null, "attacks", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_AssertArgument(), this.getPersuadeeArgumentationFramework(), this.getPersuadeeArgumentationFramework_AbsorbsArgument(), "assertArgument", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persuadeeEClass, Persuadee.class, "Persuadee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersuadee_HasPersuadeeArgumentationFramework(), this.getPersuadeeArgumentationFramework(), this.getPersuadeeArgumentationFramework_HasPersuadee(), "hasPersuadeeArgumentationFramework", null, 1, 1, Persuadee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersuadee_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Persuadee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persuadeeArgumentationFrameworkEClass, PersuadeeArgumentationFramework.class, "PersuadeeArgumentationFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersuadeeArgumentationFramework_HasArgument(), this.getArgument(), null, "hasArgument", null, 1, -1, PersuadeeArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersuadeeArgumentationFramework_HasPersuadee(), this.getPersuadee(), this.getPersuadee_HasPersuadeeArgumentationFramework(), "hasPersuadee", null, 1, 1, PersuadeeArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersuadeeArgumentationFramework_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, PersuadeeArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersuadeeArgumentationFramework_AbsorbsArgument(), this.getArgument(), this.getArgument_AssertArgument(), "absorbsArgument", null, 0, -1, PersuadeeArgumentationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ArgumentationPackageImpl
