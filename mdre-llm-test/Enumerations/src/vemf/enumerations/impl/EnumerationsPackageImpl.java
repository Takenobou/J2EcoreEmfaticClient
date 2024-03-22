/**
 */
package enumerations.impl;

import enumerations.DestinationOrderQosPolicyKind;
import enumerations.DurabilityQosPolicyKind;
import enumerations.EnumerationsFactory;
import enumerations.EnumerationsPackage;
import enumerations.HistoryQosPolicyKind;
import enumerations.LivelinessQosPolicyKind;
import enumerations.OwnershipQosPolicyKind;
import enumerations.Period;
import enumerations.PresentationQosPolicyAccessScopeKind;
import enumerations.ReliabilityQosPolicyKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerationsPackageImpl extends EPackageImpl implements EnumerationsPackage
{
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
	private EnumerationsPackageImpl()
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
		EnumerationsPackageImpl theEnumerationsPackage = registeredEnumerationsPackage instanceof EnumerationsPackageImpl ? (EnumerationsPackageImpl)registeredEnumerationsPackage : new EnumerationsPackageImpl();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriod()
	{
		return periodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriod_Nanosecond()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriod_Second()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReliabilityQosPolicyKind()
	{
		return reliabilityQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPresentationQosPolicyAccessScopeKind()
	{
		return presentationQosPolicyAccessScopeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOwnershipQosPolicyKind()
	{
		return ownershipQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLivelinessQosPolicyKind()
	{
		return livelinessQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurabilityQosPolicyKind()
	{
		return durabilityQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDestinationOrderQosPolicyKind()
	{
		return destinationOrderQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHistoryQosPolicyKind()
	{
		return historyQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //EnumerationsPackageImpl
/**
 */
package enumerations.impl;

import enumerations.DestinationOrderQosPolicyKind;
import enumerations.DurabilityQosPolicyKind;
import enumerations.EnumerationsFactory;
import enumerations.EnumerationsPackage;
import enumerations.HistoryQosPolicyKind;
import enumerations.LivelinessQosPolicyKind;
import enumerations.OwnershipQosPolicyKind;
import enumerations.Period;
import enumerations.PresentationQosPolicyAccessScopeKind;
import enumerations.ReliabilityQosPolicyKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerationsPackageImpl extends EPackageImpl implements EnumerationsPackage
{
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
	private EnumerationsPackageImpl()
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
		EnumerationsPackageImpl theEnumerationsPackage = registeredEnumerationsPackage instanceof EnumerationsPackageImpl ? (EnumerationsPackageImpl)registeredEnumerationsPackage : new EnumerationsPackageImpl();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriod()
	{
		return periodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriod_Nanosecond()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriod_Second()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReliabilityQosPolicyKind()
	{
		return reliabilityQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPresentationQosPolicyAccessScopeKind()
	{
		return presentationQosPolicyAccessScopeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOwnershipQosPolicyKind()
	{
		return ownershipQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLivelinessQosPolicyKind()
	{
		return livelinessQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurabilityQosPolicyKind()
	{
		return durabilityQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDestinationOrderQosPolicyKind()
	{
		return destinationOrderQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHistoryQosPolicyKind()
	{
		return historyQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //EnumerationsPackageImpl
/**
 */
package enumerations.impl;

import enumerations.DestinationOrderQosPolicyKind;
import enumerations.DurabilityQosPolicyKind;
import enumerations.EnumerationsFactory;
import enumerations.EnumerationsPackage;
import enumerations.HistoryQosPolicyKind;
import enumerations.LivelinessQosPolicyKind;
import enumerations.OwnershipQosPolicyKind;
import enumerations.Period;
import enumerations.PresentationQosPolicyAccessScopeKind;
import enumerations.ReliabilityQosPolicyKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerationsPackageImpl extends EPackageImpl implements EnumerationsPackage
{
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
	private EnumerationsPackageImpl()
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
		EnumerationsPackageImpl theEnumerationsPackage = registeredEnumerationsPackage instanceof EnumerationsPackageImpl ? (EnumerationsPackageImpl)registeredEnumerationsPackage : new EnumerationsPackageImpl();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriod()
	{
		return periodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriod_Nanosecond()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriod_Second()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReliabilityQosPolicyKind()
	{
		return reliabilityQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPresentationQosPolicyAccessScopeKind()
	{
		return presentationQosPolicyAccessScopeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOwnershipQosPolicyKind()
	{
		return ownershipQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLivelinessQosPolicyKind()
	{
		return livelinessQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurabilityQosPolicyKind()
	{
		return durabilityQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDestinationOrderQosPolicyKind()
	{
		return destinationOrderQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHistoryQosPolicyKind()
	{
		return historyQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //EnumerationsPackageImpl
/**
 */
package enumerations.impl;

import enumerations.DestinationOrderQosPolicyKind;
import enumerations.DurabilityQosPolicyKind;
import enumerations.EnumerationsFactory;
import enumerations.EnumerationsPackage;
import enumerations.HistoryQosPolicyKind;
import enumerations.LivelinessQosPolicyKind;
import enumerations.OwnershipQosPolicyKind;
import enumerations.Period;
import enumerations.PresentationQosPolicyAccessScopeKind;
import enumerations.ReliabilityQosPolicyKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerationsPackageImpl extends EPackageImpl implements EnumerationsPackage
{
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
	private EnumerationsPackageImpl()
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
		EnumerationsPackageImpl theEnumerationsPackage = registeredEnumerationsPackage instanceof EnumerationsPackageImpl ? (EnumerationsPackageImpl)registeredEnumerationsPackage : new EnumerationsPackageImpl();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriod()
	{
		return periodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriod_Nanosecond()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriod_Second()
	{
		return (EAttribute)periodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReliabilityQosPolicyKind()
	{
		return reliabilityQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPresentationQosPolicyAccessScopeKind()
	{
		return presentationQosPolicyAccessScopeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOwnershipQosPolicyKind()
	{
		return ownershipQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLivelinessQosPolicyKind()
	{
		return livelinessQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurabilityQosPolicyKind()
	{
		return durabilityQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDestinationOrderQosPolicyKind()
	{
		return destinationOrderQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHistoryQosPolicyKind()
	{
		return historyQosPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //EnumerationsPackageImpl
