/**
 */
package enumerations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see enumerations.EnumerationsFactory
 * @model kind="package"
 * @generated
 */
public class EnumerationsPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "enumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.opendds.org/modeling/schemas/Enumerations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "enumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EnumerationsPackage eINSTANCE = enumerations.EnumerationsPackage.init();

	/**
	 * The meta object id for the '{@link enumerations.Period <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.Period
	 * @see enumerations.EnumerationsPackage#getPeriod()
	 * @generated
	 */
	public static final int PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD__NANOSECOND = 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD__SECOND = 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getReliabilityQosPolicyKind()
	 * @generated
	 */
	public static final int RELIABILITY_QOS_POLICY_KIND = 1;

	/**
	 * The meta object id for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @see enumerations.EnumerationsPackage#getPresentationQosPolicyAccessScopeKind()
	 * @generated
	 */
	public static final int PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = 2;

	/**
	 * The meta object id for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.OwnershipQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getOwnershipQosPolicyKind()
	 * @generated
	 */
	public static final int OWNERSHIP_QOS_POLICY_KIND = 3;

	/**
	 * The meta object id for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.LivelinessQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getLivelinessQosPolicyKind()
	 * @generated
	 */
	public static final int LIVELINESS_QOS_POLICY_KIND = 4;

	/**
	 * The meta object id for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DurabilityQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getDurabilityQosPolicyKind()
	 * @generated
	 */
	public static final int DURABILITY_QOS_POLICY_KIND = 5;

	/**
	 * The meta object id for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getDestinationOrderQosPolicyKind()
	 * @generated
	 */
	public static final int DESTINATION_ORDER_QOS_POLICY_KIND = 6;

	/**
	 * The meta object id for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.HistoryQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getHistoryQosPolicyKind()
	 * @generated
	 */
	public static final int HISTORY_QOS_POLICY_KIND = 7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reliabilityQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presentationQosPolicyAccessScopeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ownershipQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum livelinessQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durabilityQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum destinationOrderQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historyQosPolicyKindEEnum = null;

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
	 * @see enumerations.EnumerationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumerationsPackage()
	{
		super(eNS_URI, EnumerationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnumerationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumerationsPackage init()
	{
		if (isInited) return (EnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEnumerationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EnumerationsPackage theEnumerationsPackage = registeredEnumerationsPackage instanceof EnumerationsPackage ? (EnumerationsPackage)registeredEnumerationsPackage : new EnumerationsPackage();

		isInited = true;

		// Create package meta-data objects
		theEnumerationsPackage.createPackageContents();

		// Initialize created meta-data
		theEnumerationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumerationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumerationsPackage.eNS_URI, theEnumerationsPackage);
		return theEnumerationsPackage;
	}


	/**
	 * Returns the meta object for class '{@link enumerations.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see enumerations.Period
	 * @generated
	 */
	public EClass getPeriod()
	{
		return periodEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nanosecond</em>'.
	 * @see enumerations.Period#getNanosecond()
	 * @see #getPeriod()
	 * @generated
	 */
	public EAttribute getPeriod_Nanosecond()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see enumerations.Period#getSecond()
	 * @see #getPeriod()
	 * @generated
	 */
	public EAttribute getPeriod_Second()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reliability Qos Policy Kind</em>'.
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @generated
	 */
	public EEnum getReliabilityQosPolicyKind()
	{
		return reliabilityQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation Qos Policy Access Scope Kind</em>'.
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @generated
	 */
	public EEnum getPresentationQosPolicyAccessScopeKind()
	{
		return presentationQosPolicyAccessScopeKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ownership Qos Policy Kind</em>'.
	 * @see enumerations.OwnershipQosPolicyKind
	 * @generated
	 */
	public EEnum getOwnershipQosPolicyKind()
	{
		return ownershipQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Liveliness Qos Policy Kind</em>'.
	 * @see enumerations.LivelinessQosPolicyKind
	 * @generated
	 */
	public EEnum getLivelinessQosPolicyKind()
	{
		return livelinessQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Durability Qos Policy Kind</em>'.
	 * @see enumerations.DurabilityQosPolicyKind
	 * @generated
	 */
	public EEnum getDurabilityQosPolicyKind()
	{
		return durabilityQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Destination Order Qos Policy Kind</em>'.
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @generated
	 */
	public EEnum getDestinationOrderQosPolicyKind()
	{
		return destinationOrderQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Qos Policy Kind</em>'.
	 * @see enumerations.HistoryQosPolicyKind
	 * @generated
	 */
	public EEnum getHistoryQosPolicyKind()
	{
		return historyQosPolicyKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public EnumerationsFactory getEnumerationsFactory()
	{
		return (EnumerationsFactory)getEFactoryInstance();
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
		periodEClass = createEClass(PERIOD);
		createEAttribute(periodEClass, PERIOD__NANOSECOND);
		createEAttribute(periodEClass, PERIOD__SECOND);

		// Create enums
		reliabilityQosPolicyKindEEnum = createEEnum(RELIABILITY_QOS_POLICY_KIND);
		presentationQosPolicyAccessScopeKindEEnum = createEEnum(PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND);
		ownershipQosPolicyKindEEnum = createEEnum(OWNERSHIP_QOS_POLICY_KIND);
		livelinessQosPolicyKindEEnum = createEEnum(LIVELINESS_QOS_POLICY_KIND);
		durabilityQosPolicyKindEEnum = createEEnum(DURABILITY_QOS_POLICY_KIND);
		destinationOrderQosPolicyKindEEnum = createEEnum(DESTINATION_ORDER_QOS_POLICY_KIND);
		historyQosPolicyKindEEnum = createEEnum(HISTORY_QOS_POLICY_KIND);
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
		initEClass(periodEClass, Period.class, "Period", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriod_Nanosecond(), ecorePackage.getELong(), "nanosecond", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriod_Second(), ecorePackage.getEInt(), "second", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.class, "ReliabilityQosPolicyKind");
		addEEnumLiteral(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.BEST_EFFORT);
		addEEnumLiteral(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.RELIABLE);

		initEEnum(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.class, "PresentationQosPolicyAccessScopeKind");
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.INSTANCE);
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.TOPIC);
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.GROUP);

		initEEnum(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.class, "OwnershipQosPolicyKind");
		addEEnumLiteral(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.SHARED);
		addEEnumLiteral(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.EXCLUSIVE);

		initEEnum(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.class, "LivelinessQosPolicyKind");
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.AUTOMATIC);
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.MANUAL_BY_PARTICIPANT);
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.MANUAL_BY_TOPIC);

		initEEnum(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.class, "DurabilityQosPolicyKind");
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.TRANSIENT);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.TRANSIENT_LOCAL);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.VOLATILE);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.PERSISTENT);

		initEEnum(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.class, "DestinationOrderQosPolicyKind");
		addEEnumLiteral(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.BY_RECEPTION_TIMESTAMP);
		addEEnumLiteral(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.BY_SOURCE_TIMESTAMP);

		initEEnum(historyQosPolicyKindEEnum, HistoryQosPolicyKind.class, "HistoryQosPolicyKind");
		addEEnumLiteral(historyQosPolicyKindEEnum, HistoryQosPolicyKind.KEEP_LAST);
		addEEnumLiteral(historyQosPolicyKindEEnum, HistoryQosPolicyKind.KEEP_ALL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations()
	{
		String source = "GenModel";
		addAnnotation
		  (getPeriod_Nanosecond(),
		   source,
		   new String[]
		   {
			   "documentation", "ELong closest to CORBA unsigned long used in DDS spec."
		   });
		addAnnotation
		  (getPeriod_Second(),
		   source,
		   new String[]
		   {
			   "documentation", "EInt corresponds to CORBA long used in DDS spec."
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
		 * The meta object literal for the '{@link enumerations.Period <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.Period
		 * @see enumerations.EnumerationsPackage#getPeriod()
		 * @generated
		 */
		public static final EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Nanosecond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERIOD__NANOSECOND = eINSTANCE.getPeriod_Nanosecond();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERIOD__SECOND = eINSTANCE.getPeriod_Second();

		/**
		 * The meta object literal for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.ReliabilityQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getReliabilityQosPolicyKind()
		 * @generated
		 */
		public static final EEnum RELIABILITY_QOS_POLICY_KIND = eINSTANCE.getReliabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.PresentationQosPolicyAccessScopeKind
		 * @see enumerations.EnumerationsPackage#getPresentationQosPolicyAccessScopeKind()
		 * @generated
		 */
		public static final EEnum PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = eINSTANCE.getPresentationQosPolicyAccessScopeKind();

		/**
		 * The meta object literal for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.OwnershipQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getOwnershipQosPolicyKind()
		 * @generated
		 */
		public static final EEnum OWNERSHIP_QOS_POLICY_KIND = eINSTANCE.getOwnershipQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.LivelinessQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getLivelinessQosPolicyKind()
		 * @generated
		 */
		public static final EEnum LIVELINESS_QOS_POLICY_KIND = eINSTANCE.getLivelinessQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DurabilityQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getDurabilityQosPolicyKind()
		 * @generated
		 */
		public static final EEnum DURABILITY_QOS_POLICY_KIND = eINSTANCE.getDurabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DestinationOrderQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getDestinationOrderQosPolicyKind()
		 * @generated
		 */
		public static final EEnum DESTINATION_ORDER_QOS_POLICY_KIND = eINSTANCE.getDestinationOrderQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.HistoryQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getHistoryQosPolicyKind()
		 * @generated
		 */
		public static final EEnum HISTORY_QOS_POLICY_KIND = eINSTANCE.getHistoryQosPolicyKind();

	}

} //EnumerationsPackage
/**
 */
package enumerations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see enumerations.EnumerationsFactory
 * @model kind="package"
 * @generated
 */
public class EnumerationsPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "enumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.opendds.org/modeling/schemas/Enumerations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "enumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EnumerationsPackage eINSTANCE = enumerations.EnumerationsPackage.init();

	/**
	 * The meta object id for the '{@link enumerations.Period <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.Period
	 * @see enumerations.EnumerationsPackage#getPeriod()
	 * @generated
	 */
	public static final int PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD__NANOSECOND = 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD__SECOND = 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getReliabilityQosPolicyKind()
	 * @generated
	 */
	public static final int RELIABILITY_QOS_POLICY_KIND = 1;

	/**
	 * The meta object id for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @see enumerations.EnumerationsPackage#getPresentationQosPolicyAccessScopeKind()
	 * @generated
	 */
	public static final int PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = 2;

	/**
	 * The meta object id for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.OwnershipQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getOwnershipQosPolicyKind()
	 * @generated
	 */
	public static final int OWNERSHIP_QOS_POLICY_KIND = 3;

	/**
	 * The meta object id for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.LivelinessQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getLivelinessQosPolicyKind()
	 * @generated
	 */
	public static final int LIVELINESS_QOS_POLICY_KIND = 4;

	/**
	 * The meta object id for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DurabilityQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getDurabilityQosPolicyKind()
	 * @generated
	 */
	public static final int DURABILITY_QOS_POLICY_KIND = 5;

	/**
	 * The meta object id for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getDestinationOrderQosPolicyKind()
	 * @generated
	 */
	public static final int DESTINATION_ORDER_QOS_POLICY_KIND = 6;

	/**
	 * The meta object id for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.HistoryQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getHistoryQosPolicyKind()
	 * @generated
	 */
	public static final int HISTORY_QOS_POLICY_KIND = 7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reliabilityQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presentationQosPolicyAccessScopeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ownershipQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum livelinessQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durabilityQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum destinationOrderQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historyQosPolicyKindEEnum = null;

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
	 * @see enumerations.EnumerationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumerationsPackage()
	{
		super(eNS_URI, EnumerationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnumerationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumerationsPackage init()
	{
		if (isInited) return (EnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEnumerationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EnumerationsPackage theEnumerationsPackage = registeredEnumerationsPackage instanceof EnumerationsPackage ? (EnumerationsPackage)registeredEnumerationsPackage : new EnumerationsPackage();

		isInited = true;

		// Create package meta-data objects
		theEnumerationsPackage.createPackageContents();

		// Initialize created meta-data
		theEnumerationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumerationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumerationsPackage.eNS_URI, theEnumerationsPackage);
		return theEnumerationsPackage;
	}


	/**
	 * Returns the meta object for class '{@link enumerations.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see enumerations.Period
	 * @generated
	 */
	public EClass getPeriod()
	{
		return periodEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nanosecond</em>'.
	 * @see enumerations.Period#getNanosecond()
	 * @see #getPeriod()
	 * @generated
	 */
	public EAttribute getPeriod_Nanosecond()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see enumerations.Period#getSecond()
	 * @see #getPeriod()
	 * @generated
	 */
	public EAttribute getPeriod_Second()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reliability Qos Policy Kind</em>'.
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @generated
	 */
	public EEnum getReliabilityQosPolicyKind()
	{
		return reliabilityQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation Qos Policy Access Scope Kind</em>'.
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @generated
	 */
	public EEnum getPresentationQosPolicyAccessScopeKind()
	{
		return presentationQosPolicyAccessScopeKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ownership Qos Policy Kind</em>'.
	 * @see enumerations.OwnershipQosPolicyKind
	 * @generated
	 */
	public EEnum getOwnershipQosPolicyKind()
	{
		return ownershipQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Liveliness Qos Policy Kind</em>'.
	 * @see enumerations.LivelinessQosPolicyKind
	 * @generated
	 */
	public EEnum getLivelinessQosPolicyKind()
	{
		return livelinessQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Durability Qos Policy Kind</em>'.
	 * @see enumerations.DurabilityQosPolicyKind
	 * @generated
	 */
	public EEnum getDurabilityQosPolicyKind()
	{
		return durabilityQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Destination Order Qos Policy Kind</em>'.
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @generated
	 */
	public EEnum getDestinationOrderQosPolicyKind()
	{
		return destinationOrderQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Qos Policy Kind</em>'.
	 * @see enumerations.HistoryQosPolicyKind
	 * @generated
	 */
	public EEnum getHistoryQosPolicyKind()
	{
		return historyQosPolicyKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public EnumerationsFactory getEnumerationsFactory()
	{
		return (EnumerationsFactory)getEFactoryInstance();
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
		periodEClass = createEClass(PERIOD);
		createEAttribute(periodEClass, PERIOD__NANOSECOND);
		createEAttribute(periodEClass, PERIOD__SECOND);

		// Create enums
		reliabilityQosPolicyKindEEnum = createEEnum(RELIABILITY_QOS_POLICY_KIND);
		presentationQosPolicyAccessScopeKindEEnum = createEEnum(PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND);
		ownershipQosPolicyKindEEnum = createEEnum(OWNERSHIP_QOS_POLICY_KIND);
		livelinessQosPolicyKindEEnum = createEEnum(LIVELINESS_QOS_POLICY_KIND);
		durabilityQosPolicyKindEEnum = createEEnum(DURABILITY_QOS_POLICY_KIND);
		destinationOrderQosPolicyKindEEnum = createEEnum(DESTINATION_ORDER_QOS_POLICY_KIND);
		historyQosPolicyKindEEnum = createEEnum(HISTORY_QOS_POLICY_KIND);
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
		initEClass(periodEClass, Period.class, "Period", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriod_Nanosecond(), ecorePackage.getELong(), "nanosecond", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriod_Second(), ecorePackage.getEInt(), "second", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.class, "ReliabilityQosPolicyKind");
		addEEnumLiteral(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.BEST_EFFORT);
		addEEnumLiteral(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.RELIABLE);

		initEEnum(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.class, "PresentationQosPolicyAccessScopeKind");
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.INSTANCE);
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.TOPIC);
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.GROUP);

		initEEnum(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.class, "OwnershipQosPolicyKind");
		addEEnumLiteral(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.SHARED);
		addEEnumLiteral(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.EXCLUSIVE);

		initEEnum(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.class, "LivelinessQosPolicyKind");
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.AUTOMATIC);
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.MANUAL_BY_PARTICIPANT);
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.MANUAL_BY_TOPIC);

		initEEnum(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.class, "DurabilityQosPolicyKind");
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.TRANSIENT);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.TRANSIENT_LOCAL);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.VOLATILE);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.PERSISTENT);

		initEEnum(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.class, "DestinationOrderQosPolicyKind");
		addEEnumLiteral(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.BY_RECEPTION_TIMESTAMP);
		addEEnumLiteral(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.BY_SOURCE_TIMESTAMP);

		initEEnum(historyQosPolicyKindEEnum, HistoryQosPolicyKind.class, "HistoryQosPolicyKind");
		addEEnumLiteral(historyQosPolicyKindEEnum, HistoryQosPolicyKind.KEEP_LAST);
		addEEnumLiteral(historyQosPolicyKindEEnum, HistoryQosPolicyKind.KEEP_ALL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations()
	{
		String source = "GenModel";
		addAnnotation
		  (getPeriod_Nanosecond(),
		   source,
		   new String[]
		   {
			   "documentation", "ELong closest to CORBA unsigned long used in DDS spec."
		   });
		addAnnotation
		  (getPeriod_Second(),
		   source,
		   new String[]
		   {
			   "documentation", "EInt corresponds to CORBA long used in DDS spec."
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
		 * The meta object literal for the '{@link enumerations.Period <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.Period
		 * @see enumerations.EnumerationsPackage#getPeriod()
		 * @generated
		 */
		public static final EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Nanosecond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERIOD__NANOSECOND = eINSTANCE.getPeriod_Nanosecond();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERIOD__SECOND = eINSTANCE.getPeriod_Second();

		/**
		 * The meta object literal for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.ReliabilityQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getReliabilityQosPolicyKind()
		 * @generated
		 */
		public static final EEnum RELIABILITY_QOS_POLICY_KIND = eINSTANCE.getReliabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.PresentationQosPolicyAccessScopeKind
		 * @see enumerations.EnumerationsPackage#getPresentationQosPolicyAccessScopeKind()
		 * @generated
		 */
		public static final EEnum PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = eINSTANCE.getPresentationQosPolicyAccessScopeKind();

		/**
		 * The meta object literal for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.OwnershipQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getOwnershipQosPolicyKind()
		 * @generated
		 */
		public static final EEnum OWNERSHIP_QOS_POLICY_KIND = eINSTANCE.getOwnershipQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.LivelinessQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getLivelinessQosPolicyKind()
		 * @generated
		 */
		public static final EEnum LIVELINESS_QOS_POLICY_KIND = eINSTANCE.getLivelinessQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DurabilityQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getDurabilityQosPolicyKind()
		 * @generated
		 */
		public static final EEnum DURABILITY_QOS_POLICY_KIND = eINSTANCE.getDurabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DestinationOrderQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getDestinationOrderQosPolicyKind()
		 * @generated
		 */
		public static final EEnum DESTINATION_ORDER_QOS_POLICY_KIND = eINSTANCE.getDestinationOrderQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.HistoryQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getHistoryQosPolicyKind()
		 * @generated
		 */
		public static final EEnum HISTORY_QOS_POLICY_KIND = eINSTANCE.getHistoryQosPolicyKind();

	}

} //EnumerationsPackage
/**
 */
package enumerations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see enumerations.EnumerationsFactory
 * @model kind="package"
 * @generated
 */
public class EnumerationsPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "enumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.opendds.org/modeling/schemas/Enumerations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "enumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EnumerationsPackage eINSTANCE = enumerations.EnumerationsPackage.init();

	/**
	 * The meta object id for the '{@link enumerations.Period <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.Period
	 * @see enumerations.EnumerationsPackage#getPeriod()
	 * @generated
	 */
	public static final int PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD__NANOSECOND = 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD__SECOND = 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getReliabilityQosPolicyKind()
	 * @generated
	 */
	public static final int RELIABILITY_QOS_POLICY_KIND = 1;

	/**
	 * The meta object id for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @see enumerations.EnumerationsPackage#getPresentationQosPolicyAccessScopeKind()
	 * @generated
	 */
	public static final int PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = 2;

	/**
	 * The meta object id for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.OwnershipQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getOwnershipQosPolicyKind()
	 * @generated
	 */
	public static final int OWNERSHIP_QOS_POLICY_KIND = 3;

	/**
	 * The meta object id for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.LivelinessQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getLivelinessQosPolicyKind()
	 * @generated
	 */
	public static final int LIVELINESS_QOS_POLICY_KIND = 4;

	/**
	 * The meta object id for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DurabilityQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getDurabilityQosPolicyKind()
	 * @generated
	 */
	public static final int DURABILITY_QOS_POLICY_KIND = 5;

	/**
	 * The meta object id for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getDestinationOrderQosPolicyKind()
	 * @generated
	 */
	public static final int DESTINATION_ORDER_QOS_POLICY_KIND = 6;

	/**
	 * The meta object id for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.HistoryQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getHistoryQosPolicyKind()
	 * @generated
	 */
	public static final int HISTORY_QOS_POLICY_KIND = 7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reliabilityQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presentationQosPolicyAccessScopeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ownershipQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum livelinessQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durabilityQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum destinationOrderQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historyQosPolicyKindEEnum = null;

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
	 * @see enumerations.EnumerationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumerationsPackage()
	{
		super(eNS_URI, EnumerationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnumerationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumerationsPackage init()
	{
		if (isInited) return (EnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEnumerationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EnumerationsPackage theEnumerationsPackage = registeredEnumerationsPackage instanceof EnumerationsPackage ? (EnumerationsPackage)registeredEnumerationsPackage : new EnumerationsPackage();

		isInited = true;

		// Create package meta-data objects
		theEnumerationsPackage.createPackageContents();

		// Initialize created meta-data
		theEnumerationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumerationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumerationsPackage.eNS_URI, theEnumerationsPackage);
		return theEnumerationsPackage;
	}


	/**
	 * Returns the meta object for class '{@link enumerations.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see enumerations.Period
	 * @generated
	 */
	public EClass getPeriod()
	{
		return periodEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nanosecond</em>'.
	 * @see enumerations.Period#getNanosecond()
	 * @see #getPeriod()
	 * @generated
	 */
	public EAttribute getPeriod_Nanosecond()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see enumerations.Period#getSecond()
	 * @see #getPeriod()
	 * @generated
	 */
	public EAttribute getPeriod_Second()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reliability Qos Policy Kind</em>'.
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @generated
	 */
	public EEnum getReliabilityQosPolicyKind()
	{
		return reliabilityQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation Qos Policy Access Scope Kind</em>'.
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @generated
	 */
	public EEnum getPresentationQosPolicyAccessScopeKind()
	{
		return presentationQosPolicyAccessScopeKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ownership Qos Policy Kind</em>'.
	 * @see enumerations.OwnershipQosPolicyKind
	 * @generated
	 */
	public EEnum getOwnershipQosPolicyKind()
	{
		return ownershipQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Liveliness Qos Policy Kind</em>'.
	 * @see enumerations.LivelinessQosPolicyKind
	 * @generated
	 */
	public EEnum getLivelinessQosPolicyKind()
	{
		return livelinessQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Durability Qos Policy Kind</em>'.
	 * @see enumerations.DurabilityQosPolicyKind
	 * @generated
	 */
	public EEnum getDurabilityQosPolicyKind()
	{
		return durabilityQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Destination Order Qos Policy Kind</em>'.
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @generated
	 */
	public EEnum getDestinationOrderQosPolicyKind()
	{
		return destinationOrderQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Qos Policy Kind</em>'.
	 * @see enumerations.HistoryQosPolicyKind
	 * @generated
	 */
	public EEnum getHistoryQosPolicyKind()
	{
		return historyQosPolicyKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public EnumerationsFactory getEnumerationsFactory()
	{
		return (EnumerationsFactory)getEFactoryInstance();
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
		periodEClass = createEClass(PERIOD);
		createEAttribute(periodEClass, PERIOD__NANOSECOND);
		createEAttribute(periodEClass, PERIOD__SECOND);

		// Create enums
		reliabilityQosPolicyKindEEnum = createEEnum(RELIABILITY_QOS_POLICY_KIND);
		presentationQosPolicyAccessScopeKindEEnum = createEEnum(PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND);
		ownershipQosPolicyKindEEnum = createEEnum(OWNERSHIP_QOS_POLICY_KIND);
		livelinessQosPolicyKindEEnum = createEEnum(LIVELINESS_QOS_POLICY_KIND);
		durabilityQosPolicyKindEEnum = createEEnum(DURABILITY_QOS_POLICY_KIND);
		destinationOrderQosPolicyKindEEnum = createEEnum(DESTINATION_ORDER_QOS_POLICY_KIND);
		historyQosPolicyKindEEnum = createEEnum(HISTORY_QOS_POLICY_KIND);
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
		initEClass(periodEClass, Period.class, "Period", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriod_Nanosecond(), ecorePackage.getELong(), "nanosecond", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriod_Second(), ecorePackage.getEInt(), "second", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.class, "ReliabilityQosPolicyKind");
		addEEnumLiteral(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.BEST_EFFORT);
		addEEnumLiteral(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.RELIABLE);

		initEEnum(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.class, "PresentationQosPolicyAccessScopeKind");
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.INSTANCE);
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.TOPIC);
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.GROUP);

		initEEnum(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.class, "OwnershipQosPolicyKind");
		addEEnumLiteral(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.SHARED);
		addEEnumLiteral(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.EXCLUSIVE);

		initEEnum(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.class, "LivelinessQosPolicyKind");
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.AUTOMATIC);
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.MANUAL_BY_PARTICIPANT);
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.MANUAL_BY_TOPIC);

		initEEnum(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.class, "DurabilityQosPolicyKind");
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.TRANSIENT);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.TRANSIENT_LOCAL);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.VOLATILE);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.PERSISTENT);

		initEEnum(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.class, "DestinationOrderQosPolicyKind");
		addEEnumLiteral(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.BY_RECEPTION_TIMESTAMP);
		addEEnumLiteral(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.BY_SOURCE_TIMESTAMP);

		initEEnum(historyQosPolicyKindEEnum, HistoryQosPolicyKind.class, "HistoryQosPolicyKind");
		addEEnumLiteral(historyQosPolicyKindEEnum, HistoryQosPolicyKind.KEEP_LAST);
		addEEnumLiteral(historyQosPolicyKindEEnum, HistoryQosPolicyKind.KEEP_ALL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations()
	{
		String source = "GenModel";
		addAnnotation
		  (getPeriod_Nanosecond(),
		   source,
		   new String[]
		   {
			   "documentation", "ELong closest to CORBA unsigned long used in DDS spec."
		   });
		addAnnotation
		  (getPeriod_Second(),
		   source,
		   new String[]
		   {
			   "documentation", "EInt corresponds to CORBA long used in DDS spec."
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
		 * The meta object literal for the '{@link enumerations.Period <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.Period
		 * @see enumerations.EnumerationsPackage#getPeriod()
		 * @generated
		 */
		public static final EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Nanosecond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERIOD__NANOSECOND = eINSTANCE.getPeriod_Nanosecond();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERIOD__SECOND = eINSTANCE.getPeriod_Second();

		/**
		 * The meta object literal for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.ReliabilityQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getReliabilityQosPolicyKind()
		 * @generated
		 */
		public static final EEnum RELIABILITY_QOS_POLICY_KIND = eINSTANCE.getReliabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.PresentationQosPolicyAccessScopeKind
		 * @see enumerations.EnumerationsPackage#getPresentationQosPolicyAccessScopeKind()
		 * @generated
		 */
		public static final EEnum PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = eINSTANCE.getPresentationQosPolicyAccessScopeKind();

		/**
		 * The meta object literal for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.OwnershipQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getOwnershipQosPolicyKind()
		 * @generated
		 */
		public static final EEnum OWNERSHIP_QOS_POLICY_KIND = eINSTANCE.getOwnershipQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.LivelinessQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getLivelinessQosPolicyKind()
		 * @generated
		 */
		public static final EEnum LIVELINESS_QOS_POLICY_KIND = eINSTANCE.getLivelinessQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DurabilityQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getDurabilityQosPolicyKind()
		 * @generated
		 */
		public static final EEnum DURABILITY_QOS_POLICY_KIND = eINSTANCE.getDurabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DestinationOrderQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getDestinationOrderQosPolicyKind()
		 * @generated
		 */
		public static final EEnum DESTINATION_ORDER_QOS_POLICY_KIND = eINSTANCE.getDestinationOrderQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.HistoryQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getHistoryQosPolicyKind()
		 * @generated
		 */
		public static final EEnum HISTORY_QOS_POLICY_KIND = eINSTANCE.getHistoryQosPolicyKind();

	}

} //EnumerationsPackage
/**
 */
package enumerations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see enumerations.EnumerationsFactory
 * @model kind="package"
 * @generated
 */
public class EnumerationsPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "enumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.opendds.org/modeling/schemas/Enumerations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "enumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EnumerationsPackage eINSTANCE = enumerations.EnumerationsPackage.init();

	/**
	 * The meta object id for the '{@link enumerations.Period <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.Period
	 * @see enumerations.EnumerationsPackage#getPeriod()
	 * @generated
	 */
	public static final int PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD__NANOSECOND = 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD__SECOND = 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getReliabilityQosPolicyKind()
	 * @generated
	 */
	public static final int RELIABILITY_QOS_POLICY_KIND = 1;

	/**
	 * The meta object id for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @see enumerations.EnumerationsPackage#getPresentationQosPolicyAccessScopeKind()
	 * @generated
	 */
	public static final int PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = 2;

	/**
	 * The meta object id for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.OwnershipQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getOwnershipQosPolicyKind()
	 * @generated
	 */
	public static final int OWNERSHIP_QOS_POLICY_KIND = 3;

	/**
	 * The meta object id for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.LivelinessQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getLivelinessQosPolicyKind()
	 * @generated
	 */
	public static final int LIVELINESS_QOS_POLICY_KIND = 4;

	/**
	 * The meta object id for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DurabilityQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getDurabilityQosPolicyKind()
	 * @generated
	 */
	public static final int DURABILITY_QOS_POLICY_KIND = 5;

	/**
	 * The meta object id for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getDestinationOrderQosPolicyKind()
	 * @generated
	 */
	public static final int DESTINATION_ORDER_QOS_POLICY_KIND = 6;

	/**
	 * The meta object id for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.HistoryQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getHistoryQosPolicyKind()
	 * @generated
	 */
	public static final int HISTORY_QOS_POLICY_KIND = 7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reliabilityQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presentationQosPolicyAccessScopeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ownershipQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum livelinessQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durabilityQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum destinationOrderQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historyQosPolicyKindEEnum = null;

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
	 * @see enumerations.EnumerationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumerationsPackage()
	{
		super(eNS_URI, EnumerationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnumerationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumerationsPackage init()
	{
		if (isInited) return (EnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEnumerationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EnumerationsPackage theEnumerationsPackage = registeredEnumerationsPackage instanceof EnumerationsPackage ? (EnumerationsPackage)registeredEnumerationsPackage : new EnumerationsPackage();

		isInited = true;

		// Create package meta-data objects
		theEnumerationsPackage.createPackageContents();

		// Initialize created meta-data
		theEnumerationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumerationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumerationsPackage.eNS_URI, theEnumerationsPackage);
		return theEnumerationsPackage;
	}


	/**
	 * Returns the meta object for class '{@link enumerations.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see enumerations.Period
	 * @generated
	 */
	public EClass getPeriod()
	{
		return periodEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nanosecond</em>'.
	 * @see enumerations.Period#getNanosecond()
	 * @see #getPeriod()
	 * @generated
	 */
	public EAttribute getPeriod_Nanosecond()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see enumerations.Period#getSecond()
	 * @see #getPeriod()
	 * @generated
	 */
	public EAttribute getPeriod_Second()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reliability Qos Policy Kind</em>'.
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @generated
	 */
	public EEnum getReliabilityQosPolicyKind()
	{
		return reliabilityQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation Qos Policy Access Scope Kind</em>'.
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @generated
	 */
	public EEnum getPresentationQosPolicyAccessScopeKind()
	{
		return presentationQosPolicyAccessScopeKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ownership Qos Policy Kind</em>'.
	 * @see enumerations.OwnershipQosPolicyKind
	 * @generated
	 */
	public EEnum getOwnershipQosPolicyKind()
	{
		return ownershipQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Liveliness Qos Policy Kind</em>'.
	 * @see enumerations.LivelinessQosPolicyKind
	 * @generated
	 */
	public EEnum getLivelinessQosPolicyKind()
	{
		return livelinessQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Durability Qos Policy Kind</em>'.
	 * @see enumerations.DurabilityQosPolicyKind
	 * @generated
	 */
	public EEnum getDurabilityQosPolicyKind()
	{
		return durabilityQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Destination Order Qos Policy Kind</em>'.
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @generated
	 */
	public EEnum getDestinationOrderQosPolicyKind()
	{
		return destinationOrderQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Qos Policy Kind</em>'.
	 * @see enumerations.HistoryQosPolicyKind
	 * @generated
	 */
	public EEnum getHistoryQosPolicyKind()
	{
		return historyQosPolicyKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public EnumerationsFactory getEnumerationsFactory()
	{
		return (EnumerationsFactory)getEFactoryInstance();
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
		periodEClass = createEClass(PERIOD);
		createEAttribute(periodEClass, PERIOD__NANOSECOND);
		createEAttribute(periodEClass, PERIOD__SECOND);

		// Create enums
		reliabilityQosPolicyKindEEnum = createEEnum(RELIABILITY_QOS_POLICY_KIND);
		presentationQosPolicyAccessScopeKindEEnum = createEEnum(PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND);
		ownershipQosPolicyKindEEnum = createEEnum(OWNERSHIP_QOS_POLICY_KIND);
		livelinessQosPolicyKindEEnum = createEEnum(LIVELINESS_QOS_POLICY_KIND);
		durabilityQosPolicyKindEEnum = createEEnum(DURABILITY_QOS_POLICY_KIND);
		destinationOrderQosPolicyKindEEnum = createEEnum(DESTINATION_ORDER_QOS_POLICY_KIND);
		historyQosPolicyKindEEnum = createEEnum(HISTORY_QOS_POLICY_KIND);
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
		initEClass(periodEClass, Period.class, "Period", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriod_Nanosecond(), ecorePackage.getELong(), "nanosecond", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriod_Second(), ecorePackage.getEInt(), "second", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.class, "ReliabilityQosPolicyKind");
		addEEnumLiteral(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.BEST_EFFORT);
		addEEnumLiteral(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.RELIABLE);

		initEEnum(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.class, "PresentationQosPolicyAccessScopeKind");
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.INSTANCE);
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.TOPIC);
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.GROUP);

		initEEnum(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.class, "OwnershipQosPolicyKind");
		addEEnumLiteral(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.SHARED);
		addEEnumLiteral(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.EXCLUSIVE);

		initEEnum(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.class, "LivelinessQosPolicyKind");
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.AUTOMATIC);
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.MANUAL_BY_PARTICIPANT);
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.MANUAL_BY_TOPIC);

		initEEnum(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.class, "DurabilityQosPolicyKind");
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.TRANSIENT);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.TRANSIENT_LOCAL);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.VOLATILE);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.PERSISTENT);

		initEEnum(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.class, "DestinationOrderQosPolicyKind");
		addEEnumLiteral(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.BY_RECEPTION_TIMESTAMP);
		addEEnumLiteral(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.BY_SOURCE_TIMESTAMP);

		initEEnum(historyQosPolicyKindEEnum, HistoryQosPolicyKind.class, "HistoryQosPolicyKind");
		addEEnumLiteral(historyQosPolicyKindEEnum, HistoryQosPolicyKind.KEEP_LAST);
		addEEnumLiteral(historyQosPolicyKindEEnum, HistoryQosPolicyKind.KEEP_ALL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations()
	{
		String source = "GenModel";
		addAnnotation
		  (getPeriod_Nanosecond(),
		   source,
		   new String[]
		   {
			   "documentation", "ELong closest to CORBA unsigned long used in DDS spec."
		   });
		addAnnotation
		  (getPeriod_Second(),
		   source,
		   new String[]
		   {
			   "documentation", "EInt corresponds to CORBA long used in DDS spec."
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
		 * The meta object literal for the '{@link enumerations.Period <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.Period
		 * @see enumerations.EnumerationsPackage#getPeriod()
		 * @generated
		 */
		public static final EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Nanosecond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERIOD__NANOSECOND = eINSTANCE.getPeriod_Nanosecond();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERIOD__SECOND = eINSTANCE.getPeriod_Second();

		/**
		 * The meta object literal for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.ReliabilityQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getReliabilityQosPolicyKind()
		 * @generated
		 */
		public static final EEnum RELIABILITY_QOS_POLICY_KIND = eINSTANCE.getReliabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.PresentationQosPolicyAccessScopeKind
		 * @see enumerations.EnumerationsPackage#getPresentationQosPolicyAccessScopeKind()
		 * @generated
		 */
		public static final EEnum PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = eINSTANCE.getPresentationQosPolicyAccessScopeKind();

		/**
		 * The meta object literal for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.OwnershipQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getOwnershipQosPolicyKind()
		 * @generated
		 */
		public static final EEnum OWNERSHIP_QOS_POLICY_KIND = eINSTANCE.getOwnershipQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.LivelinessQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getLivelinessQosPolicyKind()
		 * @generated
		 */
		public static final EEnum LIVELINESS_QOS_POLICY_KIND = eINSTANCE.getLivelinessQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DurabilityQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getDurabilityQosPolicyKind()
		 * @generated
		 */
		public static final EEnum DURABILITY_QOS_POLICY_KIND = eINSTANCE.getDurabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DestinationOrderQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getDestinationOrderQosPolicyKind()
		 * @generated
		 */
		public static final EEnum DESTINATION_ORDER_QOS_POLICY_KIND = eINSTANCE.getDestinationOrderQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.HistoryQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getHistoryQosPolicyKind()
		 * @generated
		 */
		public static final EEnum HISTORY_QOS_POLICY_KIND = eINSTANCE.getHistoryQosPolicyKind();

	}

} //EnumerationsPackage
/**
 */
package enumerations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see enumerations.EnumerationsFactory
 * @model kind="package"
 * @generated
 */
public class EnumerationsPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "enumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.opendds.org/modeling/schemas/Enumerations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "enumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EnumerationsPackage eINSTANCE = enumerations.EnumerationsPackage.init();

	/**
	 * The meta object id for the '{@link enumerations.Period <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.Period
	 * @see enumerations.EnumerationsPackage#getPeriod()
	 * @generated
	 */
	public static final int PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD__NANOSECOND = 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD__SECOND = 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getReliabilityQosPolicyKind()
	 * @generated
	 */
	public static final int RELIABILITY_QOS_POLICY_KIND = 1;

	/**
	 * The meta object id for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @see enumerations.EnumerationsPackage#getPresentationQosPolicyAccessScopeKind()
	 * @generated
	 */
	public static final int PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = 2;

	/**
	 * The meta object id for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.OwnershipQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getOwnershipQosPolicyKind()
	 * @generated
	 */
	public static final int OWNERSHIP_QOS_POLICY_KIND = 3;

	/**
	 * The meta object id for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.LivelinessQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getLivelinessQosPolicyKind()
	 * @generated
	 */
	public static final int LIVELINESS_QOS_POLICY_KIND = 4;

	/**
	 * The meta object id for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DurabilityQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getDurabilityQosPolicyKind()
	 * @generated
	 */
	public static final int DURABILITY_QOS_POLICY_KIND = 5;

	/**
	 * The meta object id for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getDestinationOrderQosPolicyKind()
	 * @generated
	 */
	public static final int DESTINATION_ORDER_QOS_POLICY_KIND = 6;

	/**
	 * The meta object id for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.HistoryQosPolicyKind
	 * @see enumerations.EnumerationsPackage#getHistoryQosPolicyKind()
	 * @generated
	 */
	public static final int HISTORY_QOS_POLICY_KIND = 7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reliabilityQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presentationQosPolicyAccessScopeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ownershipQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum livelinessQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durabilityQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum destinationOrderQosPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historyQosPolicyKindEEnum = null;

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
	 * @see enumerations.EnumerationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumerationsPackage()
	{
		super(eNS_URI, EnumerationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnumerationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumerationsPackage init()
	{
		if (isInited) return (EnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEnumerationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EnumerationsPackage theEnumerationsPackage = registeredEnumerationsPackage instanceof EnumerationsPackage ? (EnumerationsPackage)registeredEnumerationsPackage : new EnumerationsPackage();

		isInited = true;

		// Create package meta-data objects
		theEnumerationsPackage.createPackageContents();

		// Initialize created meta-data
		theEnumerationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumerationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumerationsPackage.eNS_URI, theEnumerationsPackage);
		return theEnumerationsPackage;
	}


	/**
	 * Returns the meta object for class '{@link enumerations.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see enumerations.Period
	 * @generated
	 */
	public EClass getPeriod()
	{
		return periodEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nanosecond</em>'.
	 * @see enumerations.Period#getNanosecond()
	 * @see #getPeriod()
	 * @generated
	 */
	public EAttribute getPeriod_Nanosecond()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see enumerations.Period#getSecond()
	 * @see #getPeriod()
	 * @generated
	 */
	public EAttribute getPeriod_Second()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reliability Qos Policy Kind</em>'.
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @generated
	 */
	public EEnum getReliabilityQosPolicyKind()
	{
		return reliabilityQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation Qos Policy Access Scope Kind</em>'.
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @generated
	 */
	public EEnum getPresentationQosPolicyAccessScopeKind()
	{
		return presentationQosPolicyAccessScopeKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ownership Qos Policy Kind</em>'.
	 * @see enumerations.OwnershipQosPolicyKind
	 * @generated
	 */
	public EEnum getOwnershipQosPolicyKind()
	{
		return ownershipQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Liveliness Qos Policy Kind</em>'.
	 * @see enumerations.LivelinessQosPolicyKind
	 * @generated
	 */
	public EEnum getLivelinessQosPolicyKind()
	{
		return livelinessQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Durability Qos Policy Kind</em>'.
	 * @see enumerations.DurabilityQosPolicyKind
	 * @generated
	 */
	public EEnum getDurabilityQosPolicyKind()
	{
		return durabilityQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Destination Order Qos Policy Kind</em>'.
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @generated
	 */
	public EEnum getDestinationOrderQosPolicyKind()
	{
		return destinationOrderQosPolicyKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Qos Policy Kind</em>'.
	 * @see enumerations.HistoryQosPolicyKind
	 * @generated
	 */
	public EEnum getHistoryQosPolicyKind()
	{
		return historyQosPolicyKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public EnumerationsFactory getEnumerationsFactory()
	{
		return (EnumerationsFactory)getEFactoryInstance();
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
		periodEClass = createEClass(PERIOD);
		createEAttribute(periodEClass, PERIOD__NANOSECOND);
		createEAttribute(periodEClass, PERIOD__SECOND);

		// Create enums
		reliabilityQosPolicyKindEEnum = createEEnum(RELIABILITY_QOS_POLICY_KIND);
		presentationQosPolicyAccessScopeKindEEnum = createEEnum(PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND);
		ownershipQosPolicyKindEEnum = createEEnum(OWNERSHIP_QOS_POLICY_KIND);
		livelinessQosPolicyKindEEnum = createEEnum(LIVELINESS_QOS_POLICY_KIND);
		durabilityQosPolicyKindEEnum = createEEnum(DURABILITY_QOS_POLICY_KIND);
		destinationOrderQosPolicyKindEEnum = createEEnum(DESTINATION_ORDER_QOS_POLICY_KIND);
		historyQosPolicyKindEEnum = createEEnum(HISTORY_QOS_POLICY_KIND);
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
		initEClass(periodEClass, Period.class, "Period", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriod_Nanosecond(), ecorePackage.getELong(), "nanosecond", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriod_Second(), ecorePackage.getEInt(), "second", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.class, "ReliabilityQosPolicyKind");
		addEEnumLiteral(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.BEST_EFFORT);
		addEEnumLiteral(reliabilityQosPolicyKindEEnum, ReliabilityQosPolicyKind.RELIABLE);

		initEEnum(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.class, "PresentationQosPolicyAccessScopeKind");
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.INSTANCE);
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.TOPIC);
		addEEnumLiteral(presentationQosPolicyAccessScopeKindEEnum, PresentationQosPolicyAccessScopeKind.GROUP);

		initEEnum(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.class, "OwnershipQosPolicyKind");
		addEEnumLiteral(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.SHARED);
		addEEnumLiteral(ownershipQosPolicyKindEEnum, OwnershipQosPolicyKind.EXCLUSIVE);

		initEEnum(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.class, "LivelinessQosPolicyKind");
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.AUTOMATIC);
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.MANUAL_BY_PARTICIPANT);
		addEEnumLiteral(livelinessQosPolicyKindEEnum, LivelinessQosPolicyKind.MANUAL_BY_TOPIC);

		initEEnum(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.class, "DurabilityQosPolicyKind");
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.TRANSIENT);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.TRANSIENT_LOCAL);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.VOLATILE);
		addEEnumLiteral(durabilityQosPolicyKindEEnum, DurabilityQosPolicyKind.PERSISTENT);

		initEEnum(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.class, "DestinationOrderQosPolicyKind");
		addEEnumLiteral(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.BY_RECEPTION_TIMESTAMP);
		addEEnumLiteral(destinationOrderQosPolicyKindEEnum, DestinationOrderQosPolicyKind.BY_SOURCE_TIMESTAMP);

		initEEnum(historyQosPolicyKindEEnum, HistoryQosPolicyKind.class, "HistoryQosPolicyKind");
		addEEnumLiteral(historyQosPolicyKindEEnum, HistoryQosPolicyKind.KEEP_LAST);
		addEEnumLiteral(historyQosPolicyKindEEnum, HistoryQosPolicyKind.KEEP_ALL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations()
	{
		String source = "GenModel";
		addAnnotation
		  (getPeriod_Nanosecond(),
		   source,
		   new String[]
		   {
			   "documentation", "ELong closest to CORBA unsigned long used in DDS spec."
		   });
		addAnnotation
		  (getPeriod_Second(),
		   source,
		   new String[]
		   {
			   "documentation", "EInt corresponds to CORBA long used in DDS spec."
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
		 * The meta object literal for the '{@link enumerations.Period <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.Period
		 * @see enumerations.EnumerationsPackage#getPeriod()
		 * @generated
		 */
		public static final EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Nanosecond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERIOD__NANOSECOND = eINSTANCE.getPeriod_Nanosecond();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERIOD__SECOND = eINSTANCE.getPeriod_Second();

		/**
		 * The meta object literal for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.ReliabilityQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getReliabilityQosPolicyKind()
		 * @generated
		 */
		public static final EEnum RELIABILITY_QOS_POLICY_KIND = eINSTANCE.getReliabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.PresentationQosPolicyAccessScopeKind
		 * @see enumerations.EnumerationsPackage#getPresentationQosPolicyAccessScopeKind()
		 * @generated
		 */
		public static final EEnum PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = eINSTANCE.getPresentationQosPolicyAccessScopeKind();

		/**
		 * The meta object literal for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.OwnershipQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getOwnershipQosPolicyKind()
		 * @generated
		 */
		public static final EEnum OWNERSHIP_QOS_POLICY_KIND = eINSTANCE.getOwnershipQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.LivelinessQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getLivelinessQosPolicyKind()
		 * @generated
		 */
		public static final EEnum LIVELINESS_QOS_POLICY_KIND = eINSTANCE.getLivelinessQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DurabilityQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getDurabilityQosPolicyKind()
		 * @generated
		 */
		public static final EEnum DURABILITY_QOS_POLICY_KIND = eINSTANCE.getDurabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DestinationOrderQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getDestinationOrderQosPolicyKind()
		 * @generated
		 */
		public static final EEnum DESTINATION_ORDER_QOS_POLICY_KIND = eINSTANCE.getDestinationOrderQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.HistoryQosPolicyKind
		 * @see enumerations.EnumerationsPackage#getHistoryQosPolicyKind()
		 * @generated
		 */
		public static final EEnum HISTORY_QOS_POLICY_KIND = eINSTANCE.getHistoryQosPolicyKind();

	}

} //EnumerationsPackage
