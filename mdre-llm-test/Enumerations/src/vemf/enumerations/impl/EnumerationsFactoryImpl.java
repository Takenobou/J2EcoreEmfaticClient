/**
 */
package enumerations.impl;

import enumerations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerationsFactoryImpl extends EFactoryImpl implements EnumerationsFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumerationsFactory init()
	{
		try
		{
			EnumerationsFactory theEnumerationsFactory = (EnumerationsFactory)EPackage.Registry.INSTANCE.getEFactory(EnumerationsPackage.eNS_URI);
			if (theEnumerationsFactory != null)
			{
				return theEnumerationsFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnumerationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationsFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case EnumerationsPackage.PERIOD: return createPeriod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case EnumerationsPackage.RELIABILITY_QOS_POLICY_KIND:
				return createReliabilityQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND:
				return createPresentationQosPolicyAccessScopeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.OWNERSHIP_QOS_POLICY_KIND:
				return createOwnershipQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.LIVELINESS_QOS_POLICY_KIND:
				return createLivelinessQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.DURABILITY_QOS_POLICY_KIND:
				return createDurabilityQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.DESTINATION_ORDER_QOS_POLICY_KIND:
				return createDestinationOrderQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.HISTORY_QOS_POLICY_KIND:
				return createHistoryQosPolicyKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case EnumerationsPackage.RELIABILITY_QOS_POLICY_KIND:
				return convertReliabilityQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND:
				return convertPresentationQosPolicyAccessScopeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.OWNERSHIP_QOS_POLICY_KIND:
				return convertOwnershipQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.LIVELINESS_QOS_POLICY_KIND:
				return convertLivelinessQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.DURABILITY_QOS_POLICY_KIND:
				return convertDurabilityQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.DESTINATION_ORDER_QOS_POLICY_KIND:
				return convertDestinationOrderQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.HISTORY_QOS_POLICY_KIND:
				return convertHistoryQosPolicyKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod()
	{
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityQosPolicyKind createReliabilityQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		ReliabilityQosPolicyKind result = ReliabilityQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReliabilityQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationQosPolicyAccessScopeKind createPresentationQosPolicyAccessScopeKindFromString(EDataType eDataType, String initialValue)
	{
		PresentationQosPolicyAccessScopeKind result = PresentationQosPolicyAccessScopeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationQosPolicyAccessScopeKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnershipQosPolicyKind createOwnershipQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		OwnershipQosPolicyKind result = OwnershipQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOwnershipQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivelinessQosPolicyKind createLivelinessQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		LivelinessQosPolicyKind result = LivelinessQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLivelinessQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurabilityQosPolicyKind createDurabilityQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		DurabilityQosPolicyKind result = DurabilityQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurabilityQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationOrderQosPolicyKind createDestinationOrderQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		DestinationOrderQosPolicyKind result = DestinationOrderQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDestinationOrderQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryQosPolicyKind createHistoryQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		HistoryQosPolicyKind result = HistoryQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoryQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationsPackage getEnumerationsPackage()
	{
		return (EnumerationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnumerationsPackage getPackage()
	{
		return EnumerationsPackage.eINSTANCE;
	}

} //EnumerationsFactoryImpl
/**
 */
package enumerations.impl;

import enumerations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerationsFactoryImpl extends EFactoryImpl implements EnumerationsFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumerationsFactory init()
	{
		try
		{
			EnumerationsFactory theEnumerationsFactory = (EnumerationsFactory)EPackage.Registry.INSTANCE.getEFactory(EnumerationsPackage.eNS_URI);
			if (theEnumerationsFactory != null)
			{
				return theEnumerationsFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnumerationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationsFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case EnumerationsPackage.PERIOD: return createPeriod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case EnumerationsPackage.RELIABILITY_QOS_POLICY_KIND:
				return createReliabilityQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND:
				return createPresentationQosPolicyAccessScopeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.OWNERSHIP_QOS_POLICY_KIND:
				return createOwnershipQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.LIVELINESS_QOS_POLICY_KIND:
				return createLivelinessQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.DURABILITY_QOS_POLICY_KIND:
				return createDurabilityQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.DESTINATION_ORDER_QOS_POLICY_KIND:
				return createDestinationOrderQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.HISTORY_QOS_POLICY_KIND:
				return createHistoryQosPolicyKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case EnumerationsPackage.RELIABILITY_QOS_POLICY_KIND:
				return convertReliabilityQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND:
				return convertPresentationQosPolicyAccessScopeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.OWNERSHIP_QOS_POLICY_KIND:
				return convertOwnershipQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.LIVELINESS_QOS_POLICY_KIND:
				return convertLivelinessQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.DURABILITY_QOS_POLICY_KIND:
				return convertDurabilityQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.DESTINATION_ORDER_QOS_POLICY_KIND:
				return convertDestinationOrderQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.HISTORY_QOS_POLICY_KIND:
				return convertHistoryQosPolicyKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod()
	{
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityQosPolicyKind createReliabilityQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		ReliabilityQosPolicyKind result = ReliabilityQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReliabilityQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationQosPolicyAccessScopeKind createPresentationQosPolicyAccessScopeKindFromString(EDataType eDataType, String initialValue)
	{
		PresentationQosPolicyAccessScopeKind result = PresentationQosPolicyAccessScopeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationQosPolicyAccessScopeKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnershipQosPolicyKind createOwnershipQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		OwnershipQosPolicyKind result = OwnershipQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOwnershipQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivelinessQosPolicyKind createLivelinessQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		LivelinessQosPolicyKind result = LivelinessQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLivelinessQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurabilityQosPolicyKind createDurabilityQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		DurabilityQosPolicyKind result = DurabilityQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurabilityQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationOrderQosPolicyKind createDestinationOrderQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		DestinationOrderQosPolicyKind result = DestinationOrderQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDestinationOrderQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryQosPolicyKind createHistoryQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		HistoryQosPolicyKind result = HistoryQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoryQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationsPackage getEnumerationsPackage()
	{
		return (EnumerationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnumerationsPackage getPackage()
	{
		return EnumerationsPackage.eINSTANCE;
	}

} //EnumerationsFactoryImpl
/**
 */
package enumerations.impl;

import enumerations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerationsFactoryImpl extends EFactoryImpl implements EnumerationsFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumerationsFactory init()
	{
		try
		{
			EnumerationsFactory theEnumerationsFactory = (EnumerationsFactory)EPackage.Registry.INSTANCE.getEFactory(EnumerationsPackage.eNS_URI);
			if (theEnumerationsFactory != null)
			{
				return theEnumerationsFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnumerationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationsFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case EnumerationsPackage.PERIOD: return createPeriod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case EnumerationsPackage.RELIABILITY_QOS_POLICY_KIND:
				return createReliabilityQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND:
				return createPresentationQosPolicyAccessScopeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.OWNERSHIP_QOS_POLICY_KIND:
				return createOwnershipQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.LIVELINESS_QOS_POLICY_KIND:
				return createLivelinessQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.DURABILITY_QOS_POLICY_KIND:
				return createDurabilityQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.DESTINATION_ORDER_QOS_POLICY_KIND:
				return createDestinationOrderQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.HISTORY_QOS_POLICY_KIND:
				return createHistoryQosPolicyKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case EnumerationsPackage.RELIABILITY_QOS_POLICY_KIND:
				return convertReliabilityQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND:
				return convertPresentationQosPolicyAccessScopeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.OWNERSHIP_QOS_POLICY_KIND:
				return convertOwnershipQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.LIVELINESS_QOS_POLICY_KIND:
				return convertLivelinessQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.DURABILITY_QOS_POLICY_KIND:
				return convertDurabilityQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.DESTINATION_ORDER_QOS_POLICY_KIND:
				return convertDestinationOrderQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.HISTORY_QOS_POLICY_KIND:
				return convertHistoryQosPolicyKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod()
	{
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityQosPolicyKind createReliabilityQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		ReliabilityQosPolicyKind result = ReliabilityQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReliabilityQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationQosPolicyAccessScopeKind createPresentationQosPolicyAccessScopeKindFromString(EDataType eDataType, String initialValue)
	{
		PresentationQosPolicyAccessScopeKind result = PresentationQosPolicyAccessScopeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationQosPolicyAccessScopeKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnershipQosPolicyKind createOwnershipQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		OwnershipQosPolicyKind result = OwnershipQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOwnershipQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivelinessQosPolicyKind createLivelinessQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		LivelinessQosPolicyKind result = LivelinessQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLivelinessQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurabilityQosPolicyKind createDurabilityQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		DurabilityQosPolicyKind result = DurabilityQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurabilityQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationOrderQosPolicyKind createDestinationOrderQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		DestinationOrderQosPolicyKind result = DestinationOrderQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDestinationOrderQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryQosPolicyKind createHistoryQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		HistoryQosPolicyKind result = HistoryQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoryQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationsPackage getEnumerationsPackage()
	{
		return (EnumerationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnumerationsPackage getPackage()
	{
		return EnumerationsPackage.eINSTANCE;
	}

} //EnumerationsFactoryImpl
/**
 */
package enumerations.impl;

import enumerations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerationsFactoryImpl extends EFactoryImpl implements EnumerationsFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumerationsFactory init()
	{
		try
		{
			EnumerationsFactory theEnumerationsFactory = (EnumerationsFactory)EPackage.Registry.INSTANCE.getEFactory(EnumerationsPackage.eNS_URI);
			if (theEnumerationsFactory != null)
			{
				return theEnumerationsFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnumerationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationsFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case EnumerationsPackage.PERIOD: return createPeriod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case EnumerationsPackage.RELIABILITY_QOS_POLICY_KIND:
				return createReliabilityQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND:
				return createPresentationQosPolicyAccessScopeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.OWNERSHIP_QOS_POLICY_KIND:
				return createOwnershipQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.LIVELINESS_QOS_POLICY_KIND:
				return createLivelinessQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.DURABILITY_QOS_POLICY_KIND:
				return createDurabilityQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.DESTINATION_ORDER_QOS_POLICY_KIND:
				return createDestinationOrderQosPolicyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.HISTORY_QOS_POLICY_KIND:
				return createHistoryQosPolicyKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case EnumerationsPackage.RELIABILITY_QOS_POLICY_KIND:
				return convertReliabilityQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.PRESENTATION_QOS_POLICY_ACCESS_SCOPE_KIND:
				return convertPresentationQosPolicyAccessScopeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.OWNERSHIP_QOS_POLICY_KIND:
				return convertOwnershipQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.LIVELINESS_QOS_POLICY_KIND:
				return convertLivelinessQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.DURABILITY_QOS_POLICY_KIND:
				return convertDurabilityQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.DESTINATION_ORDER_QOS_POLICY_KIND:
				return convertDestinationOrderQosPolicyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.HISTORY_QOS_POLICY_KIND:
				return convertHistoryQosPolicyKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod()
	{
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityQosPolicyKind createReliabilityQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		ReliabilityQosPolicyKind result = ReliabilityQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReliabilityQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationQosPolicyAccessScopeKind createPresentationQosPolicyAccessScopeKindFromString(EDataType eDataType, String initialValue)
	{
		PresentationQosPolicyAccessScopeKind result = PresentationQosPolicyAccessScopeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationQosPolicyAccessScopeKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnershipQosPolicyKind createOwnershipQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		OwnershipQosPolicyKind result = OwnershipQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOwnershipQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivelinessQosPolicyKind createLivelinessQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		LivelinessQosPolicyKind result = LivelinessQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLivelinessQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurabilityQosPolicyKind createDurabilityQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		DurabilityQosPolicyKind result = DurabilityQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurabilityQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationOrderQosPolicyKind createDestinationOrderQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		DestinationOrderQosPolicyKind result = DestinationOrderQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDestinationOrderQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryQosPolicyKind createHistoryQosPolicyKindFromString(EDataType eDataType, String initialValue)
	{
		HistoryQosPolicyKind result = HistoryQosPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoryQosPolicyKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationsPackage getEnumerationsPackage()
	{
		return (EnumerationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnumerationsPackage getPackage()
	{
		return EnumerationsPackage.eINSTANCE;
	}

} //EnumerationsFactoryImpl
