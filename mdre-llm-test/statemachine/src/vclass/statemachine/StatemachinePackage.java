/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public class StatemachinePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.jastemf.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "stm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatemachinePackage eINSTANCE = statemachine.StatemachinePackage.init();

	/**
	 * The meta object id for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachine
	 * @see statemachine.StatemachinePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Machine Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__MACHINE_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Declaration
	 * @see statemachine.StatemachinePackage#getDeclaration()
	 * @generated
	 */
	public static final int DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Transition
	 * @see statemachine.StatemachinePackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE_LABEL = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET_LABEL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__SOURCE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TARGET = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_LABEL = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_LABEL = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__GUARD_EXPRESSION = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ACTION_STATEMENT = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link statemachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.State
	 * @see statemachine.StatemachinePackage#getState()
	 * @generated
	 */
	public static final int STATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__LABEL = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__SUCCESSORS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__REACHABLE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__ID = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link statemachine.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.Action
	 * @see statemachine.StatemachinePackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__ACTION_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.StateMachineVariable
	 * @see statemachine.StatemachinePackage#getStateMachineVariable()
	 * @generated
	 */
	public static final int STATE_MACHINE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.NormalState
	 * @see statemachine.StatemachinePackage#getNormalState()
	 * @generated
	 */
	public static final int NORMAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE__ENTRY = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.InitialState
	 * @see statemachine.StatemachinePackage#getInitialState()
	 * @generated
	 */
	public static final int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.FinalState <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.FinalState
	 * @see statemachine.StatemachinePackage#getFinalState()
	 * @generated
	 */
	public static final int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__SUCCESSORS = STATE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Reachable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__REACHABLE = STATE__REACHABLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE__ID = STATE__ID;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

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
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackage()
	{
		super(eNS_URI, StatemachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init()
	{
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinePackage theStatemachinePackage = registeredStatemachinePackage instanceof StatemachinePackage ? (StatemachinePackage)registeredStatemachinePackage : new StatemachinePackage();

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}


	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see statemachine.StateMachine#getDeclarations()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Declarations()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getMachineVariables <em>Machine Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Variables</em>'.
	 * @see statemachine.StateMachine#getMachineVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_MachineVariables()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see statemachine.Declaration
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_Label()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Label</em>'.
	 * @see statemachine.Transition#getSourceLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_SourceLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see statemachine.Transition#getTargetLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_TargetLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Source()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	public EReference getTransition_Target()
	{
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Label</em>'.
	 * @see statemachine.Transition#getGuardLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Transition#getActionLabel()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionLabel()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see statemachine.Transition#getGuardExpression()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_GuardExpression()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Transition#getActionStatement()
	 * @see #getTransition()
	 * @generated
	 */
	public EAttribute getTransition_ActionStatement()
	{
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see statemachine.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Label()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see statemachine.State#getSuccessors()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Successors()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link statemachine.State#getReachable <em>Reachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reachable</em>'.
	 * @see statemachine.State#getReachable()
	 * @see #getState()
	 * @generated
	 */
	public EReference getState_Reachable()
	{
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see statemachine.State#getId()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Id()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see statemachine.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see statemachine.Action#getActionLabel()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionLabel()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Action#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see statemachine.Action#getActionStatement()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_ActionStatement()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine Variable</em>'.
	 * @see statemachine.StateMachineVariable
	 * @generated
	 */
	public EClass getStateMachineVariable()
	{
		return stateMachineVariableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see statemachine.StateMachineVariable#getType()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Type()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link statemachine.StateMachineVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.StateMachineVariable#getName()
	 * @see #getStateMachineVariable()
	 * @generated
	 */
	public EAttribute getStateMachineVariable_Name()
	{
		return (EAttribute)stateMachineVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statemachine.NormalState
	 * @generated
	 */
	public EClass getNormalState()
	{
		return normalStateEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link statemachine.NormalState#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see statemachine.NormalState#getEntry()
	 * @see #getNormalState()
	 * @generated
	 */
	public EReference getNormalState_Entry()
	{
		return (EReference)normalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	public EClass getInitialState()
	{
		return initialStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	public EClass getFinalState()
	{
		return finalStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory()
	{
		return (StatemachineFactory)getEFactoryInstance();
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
		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__DECLARATIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__MACHINE_VARIABLES);

		declarationEClass = createEClass(DECLARATION);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__SOURCE_LABEL);
		createEAttribute(transitionEClass, TRANSITION__TARGET_LABEL);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__GUARD_LABEL);
		createEAttribute(transitionEClass, TRANSITION__ACTION_LABEL);
		createEAttribute(transitionEClass, TRANSITION__GUARD_EXPRESSION);
		createEAttribute(transitionEClass, TRANSITION__ACTION_STATEMENT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEReference(stateEClass, STATE__SUCCESSORS);
		createEReference(stateEClass, STATE__REACHABLE);
		createEAttribute(stateEClass, STATE__ID);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ACTION_LABEL);
		createEAttribute(actionEClass, ACTION__ACTION_STATEMENT);

		stateMachineVariableEClass = createEClass(STATE_MACHINE_VARIABLE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__TYPE);
		createEAttribute(stateMachineVariableEClass, STATE_MACHINE_VARIABLE__NAME);

		normalStateEClass = createEClass(NORMAL_STATE);
		createEReference(normalStateEClass, NORMAL_STATE__ENTRY);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);
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
		transitionEClass.getESuperTypes().add(this.getDeclaration());
		stateEClass.getESuperTypes().add(this.getDeclaration());
		normalStateEClass.getESuperTypes().add(this.getState());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_MachineVariables(), this.getStateMachineVariable(), null, "machineVariables", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(declarationEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getState(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardLabel(), ecorePackage.getEString(), "guardLabel", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Successors(), this.getState(), null, "successors", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reachable(), this.getState(), null, "reachable", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, null, "printReachable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_ActionLabel(), ecorePackage.getEString(), "actionLabel", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatement(), ecorePackage.getEString(), "actionStatement", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineVariableEClass, StateMachineVariable.class, "StateMachineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMachineVariable_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachineVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStateEClass, NormalState.class, "NormalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalState_Entry(), this.getAction(), null, "entry", null, 0, 1, NormalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diagraph
		createDiagraphAnnotations();
		// gmf.compartment
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations()
	{
		String source = "diagraph";
		addAnnotation
		  (stateMachineEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "pov", null
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=source", null,
			   "ref=target", null
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "ref=successors", null,
			   "ref=reachable", null
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (stateMachineVariableEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (normalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null,
			   "kref=entry", null
		   });
		addAnnotation
		  (initialStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
		addAnnotation
		  (finalStateEClass,
		   source,
		   new String[]
		   {
			   "node", null
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations()
	{
		String source = "gmf.compartment";
		addAnnotation
		  (getStateMachine_MachineVariables(),
		   source,
		   new String[]
		   {
		   });
		addAnnotation
		  (getNormalState_Entry(),
		   source,
		   new String[]
		   {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations()
	{
		String source = "gmf.link";
		addAnnotation
		  (getState_Reachable(),
		   source,
		   new String[]
		   {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link statemachine.StateMachine <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachine
		 * @see statemachine.StatemachinePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__DECLARATIONS = eINSTANCE.getStateMachine_Declarations();

		/**
		 * The meta object literal for the '<em><b>Machine Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__MACHINE_VARIABLES = eINSTANCE.getStateMachine_MachineVariables();

		/**
		 * The meta object literal for the '{@link statemachine.Declaration <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Declaration
		 * @see statemachine.StatemachinePackage#getDeclaration()
		 * @generated
		 */
		public static final EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link statemachine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Transition
		 * @see statemachine.StatemachinePackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__SOURCE_LABEL = eINSTANCE.getTransition_SourceLabel();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__TARGET_LABEL = eINSTANCE.getTransition_TargetLabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_LABEL = eINSTANCE.getTransition_GuardLabel();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_LABEL = eINSTANCE.getTransition_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__GUARD_EXPRESSION = eINSTANCE.getTransition_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION__ACTION_STATEMENT = eINSTANCE.getTransition_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.State
		 * @see statemachine.StatemachinePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__SUCCESSORS = eINSTANCE.getState_Successors();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE__REACHABLE = eINSTANCE.getState_Reachable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link statemachine.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.Action
		 * @see statemachine.StatemachinePackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_LABEL = eINSTANCE.getAction_ActionLabel();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__ACTION_STATEMENT = eINSTANCE.getAction_ActionStatement();

		/**
		 * The meta object literal for the '{@link statemachine.StateMachineVariable <em>State Machine Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.StateMachineVariable
		 * @see statemachine.StatemachinePackage#getStateMachineVariable()
		 * @generated
		 */
		public static final EClass STATE_MACHINE_VARIABLE = eINSTANCE.getStateMachineVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__TYPE = eINSTANCE.getStateMachineVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_MACHINE_VARIABLE__NAME = eINSTANCE.getStateMachineVariable_Name();

		/**
		 * The meta object literal for the '{@link statemachine.NormalState <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.NormalState
		 * @see statemachine.StatemachinePackage#getNormalState()
		 * @generated
		 */
		public static final EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NORMAL_STATE__ENTRY = eINSTANCE.getNormalState_Entry();

		/**
		 * The meta object literal for the '{@link statemachine.InitialState <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.InitialState
		 * @see statemachine.StatemachinePackage#getInitialState()
		 * @generated
		 */
		public static final EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.FinalState <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.FinalState
		 * @see statemachine.StatemachinePackage#getFinalState()
		 * @generated
		 */
		public static final EClass FINAL_STATE = eINSTANCE.getFinalState();

	}

} //StatemachinePackage
