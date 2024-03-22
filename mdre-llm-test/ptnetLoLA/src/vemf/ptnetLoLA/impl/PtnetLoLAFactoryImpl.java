/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetLoLAFactoryImpl extends EFactoryImpl implements PtnetLoLAFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PtnetLoLAFactory init()
	{
		try
		{
			PtnetLoLAFactory thePtnetLoLAFactory = (PtnetLoLAFactory)EPackage.Registry.INSTANCE.getEFactory(PtnetLoLAPackage.eNS_URI);
			if (thePtnetLoLAFactory != null)
			{
				return thePtnetLoLAFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PtnetLoLAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAFactoryImpl()
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
			case PtnetLoLAPackage.PLACE: return createPlace();
			case PtnetLoLAPackage.PT_NET: return createPtNet();
			case PtnetLoLAPackage.TRANSITION: return createTransition();
			case PtnetLoLAPackage.NODE: return createNode();
			case PtnetLoLAPackage.MARKING: return createMarking();
			case PtnetLoLAPackage.PLACE_REFERENCE: return createPlaceReference();
			case PtnetLoLAPackage.REF_MARKED_PLACE: return createRefMarkedPlace();
			case PtnetLoLAPackage.ANNOTATION: return createAnnotation();
			case PtnetLoLAPackage.ARC: return createArc();
			case PtnetLoLAPackage.ARC_TO_PLACE: return createArcToPlace();
			case PtnetLoLAPackage.ARC_TO_TRANSITION: return createArcToTransition();
			case PtnetLoLAPackage.TRANSITION_EXT: return createTransitionExt();
			case PtnetLoLAPackage.PLACE_EXT: return createPlaceExt();
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT: return createArcToPlaceExt();
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT: return createArcToTransitionExt();
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
			case PtnetLoLAPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return createConfidentialityFromString(eDataType, initialValue);
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
			case PtnetLoLAPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return convertConfidentialityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace()
	{
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtNet createPtNet()
	{
		PtNetImpl ptNet = new PtNetImpl();
		return ptNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition()
	{
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode()
	{
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking()
	{
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceReference createPlaceReference()
	{
		PlaceReferenceImpl placeReference = new PlaceReferenceImpl();
		return placeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefMarkedPlace createRefMarkedPlace()
	{
		RefMarkedPlaceImpl refMarkedPlace = new RefMarkedPlaceImpl();
		return refMarkedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation()
	{
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc()
	{
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlace createArcToPlace()
	{
		ArcToPlaceImpl arcToPlace = new ArcToPlaceImpl();
		return arcToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransition createArcToTransition()
	{
		ArcToTransitionImpl arcToTransition = new ArcToTransitionImpl();
		return arcToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionExt createTransitionExt()
	{
		TransitionExtImpl transitionExt = new TransitionExtImpl();
		return transitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceExt createPlaceExt()
	{
		PlaceExtImpl placeExt = new PlaceExtImpl();
		return placeExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlaceExt createArcToPlaceExt()
	{
		ArcToPlaceExtImpl arcToPlaceExt = new ArcToPlaceExtImpl();
		return arcToPlaceExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransitionExt createArcToTransitionExt()
	{
		ArcToTransitionExtImpl arcToTransitionExt = new ArcToTransitionExtImpl();
		return arcToTransitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue)
	{
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality createConfidentialityFromString(EDataType eDataType, String initialValue)
	{
		Confidentiality result = Confidentiality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAPackage getPtnetLoLAPackage()
	{
		return (PtnetLoLAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PtnetLoLAPackage getPackage()
	{
		return PtnetLoLAPackage.eINSTANCE;
	}

} //PtnetLoLAFactoryImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetLoLAFactoryImpl extends EFactoryImpl implements PtnetLoLAFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PtnetLoLAFactory init()
	{
		try
		{
			PtnetLoLAFactory thePtnetLoLAFactory = (PtnetLoLAFactory)EPackage.Registry.INSTANCE.getEFactory(PtnetLoLAPackage.eNS_URI);
			if (thePtnetLoLAFactory != null)
			{
				return thePtnetLoLAFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PtnetLoLAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAFactoryImpl()
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
			case PtnetLoLAPackage.PLACE: return createPlace();
			case PtnetLoLAPackage.PT_NET: return createPtNet();
			case PtnetLoLAPackage.TRANSITION: return createTransition();
			case PtnetLoLAPackage.NODE: return createNode();
			case PtnetLoLAPackage.MARKING: return createMarking();
			case PtnetLoLAPackage.PLACE_REFERENCE: return createPlaceReference();
			case PtnetLoLAPackage.REF_MARKED_PLACE: return createRefMarkedPlace();
			case PtnetLoLAPackage.ANNOTATION: return createAnnotation();
			case PtnetLoLAPackage.ARC: return createArc();
			case PtnetLoLAPackage.ARC_TO_PLACE: return createArcToPlace();
			case PtnetLoLAPackage.ARC_TO_TRANSITION: return createArcToTransition();
			case PtnetLoLAPackage.TRANSITION_EXT: return createTransitionExt();
			case PtnetLoLAPackage.PLACE_EXT: return createPlaceExt();
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT: return createArcToPlaceExt();
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT: return createArcToTransitionExt();
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
			case PtnetLoLAPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return createConfidentialityFromString(eDataType, initialValue);
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
			case PtnetLoLAPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return convertConfidentialityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace()
	{
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtNet createPtNet()
	{
		PtNetImpl ptNet = new PtNetImpl();
		return ptNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition()
	{
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode()
	{
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking()
	{
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceReference createPlaceReference()
	{
		PlaceReferenceImpl placeReference = new PlaceReferenceImpl();
		return placeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefMarkedPlace createRefMarkedPlace()
	{
		RefMarkedPlaceImpl refMarkedPlace = new RefMarkedPlaceImpl();
		return refMarkedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation()
	{
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc()
	{
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlace createArcToPlace()
	{
		ArcToPlaceImpl arcToPlace = new ArcToPlaceImpl();
		return arcToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransition createArcToTransition()
	{
		ArcToTransitionImpl arcToTransition = new ArcToTransitionImpl();
		return arcToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionExt createTransitionExt()
	{
		TransitionExtImpl transitionExt = new TransitionExtImpl();
		return transitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceExt createPlaceExt()
	{
		PlaceExtImpl placeExt = new PlaceExtImpl();
		return placeExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlaceExt createArcToPlaceExt()
	{
		ArcToPlaceExtImpl arcToPlaceExt = new ArcToPlaceExtImpl();
		return arcToPlaceExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransitionExt createArcToTransitionExt()
	{
		ArcToTransitionExtImpl arcToTransitionExt = new ArcToTransitionExtImpl();
		return arcToTransitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue)
	{
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality createConfidentialityFromString(EDataType eDataType, String initialValue)
	{
		Confidentiality result = Confidentiality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAPackage getPtnetLoLAPackage()
	{
		return (PtnetLoLAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PtnetLoLAPackage getPackage()
	{
		return PtnetLoLAPackage.eINSTANCE;
	}

} //PtnetLoLAFactoryImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetLoLAFactoryImpl extends EFactoryImpl implements PtnetLoLAFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PtnetLoLAFactory init()
	{
		try
		{
			PtnetLoLAFactory thePtnetLoLAFactory = (PtnetLoLAFactory)EPackage.Registry.INSTANCE.getEFactory(PtnetLoLAPackage.eNS_URI);
			if (thePtnetLoLAFactory != null)
			{
				return thePtnetLoLAFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PtnetLoLAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAFactoryImpl()
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
			case PtnetLoLAPackage.PLACE: return createPlace();
			case PtnetLoLAPackage.PT_NET: return createPtNet();
			case PtnetLoLAPackage.TRANSITION: return createTransition();
			case PtnetLoLAPackage.NODE: return createNode();
			case PtnetLoLAPackage.MARKING: return createMarking();
			case PtnetLoLAPackage.PLACE_REFERENCE: return createPlaceReference();
			case PtnetLoLAPackage.REF_MARKED_PLACE: return createRefMarkedPlace();
			case PtnetLoLAPackage.ANNOTATION: return createAnnotation();
			case PtnetLoLAPackage.ARC: return createArc();
			case PtnetLoLAPackage.ARC_TO_PLACE: return createArcToPlace();
			case PtnetLoLAPackage.ARC_TO_TRANSITION: return createArcToTransition();
			case PtnetLoLAPackage.TRANSITION_EXT: return createTransitionExt();
			case PtnetLoLAPackage.PLACE_EXT: return createPlaceExt();
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT: return createArcToPlaceExt();
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT: return createArcToTransitionExt();
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
			case PtnetLoLAPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return createConfidentialityFromString(eDataType, initialValue);
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
			case PtnetLoLAPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return convertConfidentialityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace()
	{
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtNet createPtNet()
	{
		PtNetImpl ptNet = new PtNetImpl();
		return ptNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition()
	{
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode()
	{
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking()
	{
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceReference createPlaceReference()
	{
		PlaceReferenceImpl placeReference = new PlaceReferenceImpl();
		return placeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefMarkedPlace createRefMarkedPlace()
	{
		RefMarkedPlaceImpl refMarkedPlace = new RefMarkedPlaceImpl();
		return refMarkedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation()
	{
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc()
	{
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlace createArcToPlace()
	{
		ArcToPlaceImpl arcToPlace = new ArcToPlaceImpl();
		return arcToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransition createArcToTransition()
	{
		ArcToTransitionImpl arcToTransition = new ArcToTransitionImpl();
		return arcToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionExt createTransitionExt()
	{
		TransitionExtImpl transitionExt = new TransitionExtImpl();
		return transitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceExt createPlaceExt()
	{
		PlaceExtImpl placeExt = new PlaceExtImpl();
		return placeExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlaceExt createArcToPlaceExt()
	{
		ArcToPlaceExtImpl arcToPlaceExt = new ArcToPlaceExtImpl();
		return arcToPlaceExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransitionExt createArcToTransitionExt()
	{
		ArcToTransitionExtImpl arcToTransitionExt = new ArcToTransitionExtImpl();
		return arcToTransitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue)
	{
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality createConfidentialityFromString(EDataType eDataType, String initialValue)
	{
		Confidentiality result = Confidentiality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAPackage getPtnetLoLAPackage()
	{
		return (PtnetLoLAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PtnetLoLAPackage getPackage()
	{
		return PtnetLoLAPackage.eINSTANCE;
	}

} //PtnetLoLAFactoryImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetLoLAFactoryImpl extends EFactoryImpl implements PtnetLoLAFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PtnetLoLAFactory init()
	{
		try
		{
			PtnetLoLAFactory thePtnetLoLAFactory = (PtnetLoLAFactory)EPackage.Registry.INSTANCE.getEFactory(PtnetLoLAPackage.eNS_URI);
			if (thePtnetLoLAFactory != null)
			{
				return thePtnetLoLAFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PtnetLoLAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAFactoryImpl()
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
			case PtnetLoLAPackage.PLACE: return createPlace();
			case PtnetLoLAPackage.PT_NET: return createPtNet();
			case PtnetLoLAPackage.TRANSITION: return createTransition();
			case PtnetLoLAPackage.NODE: return createNode();
			case PtnetLoLAPackage.MARKING: return createMarking();
			case PtnetLoLAPackage.PLACE_REFERENCE: return createPlaceReference();
			case PtnetLoLAPackage.REF_MARKED_PLACE: return createRefMarkedPlace();
			case PtnetLoLAPackage.ANNOTATION: return createAnnotation();
			case PtnetLoLAPackage.ARC: return createArc();
			case PtnetLoLAPackage.ARC_TO_PLACE: return createArcToPlace();
			case PtnetLoLAPackage.ARC_TO_TRANSITION: return createArcToTransition();
			case PtnetLoLAPackage.TRANSITION_EXT: return createTransitionExt();
			case PtnetLoLAPackage.PLACE_EXT: return createPlaceExt();
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT: return createArcToPlaceExt();
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT: return createArcToTransitionExt();
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
			case PtnetLoLAPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return createConfidentialityFromString(eDataType, initialValue);
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
			case PtnetLoLAPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return convertConfidentialityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace()
	{
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtNet createPtNet()
	{
		PtNetImpl ptNet = new PtNetImpl();
		return ptNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition()
	{
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode()
	{
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking()
	{
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceReference createPlaceReference()
	{
		PlaceReferenceImpl placeReference = new PlaceReferenceImpl();
		return placeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefMarkedPlace createRefMarkedPlace()
	{
		RefMarkedPlaceImpl refMarkedPlace = new RefMarkedPlaceImpl();
		return refMarkedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation()
	{
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc()
	{
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlace createArcToPlace()
	{
		ArcToPlaceImpl arcToPlace = new ArcToPlaceImpl();
		return arcToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransition createArcToTransition()
	{
		ArcToTransitionImpl arcToTransition = new ArcToTransitionImpl();
		return arcToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionExt createTransitionExt()
	{
		TransitionExtImpl transitionExt = new TransitionExtImpl();
		return transitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceExt createPlaceExt()
	{
		PlaceExtImpl placeExt = new PlaceExtImpl();
		return placeExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlaceExt createArcToPlaceExt()
	{
		ArcToPlaceExtImpl arcToPlaceExt = new ArcToPlaceExtImpl();
		return arcToPlaceExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransitionExt createArcToTransitionExt()
	{
		ArcToTransitionExtImpl arcToTransitionExt = new ArcToTransitionExtImpl();
		return arcToTransitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue)
	{
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality createConfidentialityFromString(EDataType eDataType, String initialValue)
	{
		Confidentiality result = Confidentiality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAPackage getPtnetLoLAPackage()
	{
		return (PtnetLoLAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PtnetLoLAPackage getPackage()
	{
		return PtnetLoLAPackage.eINSTANCE;
	}

} //PtnetLoLAFactoryImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetLoLAFactoryImpl extends EFactoryImpl implements PtnetLoLAFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PtnetLoLAFactory init()
	{
		try
		{
			PtnetLoLAFactory thePtnetLoLAFactory = (PtnetLoLAFactory)EPackage.Registry.INSTANCE.getEFactory(PtnetLoLAPackage.eNS_URI);
			if (thePtnetLoLAFactory != null)
			{
				return thePtnetLoLAFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PtnetLoLAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAFactoryImpl()
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
			case PtnetLoLAPackage.PLACE: return createPlace();
			case PtnetLoLAPackage.PT_NET: return createPtNet();
			case PtnetLoLAPackage.TRANSITION: return createTransition();
			case PtnetLoLAPackage.NODE: return createNode();
			case PtnetLoLAPackage.MARKING: return createMarking();
			case PtnetLoLAPackage.PLACE_REFERENCE: return createPlaceReference();
			case PtnetLoLAPackage.REF_MARKED_PLACE: return createRefMarkedPlace();
			case PtnetLoLAPackage.ANNOTATION: return createAnnotation();
			case PtnetLoLAPackage.ARC: return createArc();
			case PtnetLoLAPackage.ARC_TO_PLACE: return createArcToPlace();
			case PtnetLoLAPackage.ARC_TO_TRANSITION: return createArcToTransition();
			case PtnetLoLAPackage.TRANSITION_EXT: return createTransitionExt();
			case PtnetLoLAPackage.PLACE_EXT: return createPlaceExt();
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT: return createArcToPlaceExt();
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT: return createArcToTransitionExt();
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
			case PtnetLoLAPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return createConfidentialityFromString(eDataType, initialValue);
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
			case PtnetLoLAPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return convertConfidentialityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace()
	{
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtNet createPtNet()
	{
		PtNetImpl ptNet = new PtNetImpl();
		return ptNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition()
	{
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode()
	{
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking()
	{
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceReference createPlaceReference()
	{
		PlaceReferenceImpl placeReference = new PlaceReferenceImpl();
		return placeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefMarkedPlace createRefMarkedPlace()
	{
		RefMarkedPlaceImpl refMarkedPlace = new RefMarkedPlaceImpl();
		return refMarkedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation()
	{
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc()
	{
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlace createArcToPlace()
	{
		ArcToPlaceImpl arcToPlace = new ArcToPlaceImpl();
		return arcToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransition createArcToTransition()
	{
		ArcToTransitionImpl arcToTransition = new ArcToTransitionImpl();
		return arcToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionExt createTransitionExt()
	{
		TransitionExtImpl transitionExt = new TransitionExtImpl();
		return transitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceExt createPlaceExt()
	{
		PlaceExtImpl placeExt = new PlaceExtImpl();
		return placeExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlaceExt createArcToPlaceExt()
	{
		ArcToPlaceExtImpl arcToPlaceExt = new ArcToPlaceExtImpl();
		return arcToPlaceExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransitionExt createArcToTransitionExt()
	{
		ArcToTransitionExtImpl arcToTransitionExt = new ArcToTransitionExtImpl();
		return arcToTransitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue)
	{
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality createConfidentialityFromString(EDataType eDataType, String initialValue)
	{
		Confidentiality result = Confidentiality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAPackage getPtnetLoLAPackage()
	{
		return (PtnetLoLAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PtnetLoLAPackage getPackage()
	{
		return PtnetLoLAPackage.eINSTANCE;
	}

} //PtnetLoLAFactoryImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetLoLAFactoryImpl extends EFactoryImpl implements PtnetLoLAFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PtnetLoLAFactory init()
	{
		try
		{
			PtnetLoLAFactory thePtnetLoLAFactory = (PtnetLoLAFactory)EPackage.Registry.INSTANCE.getEFactory(PtnetLoLAPackage.eNS_URI);
			if (thePtnetLoLAFactory != null)
			{
				return thePtnetLoLAFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PtnetLoLAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAFactoryImpl()
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
			case PtnetLoLAPackage.PLACE: return createPlace();
			case PtnetLoLAPackage.PT_NET: return createPtNet();
			case PtnetLoLAPackage.TRANSITION: return createTransition();
			case PtnetLoLAPackage.NODE: return createNode();
			case PtnetLoLAPackage.MARKING: return createMarking();
			case PtnetLoLAPackage.PLACE_REFERENCE: return createPlaceReference();
			case PtnetLoLAPackage.REF_MARKED_PLACE: return createRefMarkedPlace();
			case PtnetLoLAPackage.ANNOTATION: return createAnnotation();
			case PtnetLoLAPackage.ARC: return createArc();
			case PtnetLoLAPackage.ARC_TO_PLACE: return createArcToPlace();
			case PtnetLoLAPackage.ARC_TO_TRANSITION: return createArcToTransition();
			case PtnetLoLAPackage.TRANSITION_EXT: return createTransitionExt();
			case PtnetLoLAPackage.PLACE_EXT: return createPlaceExt();
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT: return createArcToPlaceExt();
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT: return createArcToTransitionExt();
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
			case PtnetLoLAPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return createConfidentialityFromString(eDataType, initialValue);
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
			case PtnetLoLAPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return convertConfidentialityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace()
	{
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtNet createPtNet()
	{
		PtNetImpl ptNet = new PtNetImpl();
		return ptNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition()
	{
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode()
	{
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking()
	{
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceReference createPlaceReference()
	{
		PlaceReferenceImpl placeReference = new PlaceReferenceImpl();
		return placeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefMarkedPlace createRefMarkedPlace()
	{
		RefMarkedPlaceImpl refMarkedPlace = new RefMarkedPlaceImpl();
		return refMarkedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation()
	{
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc()
	{
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlace createArcToPlace()
	{
		ArcToPlaceImpl arcToPlace = new ArcToPlaceImpl();
		return arcToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransition createArcToTransition()
	{
		ArcToTransitionImpl arcToTransition = new ArcToTransitionImpl();
		return arcToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionExt createTransitionExt()
	{
		TransitionExtImpl transitionExt = new TransitionExtImpl();
		return transitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceExt createPlaceExt()
	{
		PlaceExtImpl placeExt = new PlaceExtImpl();
		return placeExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlaceExt createArcToPlaceExt()
	{
		ArcToPlaceExtImpl arcToPlaceExt = new ArcToPlaceExtImpl();
		return arcToPlaceExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransitionExt createArcToTransitionExt()
	{
		ArcToTransitionExtImpl arcToTransitionExt = new ArcToTransitionExtImpl();
		return arcToTransitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue)
	{
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality createConfidentialityFromString(EDataType eDataType, String initialValue)
	{
		Confidentiality result = Confidentiality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAPackage getPtnetLoLAPackage()
	{
		return (PtnetLoLAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PtnetLoLAPackage getPackage()
	{
		return PtnetLoLAPackage.eINSTANCE;
	}

} //PtnetLoLAFactoryImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetLoLAFactoryImpl extends EFactoryImpl implements PtnetLoLAFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PtnetLoLAFactory init()
	{
		try
		{
			PtnetLoLAFactory thePtnetLoLAFactory = (PtnetLoLAFactory)EPackage.Registry.INSTANCE.getEFactory(PtnetLoLAPackage.eNS_URI);
			if (thePtnetLoLAFactory != null)
			{
				return thePtnetLoLAFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PtnetLoLAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAFactoryImpl()
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
			case PtnetLoLAPackage.PLACE: return createPlace();
			case PtnetLoLAPackage.PT_NET: return createPtNet();
			case PtnetLoLAPackage.TRANSITION: return createTransition();
			case PtnetLoLAPackage.NODE: return createNode();
			case PtnetLoLAPackage.MARKING: return createMarking();
			case PtnetLoLAPackage.PLACE_REFERENCE: return createPlaceReference();
			case PtnetLoLAPackage.REF_MARKED_PLACE: return createRefMarkedPlace();
			case PtnetLoLAPackage.ANNOTATION: return createAnnotation();
			case PtnetLoLAPackage.ARC: return createArc();
			case PtnetLoLAPackage.ARC_TO_PLACE: return createArcToPlace();
			case PtnetLoLAPackage.ARC_TO_TRANSITION: return createArcToTransition();
			case PtnetLoLAPackage.TRANSITION_EXT: return createTransitionExt();
			case PtnetLoLAPackage.PLACE_EXT: return createPlaceExt();
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT: return createArcToPlaceExt();
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT: return createArcToTransitionExt();
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
			case PtnetLoLAPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return createConfidentialityFromString(eDataType, initialValue);
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
			case PtnetLoLAPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return convertConfidentialityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace()
	{
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtNet createPtNet()
	{
		PtNetImpl ptNet = new PtNetImpl();
		return ptNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition()
	{
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode()
	{
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking()
	{
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceReference createPlaceReference()
	{
		PlaceReferenceImpl placeReference = new PlaceReferenceImpl();
		return placeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefMarkedPlace createRefMarkedPlace()
	{
		RefMarkedPlaceImpl refMarkedPlace = new RefMarkedPlaceImpl();
		return refMarkedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation()
	{
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc()
	{
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlace createArcToPlace()
	{
		ArcToPlaceImpl arcToPlace = new ArcToPlaceImpl();
		return arcToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransition createArcToTransition()
	{
		ArcToTransitionImpl arcToTransition = new ArcToTransitionImpl();
		return arcToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionExt createTransitionExt()
	{
		TransitionExtImpl transitionExt = new TransitionExtImpl();
		return transitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceExt createPlaceExt()
	{
		PlaceExtImpl placeExt = new PlaceExtImpl();
		return placeExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlaceExt createArcToPlaceExt()
	{
		ArcToPlaceExtImpl arcToPlaceExt = new ArcToPlaceExtImpl();
		return arcToPlaceExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransitionExt createArcToTransitionExt()
	{
		ArcToTransitionExtImpl arcToTransitionExt = new ArcToTransitionExtImpl();
		return arcToTransitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue)
	{
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality createConfidentialityFromString(EDataType eDataType, String initialValue)
	{
		Confidentiality result = Confidentiality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAPackage getPtnetLoLAPackage()
	{
		return (PtnetLoLAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PtnetLoLAPackage getPackage()
	{
		return PtnetLoLAPackage.eINSTANCE;
	}

} //PtnetLoLAFactoryImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetLoLAFactoryImpl extends EFactoryImpl implements PtnetLoLAFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PtnetLoLAFactory init()
	{
		try
		{
			PtnetLoLAFactory thePtnetLoLAFactory = (PtnetLoLAFactory)EPackage.Registry.INSTANCE.getEFactory(PtnetLoLAPackage.eNS_URI);
			if (thePtnetLoLAFactory != null)
			{
				return thePtnetLoLAFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PtnetLoLAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAFactoryImpl()
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
			case PtnetLoLAPackage.PLACE: return createPlace();
			case PtnetLoLAPackage.PT_NET: return createPtNet();
			case PtnetLoLAPackage.TRANSITION: return createTransition();
			case PtnetLoLAPackage.NODE: return createNode();
			case PtnetLoLAPackage.MARKING: return createMarking();
			case PtnetLoLAPackage.PLACE_REFERENCE: return createPlaceReference();
			case PtnetLoLAPackage.REF_MARKED_PLACE: return createRefMarkedPlace();
			case PtnetLoLAPackage.ANNOTATION: return createAnnotation();
			case PtnetLoLAPackage.ARC: return createArc();
			case PtnetLoLAPackage.ARC_TO_PLACE: return createArcToPlace();
			case PtnetLoLAPackage.ARC_TO_TRANSITION: return createArcToTransition();
			case PtnetLoLAPackage.TRANSITION_EXT: return createTransitionExt();
			case PtnetLoLAPackage.PLACE_EXT: return createPlaceExt();
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT: return createArcToPlaceExt();
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT: return createArcToTransitionExt();
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
			case PtnetLoLAPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return createConfidentialityFromString(eDataType, initialValue);
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
			case PtnetLoLAPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return convertConfidentialityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace()
	{
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtNet createPtNet()
	{
		PtNetImpl ptNet = new PtNetImpl();
		return ptNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition()
	{
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode()
	{
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking()
	{
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceReference createPlaceReference()
	{
		PlaceReferenceImpl placeReference = new PlaceReferenceImpl();
		return placeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefMarkedPlace createRefMarkedPlace()
	{
		RefMarkedPlaceImpl refMarkedPlace = new RefMarkedPlaceImpl();
		return refMarkedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation()
	{
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc()
	{
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlace createArcToPlace()
	{
		ArcToPlaceImpl arcToPlace = new ArcToPlaceImpl();
		return arcToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransition createArcToTransition()
	{
		ArcToTransitionImpl arcToTransition = new ArcToTransitionImpl();
		return arcToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionExt createTransitionExt()
	{
		TransitionExtImpl transitionExt = new TransitionExtImpl();
		return transitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceExt createPlaceExt()
	{
		PlaceExtImpl placeExt = new PlaceExtImpl();
		return placeExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlaceExt createArcToPlaceExt()
	{
		ArcToPlaceExtImpl arcToPlaceExt = new ArcToPlaceExtImpl();
		return arcToPlaceExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransitionExt createArcToTransitionExt()
	{
		ArcToTransitionExtImpl arcToTransitionExt = new ArcToTransitionExtImpl();
		return arcToTransitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue)
	{
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality createConfidentialityFromString(EDataType eDataType, String initialValue)
	{
		Confidentiality result = Confidentiality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAPackage getPtnetLoLAPackage()
	{
		return (PtnetLoLAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PtnetLoLAPackage getPackage()
	{
		return PtnetLoLAPackage.eINSTANCE;
	}

} //PtnetLoLAFactoryImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetLoLAFactoryImpl extends EFactoryImpl implements PtnetLoLAFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PtnetLoLAFactory init()
	{
		try
		{
			PtnetLoLAFactory thePtnetLoLAFactory = (PtnetLoLAFactory)EPackage.Registry.INSTANCE.getEFactory(PtnetLoLAPackage.eNS_URI);
			if (thePtnetLoLAFactory != null)
			{
				return thePtnetLoLAFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PtnetLoLAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAFactoryImpl()
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
			case PtnetLoLAPackage.PLACE: return createPlace();
			case PtnetLoLAPackage.PT_NET: return createPtNet();
			case PtnetLoLAPackage.TRANSITION: return createTransition();
			case PtnetLoLAPackage.NODE: return createNode();
			case PtnetLoLAPackage.MARKING: return createMarking();
			case PtnetLoLAPackage.PLACE_REFERENCE: return createPlaceReference();
			case PtnetLoLAPackage.REF_MARKED_PLACE: return createRefMarkedPlace();
			case PtnetLoLAPackage.ANNOTATION: return createAnnotation();
			case PtnetLoLAPackage.ARC: return createArc();
			case PtnetLoLAPackage.ARC_TO_PLACE: return createArcToPlace();
			case PtnetLoLAPackage.ARC_TO_TRANSITION: return createArcToTransition();
			case PtnetLoLAPackage.TRANSITION_EXT: return createTransitionExt();
			case PtnetLoLAPackage.PLACE_EXT: return createPlaceExt();
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT: return createArcToPlaceExt();
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT: return createArcToTransitionExt();
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
			case PtnetLoLAPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return createConfidentialityFromString(eDataType, initialValue);
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
			case PtnetLoLAPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return convertConfidentialityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace()
	{
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtNet createPtNet()
	{
		PtNetImpl ptNet = new PtNetImpl();
		return ptNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition()
	{
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode()
	{
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking()
	{
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceReference createPlaceReference()
	{
		PlaceReferenceImpl placeReference = new PlaceReferenceImpl();
		return placeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefMarkedPlace createRefMarkedPlace()
	{
		RefMarkedPlaceImpl refMarkedPlace = new RefMarkedPlaceImpl();
		return refMarkedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation()
	{
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc()
	{
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlace createArcToPlace()
	{
		ArcToPlaceImpl arcToPlace = new ArcToPlaceImpl();
		return arcToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransition createArcToTransition()
	{
		ArcToTransitionImpl arcToTransition = new ArcToTransitionImpl();
		return arcToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionExt createTransitionExt()
	{
		TransitionExtImpl transitionExt = new TransitionExtImpl();
		return transitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceExt createPlaceExt()
	{
		PlaceExtImpl placeExt = new PlaceExtImpl();
		return placeExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlaceExt createArcToPlaceExt()
	{
		ArcToPlaceExtImpl arcToPlaceExt = new ArcToPlaceExtImpl();
		return arcToPlaceExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransitionExt createArcToTransitionExt()
	{
		ArcToTransitionExtImpl arcToTransitionExt = new ArcToTransitionExtImpl();
		return arcToTransitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue)
	{
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality createConfidentialityFromString(EDataType eDataType, String initialValue)
	{
		Confidentiality result = Confidentiality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAPackage getPtnetLoLAPackage()
	{
		return (PtnetLoLAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PtnetLoLAPackage getPackage()
	{
		return PtnetLoLAPackage.eINSTANCE;
	}

} //PtnetLoLAFactoryImpl
/**
 */
package ptnetLoLA.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetLoLAFactoryImpl extends EFactoryImpl implements PtnetLoLAFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PtnetLoLAFactory init()
	{
		try
		{
			PtnetLoLAFactory thePtnetLoLAFactory = (PtnetLoLAFactory)EPackage.Registry.INSTANCE.getEFactory(PtnetLoLAPackage.eNS_URI);
			if (thePtnetLoLAFactory != null)
			{
				return thePtnetLoLAFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PtnetLoLAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAFactoryImpl()
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
			case PtnetLoLAPackage.PLACE: return createPlace();
			case PtnetLoLAPackage.PT_NET: return createPtNet();
			case PtnetLoLAPackage.TRANSITION: return createTransition();
			case PtnetLoLAPackage.NODE: return createNode();
			case PtnetLoLAPackage.MARKING: return createMarking();
			case PtnetLoLAPackage.PLACE_REFERENCE: return createPlaceReference();
			case PtnetLoLAPackage.REF_MARKED_PLACE: return createRefMarkedPlace();
			case PtnetLoLAPackage.ANNOTATION: return createAnnotation();
			case PtnetLoLAPackage.ARC: return createArc();
			case PtnetLoLAPackage.ARC_TO_PLACE: return createArcToPlace();
			case PtnetLoLAPackage.ARC_TO_TRANSITION: return createArcToTransition();
			case PtnetLoLAPackage.TRANSITION_EXT: return createTransitionExt();
			case PtnetLoLAPackage.PLACE_EXT: return createPlaceExt();
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT: return createArcToPlaceExt();
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT: return createArcToTransitionExt();
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
			case PtnetLoLAPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return createConfidentialityFromString(eDataType, initialValue);
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
			case PtnetLoLAPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			case PtnetLoLAPackage.CONFIDENTIALITY:
				return convertConfidentialityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace()
	{
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtNet createPtNet()
	{
		PtNetImpl ptNet = new PtNetImpl();
		return ptNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition()
	{
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode()
	{
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking()
	{
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceReference createPlaceReference()
	{
		PlaceReferenceImpl placeReference = new PlaceReferenceImpl();
		return placeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefMarkedPlace createRefMarkedPlace()
	{
		RefMarkedPlaceImpl refMarkedPlace = new RefMarkedPlaceImpl();
		return refMarkedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation()
	{
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc()
	{
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlace createArcToPlace()
	{
		ArcToPlaceImpl arcToPlace = new ArcToPlaceImpl();
		return arcToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransition createArcToTransition()
	{
		ArcToTransitionImpl arcToTransition = new ArcToTransitionImpl();
		return arcToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionExt createTransitionExt()
	{
		TransitionExtImpl transitionExt = new TransitionExtImpl();
		return transitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceExt createPlaceExt()
	{
		PlaceExtImpl placeExt = new PlaceExtImpl();
		return placeExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToPlaceExt createArcToPlaceExt()
	{
		ArcToPlaceExtImpl arcToPlaceExt = new ArcToPlaceExtImpl();
		return arcToPlaceExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcToTransitionExt createArcToTransitionExt()
	{
		ArcToTransitionExtImpl arcToTransitionExt = new ArcToTransitionExtImpl();
		return arcToTransitionExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue)
	{
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidentiality createConfidentialityFromString(EDataType eDataType, String initialValue)
	{
		Confidentiality result = Confidentiality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLAPackage getPtnetLoLAPackage()
	{
		return (PtnetLoLAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PtnetLoLAPackage getPackage()
	{
		return PtnetLoLAPackage.eINSTANCE;
	}

} //PtnetLoLAFactoryImpl
