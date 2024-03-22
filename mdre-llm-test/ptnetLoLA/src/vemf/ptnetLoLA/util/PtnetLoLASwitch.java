/**
 */
package ptnetLoLA.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ptnetLoLA.PtnetLoLAPackage
 * @generated
 */
public class PtnetLoLASwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PtnetLoLAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLASwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PtnetLoLAPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case PtnetLoLAPackage.PLACE:
			{
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseNode(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PT_NET:
			{
				PtNet ptNet = (PtNet)theEObject;
				T result = casePtNet(ptNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION:
			{
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNode(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.NODE:
			{
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.MARKING:
			{
				Marking marking = (Marking)theEObject;
				T result = caseMarking(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_REFERENCE:
			{
				PlaceReference placeReference = (PlaceReference)theEObject;
				T result = casePlaceReference(placeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.REF_MARKED_PLACE:
			{
				RefMarkedPlace refMarkedPlace = (RefMarkedPlace)theEObject;
				T result = caseRefMarkedPlace(refMarkedPlace);
				if (result == null) result = casePlaceReference(refMarkedPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ANNOTATION:
			{
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC:
			{
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE:
			{
				ArcToPlace arcToPlace = (ArcToPlace)theEObject;
				T result = caseArcToPlace(arcToPlace);
				if (result == null) result = caseArc(arcToPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION:
			{
				ArcToTransition arcToTransition = (ArcToTransition)theEObject;
				T result = caseArcToTransition(arcToTransition);
				if (result == null) result = caseArc(arcToTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION_EXT:
			{
				TransitionExt transitionExt = (TransitionExt)theEObject;
				T result = caseTransitionExt(transitionExt);
				if (result == null) result = caseTransition(transitionExt);
				if (result == null) result = caseNode(transitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_EXT:
			{
				PlaceExt placeExt = (PlaceExt)theEObject;
				T result = casePlaceExt(placeExt);
				if (result == null) result = casePlace(placeExt);
				if (result == null) result = caseNode(placeExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT:
			{
				ArcToPlaceExt arcToPlaceExt = (ArcToPlaceExt)theEObject;
				T result = caseArcToPlaceExt(arcToPlaceExt);
				if (result == null) result = caseArcToPlace(arcToPlaceExt);
				if (result == null) result = caseArc(arcToPlaceExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT:
			{
				ArcToTransitionExt arcToTransitionExt = (ArcToTransitionExt)theEObject;
				T result = caseArcToTransitionExt(arcToTransitionExt);
				if (result == null) result = caseArcToTransition(arcToTransitionExt);
				if (result == null) result = caseArc(arcToTransitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePtNet(PtNet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarking(Marking object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceReference(PlaceReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefMarkedPlace(RefMarkedPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlace(ArcToPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransition(ArcToTransition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionExt(TransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceExt(PlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlaceExt(ArcToPlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransitionExt(ArcToTransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //PtnetLoLASwitch
/**
 */
package ptnetLoLA.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ptnetLoLA.PtnetLoLAPackage
 * @generated
 */
public class PtnetLoLASwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PtnetLoLAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLASwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PtnetLoLAPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case PtnetLoLAPackage.PLACE:
			{
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseNode(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PT_NET:
			{
				PtNet ptNet = (PtNet)theEObject;
				T result = casePtNet(ptNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION:
			{
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNode(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.NODE:
			{
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.MARKING:
			{
				Marking marking = (Marking)theEObject;
				T result = caseMarking(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_REFERENCE:
			{
				PlaceReference placeReference = (PlaceReference)theEObject;
				T result = casePlaceReference(placeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.REF_MARKED_PLACE:
			{
				RefMarkedPlace refMarkedPlace = (RefMarkedPlace)theEObject;
				T result = caseRefMarkedPlace(refMarkedPlace);
				if (result == null) result = casePlaceReference(refMarkedPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ANNOTATION:
			{
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC:
			{
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE:
			{
				ArcToPlace arcToPlace = (ArcToPlace)theEObject;
				T result = caseArcToPlace(arcToPlace);
				if (result == null) result = caseArc(arcToPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION:
			{
				ArcToTransition arcToTransition = (ArcToTransition)theEObject;
				T result = caseArcToTransition(arcToTransition);
				if (result == null) result = caseArc(arcToTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION_EXT:
			{
				TransitionExt transitionExt = (TransitionExt)theEObject;
				T result = caseTransitionExt(transitionExt);
				if (result == null) result = caseTransition(transitionExt);
				if (result == null) result = caseNode(transitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_EXT:
			{
				PlaceExt placeExt = (PlaceExt)theEObject;
				T result = casePlaceExt(placeExt);
				if (result == null) result = casePlace(placeExt);
				if (result == null) result = caseNode(placeExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT:
			{
				ArcToPlaceExt arcToPlaceExt = (ArcToPlaceExt)theEObject;
				T result = caseArcToPlaceExt(arcToPlaceExt);
				if (result == null) result = caseArcToPlace(arcToPlaceExt);
				if (result == null) result = caseArc(arcToPlaceExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT:
			{
				ArcToTransitionExt arcToTransitionExt = (ArcToTransitionExt)theEObject;
				T result = caseArcToTransitionExt(arcToTransitionExt);
				if (result == null) result = caseArcToTransition(arcToTransitionExt);
				if (result == null) result = caseArc(arcToTransitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePtNet(PtNet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarking(Marking object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceReference(PlaceReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefMarkedPlace(RefMarkedPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlace(ArcToPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransition(ArcToTransition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionExt(TransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceExt(PlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlaceExt(ArcToPlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransitionExt(ArcToTransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //PtnetLoLASwitch
/**
 */
package ptnetLoLA.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ptnetLoLA.PtnetLoLAPackage
 * @generated
 */
public class PtnetLoLASwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PtnetLoLAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLASwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PtnetLoLAPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case PtnetLoLAPackage.PLACE:
			{
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseNode(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PT_NET:
			{
				PtNet ptNet = (PtNet)theEObject;
				T result = casePtNet(ptNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION:
			{
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNode(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.NODE:
			{
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.MARKING:
			{
				Marking marking = (Marking)theEObject;
				T result = caseMarking(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_REFERENCE:
			{
				PlaceReference placeReference = (PlaceReference)theEObject;
				T result = casePlaceReference(placeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.REF_MARKED_PLACE:
			{
				RefMarkedPlace refMarkedPlace = (RefMarkedPlace)theEObject;
				T result = caseRefMarkedPlace(refMarkedPlace);
				if (result == null) result = casePlaceReference(refMarkedPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ANNOTATION:
			{
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC:
			{
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE:
			{
				ArcToPlace arcToPlace = (ArcToPlace)theEObject;
				T result = caseArcToPlace(arcToPlace);
				if (result == null) result = caseArc(arcToPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION:
			{
				ArcToTransition arcToTransition = (ArcToTransition)theEObject;
				T result = caseArcToTransition(arcToTransition);
				if (result == null) result = caseArc(arcToTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION_EXT:
			{
				TransitionExt transitionExt = (TransitionExt)theEObject;
				T result = caseTransitionExt(transitionExt);
				if (result == null) result = caseTransition(transitionExt);
				if (result == null) result = caseNode(transitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_EXT:
			{
				PlaceExt placeExt = (PlaceExt)theEObject;
				T result = casePlaceExt(placeExt);
				if (result == null) result = casePlace(placeExt);
				if (result == null) result = caseNode(placeExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT:
			{
				ArcToPlaceExt arcToPlaceExt = (ArcToPlaceExt)theEObject;
				T result = caseArcToPlaceExt(arcToPlaceExt);
				if (result == null) result = caseArcToPlace(arcToPlaceExt);
				if (result == null) result = caseArc(arcToPlaceExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT:
			{
				ArcToTransitionExt arcToTransitionExt = (ArcToTransitionExt)theEObject;
				T result = caseArcToTransitionExt(arcToTransitionExt);
				if (result == null) result = caseArcToTransition(arcToTransitionExt);
				if (result == null) result = caseArc(arcToTransitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePtNet(PtNet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarking(Marking object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceReference(PlaceReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefMarkedPlace(RefMarkedPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlace(ArcToPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransition(ArcToTransition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionExt(TransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceExt(PlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlaceExt(ArcToPlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransitionExt(ArcToTransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //PtnetLoLASwitch
/**
 */
package ptnetLoLA.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ptnetLoLA.PtnetLoLAPackage
 * @generated
 */
public class PtnetLoLASwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PtnetLoLAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLASwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PtnetLoLAPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case PtnetLoLAPackage.PLACE:
			{
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseNode(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PT_NET:
			{
				PtNet ptNet = (PtNet)theEObject;
				T result = casePtNet(ptNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION:
			{
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNode(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.NODE:
			{
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.MARKING:
			{
				Marking marking = (Marking)theEObject;
				T result = caseMarking(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_REFERENCE:
			{
				PlaceReference placeReference = (PlaceReference)theEObject;
				T result = casePlaceReference(placeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.REF_MARKED_PLACE:
			{
				RefMarkedPlace refMarkedPlace = (RefMarkedPlace)theEObject;
				T result = caseRefMarkedPlace(refMarkedPlace);
				if (result == null) result = casePlaceReference(refMarkedPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ANNOTATION:
			{
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC:
			{
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE:
			{
				ArcToPlace arcToPlace = (ArcToPlace)theEObject;
				T result = caseArcToPlace(arcToPlace);
				if (result == null) result = caseArc(arcToPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION:
			{
				ArcToTransition arcToTransition = (ArcToTransition)theEObject;
				T result = caseArcToTransition(arcToTransition);
				if (result == null) result = caseArc(arcToTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION_EXT:
			{
				TransitionExt transitionExt = (TransitionExt)theEObject;
				T result = caseTransitionExt(transitionExt);
				if (result == null) result = caseTransition(transitionExt);
				if (result == null) result = caseNode(transitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_EXT:
			{
				PlaceExt placeExt = (PlaceExt)theEObject;
				T result = casePlaceExt(placeExt);
				if (result == null) result = casePlace(placeExt);
				if (result == null) result = caseNode(placeExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT:
			{
				ArcToPlaceExt arcToPlaceExt = (ArcToPlaceExt)theEObject;
				T result = caseArcToPlaceExt(arcToPlaceExt);
				if (result == null) result = caseArcToPlace(arcToPlaceExt);
				if (result == null) result = caseArc(arcToPlaceExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT:
			{
				ArcToTransitionExt arcToTransitionExt = (ArcToTransitionExt)theEObject;
				T result = caseArcToTransitionExt(arcToTransitionExt);
				if (result == null) result = caseArcToTransition(arcToTransitionExt);
				if (result == null) result = caseArc(arcToTransitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePtNet(PtNet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarking(Marking object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceReference(PlaceReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefMarkedPlace(RefMarkedPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlace(ArcToPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransition(ArcToTransition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionExt(TransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceExt(PlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlaceExt(ArcToPlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransitionExt(ArcToTransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //PtnetLoLASwitch
/**
 */
package ptnetLoLA.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ptnetLoLA.PtnetLoLAPackage
 * @generated
 */
public class PtnetLoLASwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PtnetLoLAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLASwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PtnetLoLAPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case PtnetLoLAPackage.PLACE:
			{
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseNode(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PT_NET:
			{
				PtNet ptNet = (PtNet)theEObject;
				T result = casePtNet(ptNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION:
			{
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNode(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.NODE:
			{
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.MARKING:
			{
				Marking marking = (Marking)theEObject;
				T result = caseMarking(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_REFERENCE:
			{
				PlaceReference placeReference = (PlaceReference)theEObject;
				T result = casePlaceReference(placeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.REF_MARKED_PLACE:
			{
				RefMarkedPlace refMarkedPlace = (RefMarkedPlace)theEObject;
				T result = caseRefMarkedPlace(refMarkedPlace);
				if (result == null) result = casePlaceReference(refMarkedPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ANNOTATION:
			{
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC:
			{
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE:
			{
				ArcToPlace arcToPlace = (ArcToPlace)theEObject;
				T result = caseArcToPlace(arcToPlace);
				if (result == null) result = caseArc(arcToPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION:
			{
				ArcToTransition arcToTransition = (ArcToTransition)theEObject;
				T result = caseArcToTransition(arcToTransition);
				if (result == null) result = caseArc(arcToTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION_EXT:
			{
				TransitionExt transitionExt = (TransitionExt)theEObject;
				T result = caseTransitionExt(transitionExt);
				if (result == null) result = caseTransition(transitionExt);
				if (result == null) result = caseNode(transitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_EXT:
			{
				PlaceExt placeExt = (PlaceExt)theEObject;
				T result = casePlaceExt(placeExt);
				if (result == null) result = casePlace(placeExt);
				if (result == null) result = caseNode(placeExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT:
			{
				ArcToPlaceExt arcToPlaceExt = (ArcToPlaceExt)theEObject;
				T result = caseArcToPlaceExt(arcToPlaceExt);
				if (result == null) result = caseArcToPlace(arcToPlaceExt);
				if (result == null) result = caseArc(arcToPlaceExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT:
			{
				ArcToTransitionExt arcToTransitionExt = (ArcToTransitionExt)theEObject;
				T result = caseArcToTransitionExt(arcToTransitionExt);
				if (result == null) result = caseArcToTransition(arcToTransitionExt);
				if (result == null) result = caseArc(arcToTransitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePtNet(PtNet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarking(Marking object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceReference(PlaceReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefMarkedPlace(RefMarkedPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlace(ArcToPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransition(ArcToTransition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionExt(TransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceExt(PlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlaceExt(ArcToPlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransitionExt(ArcToTransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //PtnetLoLASwitch
/**
 */
package ptnetLoLA.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ptnetLoLA.PtnetLoLAPackage
 * @generated
 */
public class PtnetLoLASwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PtnetLoLAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLASwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PtnetLoLAPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case PtnetLoLAPackage.PLACE:
			{
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseNode(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PT_NET:
			{
				PtNet ptNet = (PtNet)theEObject;
				T result = casePtNet(ptNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION:
			{
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNode(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.NODE:
			{
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.MARKING:
			{
				Marking marking = (Marking)theEObject;
				T result = caseMarking(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_REFERENCE:
			{
				PlaceReference placeReference = (PlaceReference)theEObject;
				T result = casePlaceReference(placeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.REF_MARKED_PLACE:
			{
				RefMarkedPlace refMarkedPlace = (RefMarkedPlace)theEObject;
				T result = caseRefMarkedPlace(refMarkedPlace);
				if (result == null) result = casePlaceReference(refMarkedPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ANNOTATION:
			{
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC:
			{
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE:
			{
				ArcToPlace arcToPlace = (ArcToPlace)theEObject;
				T result = caseArcToPlace(arcToPlace);
				if (result == null) result = caseArc(arcToPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION:
			{
				ArcToTransition arcToTransition = (ArcToTransition)theEObject;
				T result = caseArcToTransition(arcToTransition);
				if (result == null) result = caseArc(arcToTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION_EXT:
			{
				TransitionExt transitionExt = (TransitionExt)theEObject;
				T result = caseTransitionExt(transitionExt);
				if (result == null) result = caseTransition(transitionExt);
				if (result == null) result = caseNode(transitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_EXT:
			{
				PlaceExt placeExt = (PlaceExt)theEObject;
				T result = casePlaceExt(placeExt);
				if (result == null) result = casePlace(placeExt);
				if (result == null) result = caseNode(placeExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT:
			{
				ArcToPlaceExt arcToPlaceExt = (ArcToPlaceExt)theEObject;
				T result = caseArcToPlaceExt(arcToPlaceExt);
				if (result == null) result = caseArcToPlace(arcToPlaceExt);
				if (result == null) result = caseArc(arcToPlaceExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT:
			{
				ArcToTransitionExt arcToTransitionExt = (ArcToTransitionExt)theEObject;
				T result = caseArcToTransitionExt(arcToTransitionExt);
				if (result == null) result = caseArcToTransition(arcToTransitionExt);
				if (result == null) result = caseArc(arcToTransitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePtNet(PtNet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarking(Marking object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceReference(PlaceReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefMarkedPlace(RefMarkedPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlace(ArcToPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransition(ArcToTransition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionExt(TransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceExt(PlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlaceExt(ArcToPlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransitionExt(ArcToTransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //PtnetLoLASwitch
/**
 */
package ptnetLoLA.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ptnetLoLA.PtnetLoLAPackage
 * @generated
 */
public class PtnetLoLASwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PtnetLoLAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLASwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PtnetLoLAPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case PtnetLoLAPackage.PLACE:
			{
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseNode(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PT_NET:
			{
				PtNet ptNet = (PtNet)theEObject;
				T result = casePtNet(ptNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION:
			{
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNode(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.NODE:
			{
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.MARKING:
			{
				Marking marking = (Marking)theEObject;
				T result = caseMarking(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_REFERENCE:
			{
				PlaceReference placeReference = (PlaceReference)theEObject;
				T result = casePlaceReference(placeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.REF_MARKED_PLACE:
			{
				RefMarkedPlace refMarkedPlace = (RefMarkedPlace)theEObject;
				T result = caseRefMarkedPlace(refMarkedPlace);
				if (result == null) result = casePlaceReference(refMarkedPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ANNOTATION:
			{
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC:
			{
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE:
			{
				ArcToPlace arcToPlace = (ArcToPlace)theEObject;
				T result = caseArcToPlace(arcToPlace);
				if (result == null) result = caseArc(arcToPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION:
			{
				ArcToTransition arcToTransition = (ArcToTransition)theEObject;
				T result = caseArcToTransition(arcToTransition);
				if (result == null) result = caseArc(arcToTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION_EXT:
			{
				TransitionExt transitionExt = (TransitionExt)theEObject;
				T result = caseTransitionExt(transitionExt);
				if (result == null) result = caseTransition(transitionExt);
				if (result == null) result = caseNode(transitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_EXT:
			{
				PlaceExt placeExt = (PlaceExt)theEObject;
				T result = casePlaceExt(placeExt);
				if (result == null) result = casePlace(placeExt);
				if (result == null) result = caseNode(placeExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT:
			{
				ArcToPlaceExt arcToPlaceExt = (ArcToPlaceExt)theEObject;
				T result = caseArcToPlaceExt(arcToPlaceExt);
				if (result == null) result = caseArcToPlace(arcToPlaceExt);
				if (result == null) result = caseArc(arcToPlaceExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT:
			{
				ArcToTransitionExt arcToTransitionExt = (ArcToTransitionExt)theEObject;
				T result = caseArcToTransitionExt(arcToTransitionExt);
				if (result == null) result = caseArcToTransition(arcToTransitionExt);
				if (result == null) result = caseArc(arcToTransitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePtNet(PtNet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarking(Marking object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceReference(PlaceReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefMarkedPlace(RefMarkedPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlace(ArcToPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransition(ArcToTransition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionExt(TransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceExt(PlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlaceExt(ArcToPlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransitionExt(ArcToTransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //PtnetLoLASwitch
/**
 */
package ptnetLoLA.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ptnetLoLA.PtnetLoLAPackage
 * @generated
 */
public class PtnetLoLASwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PtnetLoLAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLASwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PtnetLoLAPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case PtnetLoLAPackage.PLACE:
			{
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseNode(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PT_NET:
			{
				PtNet ptNet = (PtNet)theEObject;
				T result = casePtNet(ptNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION:
			{
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNode(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.NODE:
			{
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.MARKING:
			{
				Marking marking = (Marking)theEObject;
				T result = caseMarking(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_REFERENCE:
			{
				PlaceReference placeReference = (PlaceReference)theEObject;
				T result = casePlaceReference(placeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.REF_MARKED_PLACE:
			{
				RefMarkedPlace refMarkedPlace = (RefMarkedPlace)theEObject;
				T result = caseRefMarkedPlace(refMarkedPlace);
				if (result == null) result = casePlaceReference(refMarkedPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ANNOTATION:
			{
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC:
			{
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE:
			{
				ArcToPlace arcToPlace = (ArcToPlace)theEObject;
				T result = caseArcToPlace(arcToPlace);
				if (result == null) result = caseArc(arcToPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION:
			{
				ArcToTransition arcToTransition = (ArcToTransition)theEObject;
				T result = caseArcToTransition(arcToTransition);
				if (result == null) result = caseArc(arcToTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION_EXT:
			{
				TransitionExt transitionExt = (TransitionExt)theEObject;
				T result = caseTransitionExt(transitionExt);
				if (result == null) result = caseTransition(transitionExt);
				if (result == null) result = caseNode(transitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_EXT:
			{
				PlaceExt placeExt = (PlaceExt)theEObject;
				T result = casePlaceExt(placeExt);
				if (result == null) result = casePlace(placeExt);
				if (result == null) result = caseNode(placeExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT:
			{
				ArcToPlaceExt arcToPlaceExt = (ArcToPlaceExt)theEObject;
				T result = caseArcToPlaceExt(arcToPlaceExt);
				if (result == null) result = caseArcToPlace(arcToPlaceExt);
				if (result == null) result = caseArc(arcToPlaceExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT:
			{
				ArcToTransitionExt arcToTransitionExt = (ArcToTransitionExt)theEObject;
				T result = caseArcToTransitionExt(arcToTransitionExt);
				if (result == null) result = caseArcToTransition(arcToTransitionExt);
				if (result == null) result = caseArc(arcToTransitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePtNet(PtNet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarking(Marking object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceReference(PlaceReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefMarkedPlace(RefMarkedPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlace(ArcToPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransition(ArcToTransition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionExt(TransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceExt(PlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlaceExt(ArcToPlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransitionExt(ArcToTransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //PtnetLoLASwitch
/**
 */
package ptnetLoLA.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ptnetLoLA.PtnetLoLAPackage
 * @generated
 */
public class PtnetLoLASwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PtnetLoLAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLASwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PtnetLoLAPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case PtnetLoLAPackage.PLACE:
			{
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseNode(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PT_NET:
			{
				PtNet ptNet = (PtNet)theEObject;
				T result = casePtNet(ptNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION:
			{
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNode(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.NODE:
			{
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.MARKING:
			{
				Marking marking = (Marking)theEObject;
				T result = caseMarking(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_REFERENCE:
			{
				PlaceReference placeReference = (PlaceReference)theEObject;
				T result = casePlaceReference(placeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.REF_MARKED_PLACE:
			{
				RefMarkedPlace refMarkedPlace = (RefMarkedPlace)theEObject;
				T result = caseRefMarkedPlace(refMarkedPlace);
				if (result == null) result = casePlaceReference(refMarkedPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ANNOTATION:
			{
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC:
			{
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE:
			{
				ArcToPlace arcToPlace = (ArcToPlace)theEObject;
				T result = caseArcToPlace(arcToPlace);
				if (result == null) result = caseArc(arcToPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION:
			{
				ArcToTransition arcToTransition = (ArcToTransition)theEObject;
				T result = caseArcToTransition(arcToTransition);
				if (result == null) result = caseArc(arcToTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION_EXT:
			{
				TransitionExt transitionExt = (TransitionExt)theEObject;
				T result = caseTransitionExt(transitionExt);
				if (result == null) result = caseTransition(transitionExt);
				if (result == null) result = caseNode(transitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_EXT:
			{
				PlaceExt placeExt = (PlaceExt)theEObject;
				T result = casePlaceExt(placeExt);
				if (result == null) result = casePlace(placeExt);
				if (result == null) result = caseNode(placeExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT:
			{
				ArcToPlaceExt arcToPlaceExt = (ArcToPlaceExt)theEObject;
				T result = caseArcToPlaceExt(arcToPlaceExt);
				if (result == null) result = caseArcToPlace(arcToPlaceExt);
				if (result == null) result = caseArc(arcToPlaceExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT:
			{
				ArcToTransitionExt arcToTransitionExt = (ArcToTransitionExt)theEObject;
				T result = caseArcToTransitionExt(arcToTransitionExt);
				if (result == null) result = caseArcToTransition(arcToTransitionExt);
				if (result == null) result = caseArc(arcToTransitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePtNet(PtNet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarking(Marking object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceReference(PlaceReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefMarkedPlace(RefMarkedPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlace(ArcToPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransition(ArcToTransition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionExt(TransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceExt(PlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlaceExt(ArcToPlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransitionExt(ArcToTransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //PtnetLoLASwitch
/**
 */
package ptnetLoLA.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ptnetLoLA.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ptnetLoLA.PtnetLoLAPackage
 * @generated
 */
public class PtnetLoLASwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PtnetLoLAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetLoLASwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PtnetLoLAPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case PtnetLoLAPackage.PLACE:
			{
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseNode(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PT_NET:
			{
				PtNet ptNet = (PtNet)theEObject;
				T result = casePtNet(ptNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION:
			{
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNode(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.NODE:
			{
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.MARKING:
			{
				Marking marking = (Marking)theEObject;
				T result = caseMarking(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_REFERENCE:
			{
				PlaceReference placeReference = (PlaceReference)theEObject;
				T result = casePlaceReference(placeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.REF_MARKED_PLACE:
			{
				RefMarkedPlace refMarkedPlace = (RefMarkedPlace)theEObject;
				T result = caseRefMarkedPlace(refMarkedPlace);
				if (result == null) result = casePlaceReference(refMarkedPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ANNOTATION:
			{
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC:
			{
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE:
			{
				ArcToPlace arcToPlace = (ArcToPlace)theEObject;
				T result = caseArcToPlace(arcToPlace);
				if (result == null) result = caseArc(arcToPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION:
			{
				ArcToTransition arcToTransition = (ArcToTransition)theEObject;
				T result = caseArcToTransition(arcToTransition);
				if (result == null) result = caseArc(arcToTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.TRANSITION_EXT:
			{
				TransitionExt transitionExt = (TransitionExt)theEObject;
				T result = caseTransitionExt(transitionExt);
				if (result == null) result = caseTransition(transitionExt);
				if (result == null) result = caseNode(transitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.PLACE_EXT:
			{
				PlaceExt placeExt = (PlaceExt)theEObject;
				T result = casePlaceExt(placeExt);
				if (result == null) result = casePlace(placeExt);
				if (result == null) result = caseNode(placeExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_PLACE_EXT:
			{
				ArcToPlaceExt arcToPlaceExt = (ArcToPlaceExt)theEObject;
				T result = caseArcToPlaceExt(arcToPlaceExt);
				if (result == null) result = caseArcToPlace(arcToPlaceExt);
				if (result == null) result = caseArc(arcToPlaceExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PtnetLoLAPackage.ARC_TO_TRANSITION_EXT:
			{
				ArcToTransitionExt arcToTransitionExt = (ArcToTransitionExt)theEObject;
				T result = caseArcToTransitionExt(arcToTransitionExt);
				if (result == null) result = caseArcToTransition(arcToTransitionExt);
				if (result == null) result = caseArc(arcToTransitionExt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pt Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePtNet(PtNet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarking(Marking object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceReference(PlaceReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Marked Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefMarkedPlace(RefMarkedPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlace(ArcToPlace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransition(ArcToTransition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionExt(TransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceExt(PlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Place Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToPlaceExt(ArcToPlaceExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc To Transition Ext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcToTransitionExt(ArcToTransitionExt object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //PtnetLoLASwitch
