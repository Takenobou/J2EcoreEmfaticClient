/**
 */
package enumerations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
public interface EnumerationsPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opendds.org/modeling/schemas/Enumerations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "enumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumerationsPackage eINSTANCE = enumerations.impl.EnumerationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link enumerations.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.impl.PeriodImpl
	 * @see enumerations.impl.EnumerationsPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__NANOSECOND = 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__SECOND = 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getReliabilityQosPolicyKind()
	 * @generated
	 */
	int RELIABILITY_QOS_POLICY_KIND = 1;

	/**
	 * The meta object id for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getPresentationQosPolicyAccessScopeKind()
	 * @generated
	 */
	int PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = 2;

	/**
	 * The meta object id for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.OwnershipQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getOwnershipQosPolicyKind()
	 * @generated
	 */
	int OWNERSHIP_QOS_POLICY_KIND = 3;

	/**
	 * The meta object id for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.LivelinessQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getLivelinessQosPolicyKind()
	 * @generated
	 */
	int LIVELINESS_QOS_POLICY_KIND = 4;

	/**
	 * The meta object id for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DurabilityQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getDurabilityQosPolicyKind()
	 * @generated
	 */
	int DURABILITY_QOS_POLICY_KIND = 5;

	/**
	 * The meta object id for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getDestinationOrderQosPolicyKind()
	 * @generated
	 */
	int DESTINATION_ORDER_QOS_POLICY_KIND = 6;

	/**
	 * The meta object id for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.HistoryQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getHistoryQosPolicyKind()
	 * @generated
	 */
	int HISTORY_QOS_POLICY_KIND = 7;


	/**
	 * Returns the meta object for class '{@link enumerations.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see enumerations.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nanosecond</em>'.
	 * @see enumerations.Period#getNanosecond()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Nanosecond();

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see enumerations.Period#getSecond()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Second();

	/**
	 * Returns the meta object for enum '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reliability Qos Policy Kind</em>'.
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @generated
	 */
	EEnum getReliabilityQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation Qos Policy Access Scope Kind</em>'.
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @generated
	 */
	EEnum getPresentationQosPolicyAccessScopeKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ownership Qos Policy Kind</em>'.
	 * @see enumerations.OwnershipQosPolicyKind
	 * @generated
	 */
	EEnum getOwnershipQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Liveliness Qos Policy Kind</em>'.
	 * @see enumerations.LivelinessQosPolicyKind
	 * @generated
	 */
	EEnum getLivelinessQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Durability Qos Policy Kind</em>'.
	 * @see enumerations.DurabilityQosPolicyKind
	 * @generated
	 */
	EEnum getDurabilityQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Destination Order Qos Policy Kind</em>'.
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @generated
	 */
	EEnum getDestinationOrderQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Qos Policy Kind</em>'.
	 * @see enumerations.HistoryQosPolicyKind
	 * @generated
	 */
	EEnum getHistoryQosPolicyKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumerationsFactory getEnumerationsFactory();

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
		 * The meta object literal for the '{@link enumerations.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.impl.PeriodImpl
		 * @see enumerations.impl.EnumerationsPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Nanosecond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__NANOSECOND = eINSTANCE.getPeriod_Nanosecond();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__SECOND = eINSTANCE.getPeriod_Second();

		/**
		 * The meta object literal for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.ReliabilityQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getReliabilityQosPolicyKind()
		 * @generated
		 */
		EEnum RELIABILITY_QOS_POLICY_KIND = eINSTANCE.getReliabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.PresentationQosPolicyAccessScopeKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getPresentationQosPolicyAccessScopeKind()
		 * @generated
		 */
		EEnum PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = eINSTANCE.getPresentationQosPolicyAccessScopeKind();

		/**
		 * The meta object literal for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.OwnershipQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getOwnershipQosPolicyKind()
		 * @generated
		 */
		EEnum OWNERSHIP_QOS_POLICY_KIND = eINSTANCE.getOwnershipQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.LivelinessQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getLivelinessQosPolicyKind()
		 * @generated
		 */
		EEnum LIVELINESS_QOS_POLICY_KIND = eINSTANCE.getLivelinessQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DurabilityQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getDurabilityQosPolicyKind()
		 * @generated
		 */
		EEnum DURABILITY_QOS_POLICY_KIND = eINSTANCE.getDurabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DestinationOrderQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getDestinationOrderQosPolicyKind()
		 * @generated
		 */
		EEnum DESTINATION_ORDER_QOS_POLICY_KIND = eINSTANCE.getDestinationOrderQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.HistoryQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getHistoryQosPolicyKind()
		 * @generated
		 */
		EEnum HISTORY_QOS_POLICY_KIND = eINSTANCE.getHistoryQosPolicyKind();

	}

} //EnumerationsPackage
/**
 */
package enumerations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
public interface EnumerationsPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opendds.org/modeling/schemas/Enumerations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "enumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumerationsPackage eINSTANCE = enumerations.impl.EnumerationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link enumerations.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.impl.PeriodImpl
	 * @see enumerations.impl.EnumerationsPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__NANOSECOND = 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__SECOND = 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getReliabilityQosPolicyKind()
	 * @generated
	 */
	int RELIABILITY_QOS_POLICY_KIND = 1;

	/**
	 * The meta object id for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getPresentationQosPolicyAccessScopeKind()
	 * @generated
	 */
	int PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = 2;

	/**
	 * The meta object id for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.OwnershipQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getOwnershipQosPolicyKind()
	 * @generated
	 */
	int OWNERSHIP_QOS_POLICY_KIND = 3;

	/**
	 * The meta object id for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.LivelinessQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getLivelinessQosPolicyKind()
	 * @generated
	 */
	int LIVELINESS_QOS_POLICY_KIND = 4;

	/**
	 * The meta object id for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DurabilityQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getDurabilityQosPolicyKind()
	 * @generated
	 */
	int DURABILITY_QOS_POLICY_KIND = 5;

	/**
	 * The meta object id for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getDestinationOrderQosPolicyKind()
	 * @generated
	 */
	int DESTINATION_ORDER_QOS_POLICY_KIND = 6;

	/**
	 * The meta object id for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.HistoryQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getHistoryQosPolicyKind()
	 * @generated
	 */
	int HISTORY_QOS_POLICY_KIND = 7;


	/**
	 * Returns the meta object for class '{@link enumerations.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see enumerations.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nanosecond</em>'.
	 * @see enumerations.Period#getNanosecond()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Nanosecond();

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see enumerations.Period#getSecond()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Second();

	/**
	 * Returns the meta object for enum '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reliability Qos Policy Kind</em>'.
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @generated
	 */
	EEnum getReliabilityQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation Qos Policy Access Scope Kind</em>'.
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @generated
	 */
	EEnum getPresentationQosPolicyAccessScopeKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ownership Qos Policy Kind</em>'.
	 * @see enumerations.OwnershipQosPolicyKind
	 * @generated
	 */
	EEnum getOwnershipQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Liveliness Qos Policy Kind</em>'.
	 * @see enumerations.LivelinessQosPolicyKind
	 * @generated
	 */
	EEnum getLivelinessQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Durability Qos Policy Kind</em>'.
	 * @see enumerations.DurabilityQosPolicyKind
	 * @generated
	 */
	EEnum getDurabilityQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Destination Order Qos Policy Kind</em>'.
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @generated
	 */
	EEnum getDestinationOrderQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Qos Policy Kind</em>'.
	 * @see enumerations.HistoryQosPolicyKind
	 * @generated
	 */
	EEnum getHistoryQosPolicyKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumerationsFactory getEnumerationsFactory();

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
		 * The meta object literal for the '{@link enumerations.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.impl.PeriodImpl
		 * @see enumerations.impl.EnumerationsPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Nanosecond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__NANOSECOND = eINSTANCE.getPeriod_Nanosecond();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__SECOND = eINSTANCE.getPeriod_Second();

		/**
		 * The meta object literal for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.ReliabilityQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getReliabilityQosPolicyKind()
		 * @generated
		 */
		EEnum RELIABILITY_QOS_POLICY_KIND = eINSTANCE.getReliabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.PresentationQosPolicyAccessScopeKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getPresentationQosPolicyAccessScopeKind()
		 * @generated
		 */
		EEnum PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = eINSTANCE.getPresentationQosPolicyAccessScopeKind();

		/**
		 * The meta object literal for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.OwnershipQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getOwnershipQosPolicyKind()
		 * @generated
		 */
		EEnum OWNERSHIP_QOS_POLICY_KIND = eINSTANCE.getOwnershipQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.LivelinessQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getLivelinessQosPolicyKind()
		 * @generated
		 */
		EEnum LIVELINESS_QOS_POLICY_KIND = eINSTANCE.getLivelinessQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DurabilityQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getDurabilityQosPolicyKind()
		 * @generated
		 */
		EEnum DURABILITY_QOS_POLICY_KIND = eINSTANCE.getDurabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DestinationOrderQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getDestinationOrderQosPolicyKind()
		 * @generated
		 */
		EEnum DESTINATION_ORDER_QOS_POLICY_KIND = eINSTANCE.getDestinationOrderQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.HistoryQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getHistoryQosPolicyKind()
		 * @generated
		 */
		EEnum HISTORY_QOS_POLICY_KIND = eINSTANCE.getHistoryQosPolicyKind();

	}

} //EnumerationsPackage
/**
 */
package enumerations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
public interface EnumerationsPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opendds.org/modeling/schemas/Enumerations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "enumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumerationsPackage eINSTANCE = enumerations.impl.EnumerationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link enumerations.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.impl.PeriodImpl
	 * @see enumerations.impl.EnumerationsPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__NANOSECOND = 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__SECOND = 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getReliabilityQosPolicyKind()
	 * @generated
	 */
	int RELIABILITY_QOS_POLICY_KIND = 1;

	/**
	 * The meta object id for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getPresentationQosPolicyAccessScopeKind()
	 * @generated
	 */
	int PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = 2;

	/**
	 * The meta object id for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.OwnershipQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getOwnershipQosPolicyKind()
	 * @generated
	 */
	int OWNERSHIP_QOS_POLICY_KIND = 3;

	/**
	 * The meta object id for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.LivelinessQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getLivelinessQosPolicyKind()
	 * @generated
	 */
	int LIVELINESS_QOS_POLICY_KIND = 4;

	/**
	 * The meta object id for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DurabilityQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getDurabilityQosPolicyKind()
	 * @generated
	 */
	int DURABILITY_QOS_POLICY_KIND = 5;

	/**
	 * The meta object id for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getDestinationOrderQosPolicyKind()
	 * @generated
	 */
	int DESTINATION_ORDER_QOS_POLICY_KIND = 6;

	/**
	 * The meta object id for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.HistoryQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getHistoryQosPolicyKind()
	 * @generated
	 */
	int HISTORY_QOS_POLICY_KIND = 7;


	/**
	 * Returns the meta object for class '{@link enumerations.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see enumerations.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nanosecond</em>'.
	 * @see enumerations.Period#getNanosecond()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Nanosecond();

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see enumerations.Period#getSecond()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Second();

	/**
	 * Returns the meta object for enum '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reliability Qos Policy Kind</em>'.
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @generated
	 */
	EEnum getReliabilityQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation Qos Policy Access Scope Kind</em>'.
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @generated
	 */
	EEnum getPresentationQosPolicyAccessScopeKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ownership Qos Policy Kind</em>'.
	 * @see enumerations.OwnershipQosPolicyKind
	 * @generated
	 */
	EEnum getOwnershipQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Liveliness Qos Policy Kind</em>'.
	 * @see enumerations.LivelinessQosPolicyKind
	 * @generated
	 */
	EEnum getLivelinessQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Durability Qos Policy Kind</em>'.
	 * @see enumerations.DurabilityQosPolicyKind
	 * @generated
	 */
	EEnum getDurabilityQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Destination Order Qos Policy Kind</em>'.
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @generated
	 */
	EEnum getDestinationOrderQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Qos Policy Kind</em>'.
	 * @see enumerations.HistoryQosPolicyKind
	 * @generated
	 */
	EEnum getHistoryQosPolicyKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumerationsFactory getEnumerationsFactory();

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
		 * The meta object literal for the '{@link enumerations.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.impl.PeriodImpl
		 * @see enumerations.impl.EnumerationsPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Nanosecond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__NANOSECOND = eINSTANCE.getPeriod_Nanosecond();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__SECOND = eINSTANCE.getPeriod_Second();

		/**
		 * The meta object literal for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.ReliabilityQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getReliabilityQosPolicyKind()
		 * @generated
		 */
		EEnum RELIABILITY_QOS_POLICY_KIND = eINSTANCE.getReliabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.PresentationQosPolicyAccessScopeKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getPresentationQosPolicyAccessScopeKind()
		 * @generated
		 */
		EEnum PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = eINSTANCE.getPresentationQosPolicyAccessScopeKind();

		/**
		 * The meta object literal for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.OwnershipQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getOwnershipQosPolicyKind()
		 * @generated
		 */
		EEnum OWNERSHIP_QOS_POLICY_KIND = eINSTANCE.getOwnershipQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.LivelinessQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getLivelinessQosPolicyKind()
		 * @generated
		 */
		EEnum LIVELINESS_QOS_POLICY_KIND = eINSTANCE.getLivelinessQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DurabilityQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getDurabilityQosPolicyKind()
		 * @generated
		 */
		EEnum DURABILITY_QOS_POLICY_KIND = eINSTANCE.getDurabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DestinationOrderQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getDestinationOrderQosPolicyKind()
		 * @generated
		 */
		EEnum DESTINATION_ORDER_QOS_POLICY_KIND = eINSTANCE.getDestinationOrderQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.HistoryQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getHistoryQosPolicyKind()
		 * @generated
		 */
		EEnum HISTORY_QOS_POLICY_KIND = eINSTANCE.getHistoryQosPolicyKind();

	}

} //EnumerationsPackage
/**
 */
package enumerations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
public interface EnumerationsPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opendds.org/modeling/schemas/Enumerations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "enumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumerationsPackage eINSTANCE = enumerations.impl.EnumerationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link enumerations.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.impl.PeriodImpl
	 * @see enumerations.impl.EnumerationsPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Nanosecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__NANOSECOND = 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__SECOND = 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getReliabilityQosPolicyKind()
	 * @generated
	 */
	int RELIABILITY_QOS_POLICY_KIND = 1;

	/**
	 * The meta object id for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getPresentationQosPolicyAccessScopeKind()
	 * @generated
	 */
	int PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = 2;

	/**
	 * The meta object id for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.OwnershipQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getOwnershipQosPolicyKind()
	 * @generated
	 */
	int OWNERSHIP_QOS_POLICY_KIND = 3;

	/**
	 * The meta object id for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.LivelinessQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getLivelinessQosPolicyKind()
	 * @generated
	 */
	int LIVELINESS_QOS_POLICY_KIND = 4;

	/**
	 * The meta object id for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DurabilityQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getDurabilityQosPolicyKind()
	 * @generated
	 */
	int DURABILITY_QOS_POLICY_KIND = 5;

	/**
	 * The meta object id for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getDestinationOrderQosPolicyKind()
	 * @generated
	 */
	int DESTINATION_ORDER_QOS_POLICY_KIND = 6;

	/**
	 * The meta object id for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enumerations.HistoryQosPolicyKind
	 * @see enumerations.impl.EnumerationsPackageImpl#getHistoryQosPolicyKind()
	 * @generated
	 */
	int HISTORY_QOS_POLICY_KIND = 7;


	/**
	 * Returns the meta object for class '{@link enumerations.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see enumerations.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getNanosecond <em>Nanosecond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nanosecond</em>'.
	 * @see enumerations.Period#getNanosecond()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Nanosecond();

	/**
	 * Returns the meta object for the attribute '{@link enumerations.Period#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see enumerations.Period#getSecond()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Second();

	/**
	 * Returns the meta object for enum '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reliability Qos Policy Kind</em>'.
	 * @see enumerations.ReliabilityQosPolicyKind
	 * @generated
	 */
	EEnum getReliabilityQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation Qos Policy Access Scope Kind</em>'.
	 * @see enumerations.PresentationQosPolicyAccessScopeKind
	 * @generated
	 */
	EEnum getPresentationQosPolicyAccessScopeKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ownership Qos Policy Kind</em>'.
	 * @see enumerations.OwnershipQosPolicyKind
	 * @generated
	 */
	EEnum getOwnershipQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Liveliness Qos Policy Kind</em>'.
	 * @see enumerations.LivelinessQosPolicyKind
	 * @generated
	 */
	EEnum getLivelinessQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Durability Qos Policy Kind</em>'.
	 * @see enumerations.DurabilityQosPolicyKind
	 * @generated
	 */
	EEnum getDurabilityQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Destination Order Qos Policy Kind</em>'.
	 * @see enumerations.DestinationOrderQosPolicyKind
	 * @generated
	 */
	EEnum getDestinationOrderQosPolicyKind();

	/**
	 * Returns the meta object for enum '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Qos Policy Kind</em>'.
	 * @see enumerations.HistoryQosPolicyKind
	 * @generated
	 */
	EEnum getHistoryQosPolicyKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumerationsFactory getEnumerationsFactory();

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
		 * The meta object literal for the '{@link enumerations.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.impl.PeriodImpl
		 * @see enumerations.impl.EnumerationsPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Nanosecond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__NANOSECOND = eINSTANCE.getPeriod_Nanosecond();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__SECOND = eINSTANCE.getPeriod_Second();

		/**
		 * The meta object literal for the '{@link enumerations.ReliabilityQosPolicyKind <em>Reliability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.ReliabilityQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getReliabilityQosPolicyKind()
		 * @generated
		 */
		EEnum RELIABILITY_QOS_POLICY_KIND = eINSTANCE.getReliabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.PresentationQosPolicyAccessScopeKind <em>Presentation Qos Policy Access Scope Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.PresentationQosPolicyAccessScopeKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getPresentationQosPolicyAccessScopeKind()
		 * @generated
		 */
		EEnum PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND = eINSTANCE.getPresentationQosPolicyAccessScopeKind();

		/**
		 * The meta object literal for the '{@link enumerations.OwnershipQosPolicyKind <em>Ownership Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.OwnershipQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getOwnershipQosPolicyKind()
		 * @generated
		 */
		EEnum OWNERSHIP_QOS_POLICY_KIND = eINSTANCE.getOwnershipQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.LivelinessQosPolicyKind <em>Liveliness Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.LivelinessQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getLivelinessQosPolicyKind()
		 * @generated
		 */
		EEnum LIVELINESS_QOS_POLICY_KIND = eINSTANCE.getLivelinessQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DurabilityQosPolicyKind <em>Durability Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DurabilityQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getDurabilityQosPolicyKind()
		 * @generated
		 */
		EEnum DURABILITY_QOS_POLICY_KIND = eINSTANCE.getDurabilityQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.DestinationOrderQosPolicyKind <em>Destination Order Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.DestinationOrderQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getDestinationOrderQosPolicyKind()
		 * @generated
		 */
		EEnum DESTINATION_ORDER_QOS_POLICY_KIND = eINSTANCE.getDestinationOrderQosPolicyKind();

		/**
		 * The meta object literal for the '{@link enumerations.HistoryQosPolicyKind <em>History Qos Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enumerations.HistoryQosPolicyKind
		 * @see enumerations.impl.EnumerationsPackageImpl#getHistoryQosPolicyKind()
		 * @generated
		 */
		EEnum HISTORY_QOS_POLICY_KIND = eINSTANCE.getHistoryQosPolicyKind();

	}

} //EnumerationsPackage
