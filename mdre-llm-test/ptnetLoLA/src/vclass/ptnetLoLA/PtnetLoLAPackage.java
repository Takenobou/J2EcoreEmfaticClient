/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ptnetLoLA.PtnetLoLAFactory
 * @model kind="package"
 * @generated
 */
public class PtnetLoLAPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ptnetLoLA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.informatik.hu-berlin.de/top/tools/editors/petrinets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ptnetLoLA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PtnetLoLAPackage eINSTANCE = ptnetLoLA.PtnetLoLAPackage.init();

	/**
	 * The meta object id for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Node
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
	 * @generated
	 */
	public static final int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Place
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
	 * @generated
	 */
	public static final int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TOKEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__FINAL_MARKING = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PtNet
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
	 * @generated
	 */
	public static final int PT_NET = 1;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__INITIAL_MARKING = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ARCS = 4;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__FINAL_MARKING = 5;

	/**
	 * The number of structural features of the '<em>Pt Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Transition
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TYPE = NODE__TYPE;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Marking
	 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
	 * @generated
	 */
	public static final int MARKING = 4;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING__PLACES = 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceReference
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
	 * @generated
	 */
	public static final int PLACE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Place Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.RefMarkedPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
	 * @generated
	 */
	public static final int REF_MARKED_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__PLACE = PLACE_REFERENCE__PLACE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__TOKEN = PLACE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Marked Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE_FEATURE_COUNT = PLACE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Annotation
	 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
	 * @generated
	 */
	public static final int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Arc
	 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
	 * @generated
	 */
	public static final int ARC = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
	 * @generated
	 */
	public static final int ARC_TO_PLACE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransition
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.TransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
	 * @generated
	 */
	public static final int TRANSITION_EXT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__ANNOTATION = TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__INCOMING = TRANSITION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__OUTGOING = TRANSITION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__TYPE = TRANSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MIN_TIME = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__COST = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MAX_TIME = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__CONFIDENTIALITY = TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
	 * @generated
	 */
	public static final int PLACE_EXT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__ANNOTATION = PLACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__INCOMING = PLACE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__OUTGOING = PLACE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TYPE = PLACE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TOKEN = PLACE__TOKEN;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__FINAL_MARKING = PLACE__FINAL_MARKING;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__PROBABILITY = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__IS_START = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT_FEATURE_COUNT = PLACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
	 * @generated
	 */
	public static final int ARC_TO_PLACE_EXT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__SOURCE = ARC_TO_PLACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__TARGET = ARC_TO_PLACE__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__WEIGHT = ARC_TO_PLACE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__PROBABILITY = ARC_TO_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT_FEATURE_COUNT = ARC_TO_PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION_EXT = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__SOURCE = ARC_TO_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__TARGET = ARC_TO_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__WEIGHT = ARC_TO_TRANSITION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__PROBABILITY = ARC_TO_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT_FEATURE_COUNT = ARC_TO_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.NodeType
	 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
	 * @generated
	 */
	public static final int NODE_TYPE = 15;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Confidentiality
	 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
	 * @generated
	 */
	public static final int CONFIDENTIALITY = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetEClass = null;

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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refMarkedPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityEEnum = null;

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
	 * @see ptnetLoLA.PtnetLoLAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetLoLAPackage()
	{
		super(eNS_URI, PtnetLoLAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PtnetLoLAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetLoLAPackage init()
	{
		if (isInited) return (PtnetLoLAPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetLoLAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPtnetLoLAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PtnetLoLAPackage thePtnetLoLAPackage = registeredPtnetLoLAPackage instanceof PtnetLoLAPackage ? (PtnetLoLAPackage)registeredPtnetLoLAPackage : new PtnetLoLAPackage();

		isInited = true;

		// Create package meta-data objects
		thePtnetLoLAPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetLoLAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetLoLAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetLoLAPackage.eNS_URI, thePtnetLoLAPackage);
		return thePtnetLoLAPackage;
	}


	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see ptnetLoLA.Place
	 * @generated
	 */
	public EClass getPlace()
	{
		return placeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_Token()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Marking</em>'.
	 * @see ptnetLoLA.Place#getFinalMarking()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_FinalMarking()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PtNet <em>Pt Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pt Net</em>'.
	 * @see ptnetLoLA.PtNet
	 * @generated
	 */
	public EClass getPtNet()
	{
		return ptNetEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.PtNet#getPlaces()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Places()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ptnetLoLA.PtNet#getTransitions()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Transitions()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see ptnetLoLA.PtNet#getInitialMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_InitialMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.PtNet#getAnnotation()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Annotation()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see ptnetLoLA.PtNet#getArcs()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Arcs()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Marking</em>'.
	 * @see ptnetLoLA.PtNet#getFinalMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_FinalMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ptnetLoLA.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ptnetLoLA.Node
	 * @generated
	 */
	public EClass getNode()
	{
		return nodeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ptnetLoLA.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Name()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.Node#getAnnotation()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Annotation()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see ptnetLoLA.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Incoming()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see ptnetLoLA.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Outgoing()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ptnetLoLA.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Type()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see ptnetLoLA.Marking
	 * @generated
	 */
	public EClass getMarking()
	{
		return markingEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.Marking#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.Marking#getPlaces()
	 * @see #getMarking()
	 * @generated
	 */
	public EReference getMarking_Places()
	{
		return (EReference)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Reference</em>'.
	 * @see ptnetLoLA.PlaceReference
	 * @generated
	 */
	public EClass getPlaceReference()
	{
		return placeReferenceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.PlaceReference#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ptnetLoLA.PlaceReference#getPlace()
	 * @see #getPlaceReference()
	 * @generated
	 */
	public EReference getPlaceReference_Place()
	{
		return (EReference)placeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Marked Place</em>'.
	 * @see ptnetLoLA.RefMarkedPlace
	 * @generated
	 */
	public EClass getRefMarkedPlace()
	{
		return refMarkedPlaceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.RefMarkedPlace#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.RefMarkedPlace#getToken()
	 * @see #getRefMarkedPlace()
	 * @generated
	 */
	public EAttribute getRefMarkedPlace_Token()
	{
		return (EAttribute)refMarkedPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ptnetLoLA.Annotation
	 * @generated
	 */
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ptnetLoLA.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	public EAttribute getAnnotation_Text()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see ptnetLoLA.Arc
	 * @generated
	 */
	public EClass getArc()
	{
		return arcEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ptnetLoLA.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Source()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ptnetLoLA.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Target()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ptnetLoLA.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	public EAttribute getArc_Weight()
	{
		return (EAttribute)arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place</em>'.
	 * @see ptnetLoLA.ArcToPlace
	 * @generated
	 */
	public EClass getArcToPlace()
	{
		return arcToPlaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition</em>'.
	 * @see ptnetLoLA.ArcToTransition
	 * @generated
	 */
	public EClass getArcToTransition()
	{
		return arcToTransitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Ext</em>'.
	 * @see ptnetLoLA.TransitionExt
	 * @generated
	 */
	public EClass getTransitionExt()
	{
		return transitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.TransitionExt#getProbability()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Probability()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMinTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MinTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see ptnetLoLA.TransitionExt#getCost()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Cost()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMaxTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MaxTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.TransitionExt#getConfidentiality()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Confidentiality()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Ext</em>'.
	 * @see ptnetLoLA.PlaceExt
	 * @generated
	 */
	public EClass getPlaceExt()
	{
		return placeExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.PlaceExt#getProbability()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_Probability()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see ptnetLoLA.PlaceExt#isIsStart()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_IsStart()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place Ext</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @generated
	 */
	public EClass getArcToPlaceExt()
	{
		return arcToPlaceExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToPlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt#getProbability()
	 * @see #getArcToPlaceExt()
	 * @generated
	 */
	public EAttribute getArcToPlaceExt_Probability()
	{
		return (EAttribute)arcToPlaceExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition Ext</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @generated
	 */
	public EClass getArcToTransitionExt()
	{
		return arcToTransitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToTransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt#getProbability()
	 * @see #getArcToTransitionExt()
	 * @generated
	 */
	public EAttribute getArcToTransitionExt_Probability()
	{
		return (EAttribute)arcToTransitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see ptnetLoLA.NodeType
	 * @generated
	 */
	public EEnum getNodeType()
	{
		return nodeTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.Confidentiality
	 * @generated
	 */
	public EEnum getConfidentiality()
	{
		return confidentialityEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PtnetLoLAFactory getPtnetLoLAFactory()
	{
		return (PtnetLoLAFactory)getEFactoryInstance();
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
		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__TOKEN);
		createEAttribute(placeEClass, PLACE__FINAL_MARKING);

		ptNetEClass = createEClass(PT_NET);
		createEReference(ptNetEClass, PT_NET__PLACES);
		createEReference(ptNetEClass, PT_NET__TRANSITIONS);
		createEReference(ptNetEClass, PT_NET__INITIAL_MARKING);
		createEReference(ptNetEClass, PT_NET__ANNOTATION);
		createEReference(ptNetEClass, PT_NET__ARCS);
		createEReference(ptNetEClass, PT_NET__FINAL_MARKING);

		transitionEClass = createEClass(TRANSITION);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__ANNOTATION);
		createEReference(nodeEClass, NODE__INCOMING);
		createEReference(nodeEClass, NODE__OUTGOING);
		createEAttribute(nodeEClass, NODE__TYPE);

		markingEClass = createEClass(MARKING);
		createEReference(markingEClass, MARKING__PLACES);

		placeReferenceEClass = createEClass(PLACE_REFERENCE);
		createEReference(placeReferenceEClass, PLACE_REFERENCE__PLACE);

		refMarkedPlaceEClass = createEClass(REF_MARKED_PLACE);
		createEAttribute(refMarkedPlaceEClass, REF_MARKED_PLACE__TOKEN);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__TEXT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);
		createEAttribute(arcEClass, ARC__WEIGHT);

		arcToPlaceEClass = createEClass(ARC_TO_PLACE);

		arcToTransitionEClass = createEClass(ARC_TO_TRANSITION);

		transitionExtEClass = createEClass(TRANSITION_EXT);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__PROBABILITY);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MIN_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__COST);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MAX_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__CONFIDENTIALITY);

		placeExtEClass = createEClass(PLACE_EXT);
		createEAttribute(placeExtEClass, PLACE_EXT__PROBABILITY);
		createEAttribute(placeExtEClass, PLACE_EXT__IS_START);

		arcToPlaceExtEClass = createEClass(ARC_TO_PLACE_EXT);
		createEAttribute(arcToPlaceExtEClass, ARC_TO_PLACE_EXT__PROBABILITY);

		arcToTransitionExtEClass = createEClass(ARC_TO_TRANSITION_EXT);
		createEAttribute(arcToTransitionExtEClass, ARC_TO_TRANSITION_EXT__PROBABILITY);

		// Create enums
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		confidentialityEEnum = createEEnum(CONFIDENTIALITY);
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
		placeEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getNode());
		refMarkedPlaceEClass.getESuperTypes().add(this.getPlaceReference());
		arcToPlaceEClass.getESuperTypes().add(this.getArc());
		arcToTransitionEClass.getESuperTypes().add(this.getArc());
		transitionExtEClass.getESuperTypes().add(this.getTransition());
		placeExtEClass.getESuperTypes().add(this.getPlace());
		arcToPlaceExtEClass.getESuperTypes().add(this.getArcToPlace());
		arcToTransitionExtEClass.getESuperTypes().add(this.getArcToTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Token(), ecorePackage.getEInt(), "token", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_FinalMarking(), ecorePackage.getEInt(), "finalMarking", "0", 1, 1, Place.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ptNetEClass, PtNet.class, "PtNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPtNet_Places(), this.getPlace(), null, "places", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_InitialMarking(), this.getMarking(), null, "initialMarking", null, 1, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Arcs(), this.getArc(), null, "arcs", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_FinalMarking(), this.getMarking(), null, "finalMarking", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Incoming(), this.getArc(), this.getArc_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Outgoing(), this.getArc(), this.getArc_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type(), this.getNodeType(), "type", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarking_Places(), this.getRefMarkedPlace(), null, "places", null, 0, -1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeReferenceEClass, PlaceReference.class, "PlaceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceReference_Place(), this.getPlace(), null, "place", null, 1, 1, PlaceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refMarkedPlaceEClass, RefMarkedPlace.class, "RefMarkedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefMarkedPlace_Token(), ecorePackage.getEInt(), "token", "1", 1, 1, RefMarkedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_Weight(), ecorePackage.getEInt(), "weight", "1", 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceEClass, ArcToPlace.class, "ArcToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcToTransitionEClass, ArcToTransition.class, "ArcToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionExtEClass, TransitionExt.class, "TransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MinTime(), ecorePackage.getEInt(), "minTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Cost(), ecorePackage.getEDouble(), "cost", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MaxTime(), ecorePackage.getEInt(), "maxTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Confidentiality(), this.getConfidentiality(), "confidentiality", null, 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeExtEClass, PlaceExt.class, "PlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceExt_IsStart(), ecorePackage.getEBoolean(), "isStart", "False", 1, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceExtEClass, ArcToPlaceExt.class, "ArcToPlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToPlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToTransitionExtEClass, ArcToTransitionExt.class, "ArcToTransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToTransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.INTERNAL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.OUTPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INOUT);

		initEEnum(confidentialityEEnum, Confidentiality.class, "Confidentiality");
		addEEnumLiteral(confidentialityEEnum, Confidentiality.UNKNOWN);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.LOW);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.HIGH);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Place
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
		 * @generated
		 */
		public static final EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__FINAL_MARKING = eINSTANCE.getPlace_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PtNet
		 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
		 * @generated
		 */
		public static final EClass PT_NET = eINSTANCE.getPtNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__PLACES = eINSTANCE.getPtNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__TRANSITIONS = eINSTANCE.getPtNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__INITIAL_MARKING = eINSTANCE.getPtNet_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ANNOTATION = eINSTANCE.getPtNet_Annotation();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ARCS = eINSTANCE.getPtNet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__FINAL_MARKING = eINSTANCE.getPtNet_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Transition
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Node
		 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
		 * @generated
		 */
		public static final EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__ANNOTATION = eINSTANCE.getNode_Annotation();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Marking
		 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
		 * @generated
		 */
		public static final EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MARKING__PLACES = eINSTANCE.getMarking_Places();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceReference
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
		 * @generated
		 */
		public static final EClass PLACE_REFERENCE = eINSTANCE.getPlaceReference();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLACE_REFERENCE__PLACE = eINSTANCE.getPlaceReference_Place();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.RefMarkedPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
		 * @generated
		 */
		public static final EClass REF_MARKED_PLACE = eINSTANCE.getRefMarkedPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REF_MARKED_PLACE__TOKEN = eINSTANCE.getRefMarkedPlace_Token();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Annotation
		 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
		 * @generated
		 */
		public static final EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Arc
		 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
		 * @generated
		 */
		public static final EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE = eINSTANCE.getArcToPlace();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransition
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION = eINSTANCE.getArcToTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.TransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
		 * @generated
		 */
		public static final EClass TRANSITION_EXT = eINSTANCE.getTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__PROBABILITY = eINSTANCE.getTransitionExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MIN_TIME = eINSTANCE.getTransitionExt_MinTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__COST = eINSTANCE.getTransitionExt_Cost();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MAX_TIME = eINSTANCE.getTransitionExt_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__CONFIDENTIALITY = eINSTANCE.getTransitionExt_Confidentiality();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
		 * @generated
		 */
		public static final EClass PLACE_EXT = eINSTANCE.getPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__PROBABILITY = eINSTANCE.getPlaceExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__IS_START = eINSTANCE.getPlaceExt_IsStart();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE_EXT = eINSTANCE.getArcToPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_PLACE_EXT__PROBABILITY = eINSTANCE.getArcToPlaceExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION_EXT = eINSTANCE.getArcToTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_TRANSITION_EXT__PROBABILITY = eINSTANCE.getArcToTransitionExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.NodeType
		 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
		 * @generated
		 */
		public static final EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Confidentiality
		 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
		 * @generated
		 */
		public static final EEnum CONFIDENTIALITY = eINSTANCE.getConfidentiality();

	}

} //PtnetLoLAPackage
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ptnetLoLA.PtnetLoLAFactory
 * @model kind="package"
 * @generated
 */
public class PtnetLoLAPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ptnetLoLA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.informatik.hu-berlin.de/top/tools/editors/petrinets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ptnetLoLA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PtnetLoLAPackage eINSTANCE = ptnetLoLA.PtnetLoLAPackage.init();

	/**
	 * The meta object id for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Node
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
	 * @generated
	 */
	public static final int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Place
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
	 * @generated
	 */
	public static final int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TOKEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__FINAL_MARKING = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PtNet
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
	 * @generated
	 */
	public static final int PT_NET = 1;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__INITIAL_MARKING = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ARCS = 4;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__FINAL_MARKING = 5;

	/**
	 * The number of structural features of the '<em>Pt Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Transition
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TYPE = NODE__TYPE;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Marking
	 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
	 * @generated
	 */
	public static final int MARKING = 4;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING__PLACES = 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceReference
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
	 * @generated
	 */
	public static final int PLACE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Place Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.RefMarkedPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
	 * @generated
	 */
	public static final int REF_MARKED_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__PLACE = PLACE_REFERENCE__PLACE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__TOKEN = PLACE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Marked Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE_FEATURE_COUNT = PLACE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Annotation
	 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
	 * @generated
	 */
	public static final int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Arc
	 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
	 * @generated
	 */
	public static final int ARC = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
	 * @generated
	 */
	public static final int ARC_TO_PLACE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransition
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.TransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
	 * @generated
	 */
	public static final int TRANSITION_EXT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__ANNOTATION = TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__INCOMING = TRANSITION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__OUTGOING = TRANSITION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__TYPE = TRANSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MIN_TIME = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__COST = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MAX_TIME = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__CONFIDENTIALITY = TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
	 * @generated
	 */
	public static final int PLACE_EXT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__ANNOTATION = PLACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__INCOMING = PLACE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__OUTGOING = PLACE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TYPE = PLACE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TOKEN = PLACE__TOKEN;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__FINAL_MARKING = PLACE__FINAL_MARKING;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__PROBABILITY = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__IS_START = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT_FEATURE_COUNT = PLACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
	 * @generated
	 */
	public static final int ARC_TO_PLACE_EXT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__SOURCE = ARC_TO_PLACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__TARGET = ARC_TO_PLACE__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__WEIGHT = ARC_TO_PLACE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__PROBABILITY = ARC_TO_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT_FEATURE_COUNT = ARC_TO_PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION_EXT = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__SOURCE = ARC_TO_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__TARGET = ARC_TO_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__WEIGHT = ARC_TO_TRANSITION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__PROBABILITY = ARC_TO_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT_FEATURE_COUNT = ARC_TO_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.NodeType
	 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
	 * @generated
	 */
	public static final int NODE_TYPE = 15;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Confidentiality
	 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
	 * @generated
	 */
	public static final int CONFIDENTIALITY = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetEClass = null;

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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refMarkedPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityEEnum = null;

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
	 * @see ptnetLoLA.PtnetLoLAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetLoLAPackage()
	{
		super(eNS_URI, PtnetLoLAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PtnetLoLAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetLoLAPackage init()
	{
		if (isInited) return (PtnetLoLAPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetLoLAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPtnetLoLAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PtnetLoLAPackage thePtnetLoLAPackage = registeredPtnetLoLAPackage instanceof PtnetLoLAPackage ? (PtnetLoLAPackage)registeredPtnetLoLAPackage : new PtnetLoLAPackage();

		isInited = true;

		// Create package meta-data objects
		thePtnetLoLAPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetLoLAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetLoLAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetLoLAPackage.eNS_URI, thePtnetLoLAPackage);
		return thePtnetLoLAPackage;
	}


	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see ptnetLoLA.Place
	 * @generated
	 */
	public EClass getPlace()
	{
		return placeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_Token()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Marking</em>'.
	 * @see ptnetLoLA.Place#getFinalMarking()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_FinalMarking()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PtNet <em>Pt Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pt Net</em>'.
	 * @see ptnetLoLA.PtNet
	 * @generated
	 */
	public EClass getPtNet()
	{
		return ptNetEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.PtNet#getPlaces()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Places()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ptnetLoLA.PtNet#getTransitions()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Transitions()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see ptnetLoLA.PtNet#getInitialMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_InitialMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.PtNet#getAnnotation()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Annotation()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see ptnetLoLA.PtNet#getArcs()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Arcs()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Marking</em>'.
	 * @see ptnetLoLA.PtNet#getFinalMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_FinalMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ptnetLoLA.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ptnetLoLA.Node
	 * @generated
	 */
	public EClass getNode()
	{
		return nodeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ptnetLoLA.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Name()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.Node#getAnnotation()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Annotation()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see ptnetLoLA.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Incoming()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see ptnetLoLA.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Outgoing()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ptnetLoLA.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Type()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see ptnetLoLA.Marking
	 * @generated
	 */
	public EClass getMarking()
	{
		return markingEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.Marking#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.Marking#getPlaces()
	 * @see #getMarking()
	 * @generated
	 */
	public EReference getMarking_Places()
	{
		return (EReference)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Reference</em>'.
	 * @see ptnetLoLA.PlaceReference
	 * @generated
	 */
	public EClass getPlaceReference()
	{
		return placeReferenceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.PlaceReference#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ptnetLoLA.PlaceReference#getPlace()
	 * @see #getPlaceReference()
	 * @generated
	 */
	public EReference getPlaceReference_Place()
	{
		return (EReference)placeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Marked Place</em>'.
	 * @see ptnetLoLA.RefMarkedPlace
	 * @generated
	 */
	public EClass getRefMarkedPlace()
	{
		return refMarkedPlaceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.RefMarkedPlace#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.RefMarkedPlace#getToken()
	 * @see #getRefMarkedPlace()
	 * @generated
	 */
	public EAttribute getRefMarkedPlace_Token()
	{
		return (EAttribute)refMarkedPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ptnetLoLA.Annotation
	 * @generated
	 */
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ptnetLoLA.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	public EAttribute getAnnotation_Text()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see ptnetLoLA.Arc
	 * @generated
	 */
	public EClass getArc()
	{
		return arcEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ptnetLoLA.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Source()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ptnetLoLA.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Target()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ptnetLoLA.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	public EAttribute getArc_Weight()
	{
		return (EAttribute)arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place</em>'.
	 * @see ptnetLoLA.ArcToPlace
	 * @generated
	 */
	public EClass getArcToPlace()
	{
		return arcToPlaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition</em>'.
	 * @see ptnetLoLA.ArcToTransition
	 * @generated
	 */
	public EClass getArcToTransition()
	{
		return arcToTransitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Ext</em>'.
	 * @see ptnetLoLA.TransitionExt
	 * @generated
	 */
	public EClass getTransitionExt()
	{
		return transitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.TransitionExt#getProbability()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Probability()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMinTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MinTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see ptnetLoLA.TransitionExt#getCost()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Cost()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMaxTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MaxTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.TransitionExt#getConfidentiality()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Confidentiality()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Ext</em>'.
	 * @see ptnetLoLA.PlaceExt
	 * @generated
	 */
	public EClass getPlaceExt()
	{
		return placeExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.PlaceExt#getProbability()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_Probability()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see ptnetLoLA.PlaceExt#isIsStart()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_IsStart()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place Ext</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @generated
	 */
	public EClass getArcToPlaceExt()
	{
		return arcToPlaceExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToPlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt#getProbability()
	 * @see #getArcToPlaceExt()
	 * @generated
	 */
	public EAttribute getArcToPlaceExt_Probability()
	{
		return (EAttribute)arcToPlaceExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition Ext</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @generated
	 */
	public EClass getArcToTransitionExt()
	{
		return arcToTransitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToTransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt#getProbability()
	 * @see #getArcToTransitionExt()
	 * @generated
	 */
	public EAttribute getArcToTransitionExt_Probability()
	{
		return (EAttribute)arcToTransitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see ptnetLoLA.NodeType
	 * @generated
	 */
	public EEnum getNodeType()
	{
		return nodeTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.Confidentiality
	 * @generated
	 */
	public EEnum getConfidentiality()
	{
		return confidentialityEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PtnetLoLAFactory getPtnetLoLAFactory()
	{
		return (PtnetLoLAFactory)getEFactoryInstance();
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
		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__TOKEN);
		createEAttribute(placeEClass, PLACE__FINAL_MARKING);

		ptNetEClass = createEClass(PT_NET);
		createEReference(ptNetEClass, PT_NET__PLACES);
		createEReference(ptNetEClass, PT_NET__TRANSITIONS);
		createEReference(ptNetEClass, PT_NET__INITIAL_MARKING);
		createEReference(ptNetEClass, PT_NET__ANNOTATION);
		createEReference(ptNetEClass, PT_NET__ARCS);
		createEReference(ptNetEClass, PT_NET__FINAL_MARKING);

		transitionEClass = createEClass(TRANSITION);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__ANNOTATION);
		createEReference(nodeEClass, NODE__INCOMING);
		createEReference(nodeEClass, NODE__OUTGOING);
		createEAttribute(nodeEClass, NODE__TYPE);

		markingEClass = createEClass(MARKING);
		createEReference(markingEClass, MARKING__PLACES);

		placeReferenceEClass = createEClass(PLACE_REFERENCE);
		createEReference(placeReferenceEClass, PLACE_REFERENCE__PLACE);

		refMarkedPlaceEClass = createEClass(REF_MARKED_PLACE);
		createEAttribute(refMarkedPlaceEClass, REF_MARKED_PLACE__TOKEN);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__TEXT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);
		createEAttribute(arcEClass, ARC__WEIGHT);

		arcToPlaceEClass = createEClass(ARC_TO_PLACE);

		arcToTransitionEClass = createEClass(ARC_TO_TRANSITION);

		transitionExtEClass = createEClass(TRANSITION_EXT);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__PROBABILITY);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MIN_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__COST);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MAX_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__CONFIDENTIALITY);

		placeExtEClass = createEClass(PLACE_EXT);
		createEAttribute(placeExtEClass, PLACE_EXT__PROBABILITY);
		createEAttribute(placeExtEClass, PLACE_EXT__IS_START);

		arcToPlaceExtEClass = createEClass(ARC_TO_PLACE_EXT);
		createEAttribute(arcToPlaceExtEClass, ARC_TO_PLACE_EXT__PROBABILITY);

		arcToTransitionExtEClass = createEClass(ARC_TO_TRANSITION_EXT);
		createEAttribute(arcToTransitionExtEClass, ARC_TO_TRANSITION_EXT__PROBABILITY);

		// Create enums
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		confidentialityEEnum = createEEnum(CONFIDENTIALITY);
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
		placeEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getNode());
		refMarkedPlaceEClass.getESuperTypes().add(this.getPlaceReference());
		arcToPlaceEClass.getESuperTypes().add(this.getArc());
		arcToTransitionEClass.getESuperTypes().add(this.getArc());
		transitionExtEClass.getESuperTypes().add(this.getTransition());
		placeExtEClass.getESuperTypes().add(this.getPlace());
		arcToPlaceExtEClass.getESuperTypes().add(this.getArcToPlace());
		arcToTransitionExtEClass.getESuperTypes().add(this.getArcToTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Token(), ecorePackage.getEInt(), "token", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_FinalMarking(), ecorePackage.getEInt(), "finalMarking", "0", 1, 1, Place.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ptNetEClass, PtNet.class, "PtNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPtNet_Places(), this.getPlace(), null, "places", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_InitialMarking(), this.getMarking(), null, "initialMarking", null, 1, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Arcs(), this.getArc(), null, "arcs", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_FinalMarking(), this.getMarking(), null, "finalMarking", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Incoming(), this.getArc(), this.getArc_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Outgoing(), this.getArc(), this.getArc_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type(), this.getNodeType(), "type", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarking_Places(), this.getRefMarkedPlace(), null, "places", null, 0, -1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeReferenceEClass, PlaceReference.class, "PlaceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceReference_Place(), this.getPlace(), null, "place", null, 1, 1, PlaceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refMarkedPlaceEClass, RefMarkedPlace.class, "RefMarkedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefMarkedPlace_Token(), ecorePackage.getEInt(), "token", "1", 1, 1, RefMarkedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_Weight(), ecorePackage.getEInt(), "weight", "1", 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceEClass, ArcToPlace.class, "ArcToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcToTransitionEClass, ArcToTransition.class, "ArcToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionExtEClass, TransitionExt.class, "TransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MinTime(), ecorePackage.getEInt(), "minTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Cost(), ecorePackage.getEDouble(), "cost", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MaxTime(), ecorePackage.getEInt(), "maxTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Confidentiality(), this.getConfidentiality(), "confidentiality", null, 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeExtEClass, PlaceExt.class, "PlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceExt_IsStart(), ecorePackage.getEBoolean(), "isStart", "False", 1, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceExtEClass, ArcToPlaceExt.class, "ArcToPlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToPlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToTransitionExtEClass, ArcToTransitionExt.class, "ArcToTransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToTransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.INTERNAL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.OUTPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INOUT);

		initEEnum(confidentialityEEnum, Confidentiality.class, "Confidentiality");
		addEEnumLiteral(confidentialityEEnum, Confidentiality.UNKNOWN);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.LOW);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.HIGH);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Place
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
		 * @generated
		 */
		public static final EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__FINAL_MARKING = eINSTANCE.getPlace_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PtNet
		 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
		 * @generated
		 */
		public static final EClass PT_NET = eINSTANCE.getPtNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__PLACES = eINSTANCE.getPtNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__TRANSITIONS = eINSTANCE.getPtNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__INITIAL_MARKING = eINSTANCE.getPtNet_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ANNOTATION = eINSTANCE.getPtNet_Annotation();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ARCS = eINSTANCE.getPtNet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__FINAL_MARKING = eINSTANCE.getPtNet_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Transition
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Node
		 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
		 * @generated
		 */
		public static final EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__ANNOTATION = eINSTANCE.getNode_Annotation();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Marking
		 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
		 * @generated
		 */
		public static final EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MARKING__PLACES = eINSTANCE.getMarking_Places();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceReference
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
		 * @generated
		 */
		public static final EClass PLACE_REFERENCE = eINSTANCE.getPlaceReference();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLACE_REFERENCE__PLACE = eINSTANCE.getPlaceReference_Place();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.RefMarkedPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
		 * @generated
		 */
		public static final EClass REF_MARKED_PLACE = eINSTANCE.getRefMarkedPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REF_MARKED_PLACE__TOKEN = eINSTANCE.getRefMarkedPlace_Token();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Annotation
		 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
		 * @generated
		 */
		public static final EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Arc
		 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
		 * @generated
		 */
		public static final EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE = eINSTANCE.getArcToPlace();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransition
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION = eINSTANCE.getArcToTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.TransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
		 * @generated
		 */
		public static final EClass TRANSITION_EXT = eINSTANCE.getTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__PROBABILITY = eINSTANCE.getTransitionExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MIN_TIME = eINSTANCE.getTransitionExt_MinTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__COST = eINSTANCE.getTransitionExt_Cost();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MAX_TIME = eINSTANCE.getTransitionExt_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__CONFIDENTIALITY = eINSTANCE.getTransitionExt_Confidentiality();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
		 * @generated
		 */
		public static final EClass PLACE_EXT = eINSTANCE.getPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__PROBABILITY = eINSTANCE.getPlaceExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__IS_START = eINSTANCE.getPlaceExt_IsStart();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE_EXT = eINSTANCE.getArcToPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_PLACE_EXT__PROBABILITY = eINSTANCE.getArcToPlaceExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION_EXT = eINSTANCE.getArcToTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_TRANSITION_EXT__PROBABILITY = eINSTANCE.getArcToTransitionExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.NodeType
		 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
		 * @generated
		 */
		public static final EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Confidentiality
		 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
		 * @generated
		 */
		public static final EEnum CONFIDENTIALITY = eINSTANCE.getConfidentiality();

	}

} //PtnetLoLAPackage
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ptnetLoLA.PtnetLoLAFactory
 * @model kind="package"
 * @generated
 */
public class PtnetLoLAPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ptnetLoLA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.informatik.hu-berlin.de/top/tools/editors/petrinets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ptnetLoLA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PtnetLoLAPackage eINSTANCE = ptnetLoLA.PtnetLoLAPackage.init();

	/**
	 * The meta object id for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Node
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
	 * @generated
	 */
	public static final int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Place
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
	 * @generated
	 */
	public static final int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TOKEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__FINAL_MARKING = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PtNet
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
	 * @generated
	 */
	public static final int PT_NET = 1;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__INITIAL_MARKING = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ARCS = 4;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__FINAL_MARKING = 5;

	/**
	 * The number of structural features of the '<em>Pt Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Transition
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TYPE = NODE__TYPE;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Marking
	 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
	 * @generated
	 */
	public static final int MARKING = 4;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING__PLACES = 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceReference
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
	 * @generated
	 */
	public static final int PLACE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Place Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.RefMarkedPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
	 * @generated
	 */
	public static final int REF_MARKED_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__PLACE = PLACE_REFERENCE__PLACE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__TOKEN = PLACE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Marked Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE_FEATURE_COUNT = PLACE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Annotation
	 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
	 * @generated
	 */
	public static final int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Arc
	 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
	 * @generated
	 */
	public static final int ARC = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
	 * @generated
	 */
	public static final int ARC_TO_PLACE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransition
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.TransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
	 * @generated
	 */
	public static final int TRANSITION_EXT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__ANNOTATION = TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__INCOMING = TRANSITION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__OUTGOING = TRANSITION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__TYPE = TRANSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MIN_TIME = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__COST = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MAX_TIME = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__CONFIDENTIALITY = TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
	 * @generated
	 */
	public static final int PLACE_EXT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__ANNOTATION = PLACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__INCOMING = PLACE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__OUTGOING = PLACE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TYPE = PLACE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TOKEN = PLACE__TOKEN;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__FINAL_MARKING = PLACE__FINAL_MARKING;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__PROBABILITY = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__IS_START = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT_FEATURE_COUNT = PLACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
	 * @generated
	 */
	public static final int ARC_TO_PLACE_EXT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__SOURCE = ARC_TO_PLACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__TARGET = ARC_TO_PLACE__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__WEIGHT = ARC_TO_PLACE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__PROBABILITY = ARC_TO_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT_FEATURE_COUNT = ARC_TO_PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION_EXT = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__SOURCE = ARC_TO_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__TARGET = ARC_TO_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__WEIGHT = ARC_TO_TRANSITION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__PROBABILITY = ARC_TO_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT_FEATURE_COUNT = ARC_TO_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.NodeType
	 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
	 * @generated
	 */
	public static final int NODE_TYPE = 15;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Confidentiality
	 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
	 * @generated
	 */
	public static final int CONFIDENTIALITY = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetEClass = null;

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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refMarkedPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityEEnum = null;

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
	 * @see ptnetLoLA.PtnetLoLAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetLoLAPackage()
	{
		super(eNS_URI, PtnetLoLAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PtnetLoLAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetLoLAPackage init()
	{
		if (isInited) return (PtnetLoLAPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetLoLAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPtnetLoLAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PtnetLoLAPackage thePtnetLoLAPackage = registeredPtnetLoLAPackage instanceof PtnetLoLAPackage ? (PtnetLoLAPackage)registeredPtnetLoLAPackage : new PtnetLoLAPackage();

		isInited = true;

		// Create package meta-data objects
		thePtnetLoLAPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetLoLAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetLoLAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetLoLAPackage.eNS_URI, thePtnetLoLAPackage);
		return thePtnetLoLAPackage;
	}


	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see ptnetLoLA.Place
	 * @generated
	 */
	public EClass getPlace()
	{
		return placeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_Token()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Marking</em>'.
	 * @see ptnetLoLA.Place#getFinalMarking()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_FinalMarking()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PtNet <em>Pt Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pt Net</em>'.
	 * @see ptnetLoLA.PtNet
	 * @generated
	 */
	public EClass getPtNet()
	{
		return ptNetEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.PtNet#getPlaces()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Places()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ptnetLoLA.PtNet#getTransitions()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Transitions()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see ptnetLoLA.PtNet#getInitialMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_InitialMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.PtNet#getAnnotation()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Annotation()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see ptnetLoLA.PtNet#getArcs()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Arcs()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Marking</em>'.
	 * @see ptnetLoLA.PtNet#getFinalMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_FinalMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ptnetLoLA.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ptnetLoLA.Node
	 * @generated
	 */
	public EClass getNode()
	{
		return nodeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ptnetLoLA.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Name()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.Node#getAnnotation()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Annotation()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see ptnetLoLA.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Incoming()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see ptnetLoLA.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Outgoing()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ptnetLoLA.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Type()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see ptnetLoLA.Marking
	 * @generated
	 */
	public EClass getMarking()
	{
		return markingEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.Marking#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.Marking#getPlaces()
	 * @see #getMarking()
	 * @generated
	 */
	public EReference getMarking_Places()
	{
		return (EReference)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Reference</em>'.
	 * @see ptnetLoLA.PlaceReference
	 * @generated
	 */
	public EClass getPlaceReference()
	{
		return placeReferenceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.PlaceReference#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ptnetLoLA.PlaceReference#getPlace()
	 * @see #getPlaceReference()
	 * @generated
	 */
	public EReference getPlaceReference_Place()
	{
		return (EReference)placeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Marked Place</em>'.
	 * @see ptnetLoLA.RefMarkedPlace
	 * @generated
	 */
	public EClass getRefMarkedPlace()
	{
		return refMarkedPlaceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.RefMarkedPlace#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.RefMarkedPlace#getToken()
	 * @see #getRefMarkedPlace()
	 * @generated
	 */
	public EAttribute getRefMarkedPlace_Token()
	{
		return (EAttribute)refMarkedPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ptnetLoLA.Annotation
	 * @generated
	 */
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ptnetLoLA.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	public EAttribute getAnnotation_Text()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see ptnetLoLA.Arc
	 * @generated
	 */
	public EClass getArc()
	{
		return arcEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ptnetLoLA.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Source()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ptnetLoLA.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Target()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ptnetLoLA.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	public EAttribute getArc_Weight()
	{
		return (EAttribute)arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place</em>'.
	 * @see ptnetLoLA.ArcToPlace
	 * @generated
	 */
	public EClass getArcToPlace()
	{
		return arcToPlaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition</em>'.
	 * @see ptnetLoLA.ArcToTransition
	 * @generated
	 */
	public EClass getArcToTransition()
	{
		return arcToTransitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Ext</em>'.
	 * @see ptnetLoLA.TransitionExt
	 * @generated
	 */
	public EClass getTransitionExt()
	{
		return transitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.TransitionExt#getProbability()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Probability()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMinTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MinTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see ptnetLoLA.TransitionExt#getCost()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Cost()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMaxTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MaxTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.TransitionExt#getConfidentiality()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Confidentiality()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Ext</em>'.
	 * @see ptnetLoLA.PlaceExt
	 * @generated
	 */
	public EClass getPlaceExt()
	{
		return placeExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.PlaceExt#getProbability()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_Probability()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see ptnetLoLA.PlaceExt#isIsStart()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_IsStart()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place Ext</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @generated
	 */
	public EClass getArcToPlaceExt()
	{
		return arcToPlaceExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToPlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt#getProbability()
	 * @see #getArcToPlaceExt()
	 * @generated
	 */
	public EAttribute getArcToPlaceExt_Probability()
	{
		return (EAttribute)arcToPlaceExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition Ext</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @generated
	 */
	public EClass getArcToTransitionExt()
	{
		return arcToTransitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToTransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt#getProbability()
	 * @see #getArcToTransitionExt()
	 * @generated
	 */
	public EAttribute getArcToTransitionExt_Probability()
	{
		return (EAttribute)arcToTransitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see ptnetLoLA.NodeType
	 * @generated
	 */
	public EEnum getNodeType()
	{
		return nodeTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.Confidentiality
	 * @generated
	 */
	public EEnum getConfidentiality()
	{
		return confidentialityEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PtnetLoLAFactory getPtnetLoLAFactory()
	{
		return (PtnetLoLAFactory)getEFactoryInstance();
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
		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__TOKEN);
		createEAttribute(placeEClass, PLACE__FINAL_MARKING);

		ptNetEClass = createEClass(PT_NET);
		createEReference(ptNetEClass, PT_NET__PLACES);
		createEReference(ptNetEClass, PT_NET__TRANSITIONS);
		createEReference(ptNetEClass, PT_NET__INITIAL_MARKING);
		createEReference(ptNetEClass, PT_NET__ANNOTATION);
		createEReference(ptNetEClass, PT_NET__ARCS);
		createEReference(ptNetEClass, PT_NET__FINAL_MARKING);

		transitionEClass = createEClass(TRANSITION);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__ANNOTATION);
		createEReference(nodeEClass, NODE__INCOMING);
		createEReference(nodeEClass, NODE__OUTGOING);
		createEAttribute(nodeEClass, NODE__TYPE);

		markingEClass = createEClass(MARKING);
		createEReference(markingEClass, MARKING__PLACES);

		placeReferenceEClass = createEClass(PLACE_REFERENCE);
		createEReference(placeReferenceEClass, PLACE_REFERENCE__PLACE);

		refMarkedPlaceEClass = createEClass(REF_MARKED_PLACE);
		createEAttribute(refMarkedPlaceEClass, REF_MARKED_PLACE__TOKEN);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__TEXT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);
		createEAttribute(arcEClass, ARC__WEIGHT);

		arcToPlaceEClass = createEClass(ARC_TO_PLACE);

		arcToTransitionEClass = createEClass(ARC_TO_TRANSITION);

		transitionExtEClass = createEClass(TRANSITION_EXT);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__PROBABILITY);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MIN_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__COST);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MAX_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__CONFIDENTIALITY);

		placeExtEClass = createEClass(PLACE_EXT);
		createEAttribute(placeExtEClass, PLACE_EXT__PROBABILITY);
		createEAttribute(placeExtEClass, PLACE_EXT__IS_START);

		arcToPlaceExtEClass = createEClass(ARC_TO_PLACE_EXT);
		createEAttribute(arcToPlaceExtEClass, ARC_TO_PLACE_EXT__PROBABILITY);

		arcToTransitionExtEClass = createEClass(ARC_TO_TRANSITION_EXT);
		createEAttribute(arcToTransitionExtEClass, ARC_TO_TRANSITION_EXT__PROBABILITY);

		// Create enums
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		confidentialityEEnum = createEEnum(CONFIDENTIALITY);
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
		placeEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getNode());
		refMarkedPlaceEClass.getESuperTypes().add(this.getPlaceReference());
		arcToPlaceEClass.getESuperTypes().add(this.getArc());
		arcToTransitionEClass.getESuperTypes().add(this.getArc());
		transitionExtEClass.getESuperTypes().add(this.getTransition());
		placeExtEClass.getESuperTypes().add(this.getPlace());
		arcToPlaceExtEClass.getESuperTypes().add(this.getArcToPlace());
		arcToTransitionExtEClass.getESuperTypes().add(this.getArcToTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Token(), ecorePackage.getEInt(), "token", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_FinalMarking(), ecorePackage.getEInt(), "finalMarking", "0", 1, 1, Place.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ptNetEClass, PtNet.class, "PtNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPtNet_Places(), this.getPlace(), null, "places", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_InitialMarking(), this.getMarking(), null, "initialMarking", null, 1, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Arcs(), this.getArc(), null, "arcs", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_FinalMarking(), this.getMarking(), null, "finalMarking", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Incoming(), this.getArc(), this.getArc_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Outgoing(), this.getArc(), this.getArc_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type(), this.getNodeType(), "type", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarking_Places(), this.getRefMarkedPlace(), null, "places", null, 0, -1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeReferenceEClass, PlaceReference.class, "PlaceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceReference_Place(), this.getPlace(), null, "place", null, 1, 1, PlaceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refMarkedPlaceEClass, RefMarkedPlace.class, "RefMarkedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefMarkedPlace_Token(), ecorePackage.getEInt(), "token", "1", 1, 1, RefMarkedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_Weight(), ecorePackage.getEInt(), "weight", "1", 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceEClass, ArcToPlace.class, "ArcToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcToTransitionEClass, ArcToTransition.class, "ArcToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionExtEClass, TransitionExt.class, "TransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MinTime(), ecorePackage.getEInt(), "minTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Cost(), ecorePackage.getEDouble(), "cost", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MaxTime(), ecorePackage.getEInt(), "maxTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Confidentiality(), this.getConfidentiality(), "confidentiality", null, 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeExtEClass, PlaceExt.class, "PlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceExt_IsStart(), ecorePackage.getEBoolean(), "isStart", "False", 1, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceExtEClass, ArcToPlaceExt.class, "ArcToPlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToPlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToTransitionExtEClass, ArcToTransitionExt.class, "ArcToTransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToTransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.INTERNAL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.OUTPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INOUT);

		initEEnum(confidentialityEEnum, Confidentiality.class, "Confidentiality");
		addEEnumLiteral(confidentialityEEnum, Confidentiality.UNKNOWN);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.LOW);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.HIGH);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Place
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
		 * @generated
		 */
		public static final EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__FINAL_MARKING = eINSTANCE.getPlace_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PtNet
		 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
		 * @generated
		 */
		public static final EClass PT_NET = eINSTANCE.getPtNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__PLACES = eINSTANCE.getPtNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__TRANSITIONS = eINSTANCE.getPtNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__INITIAL_MARKING = eINSTANCE.getPtNet_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ANNOTATION = eINSTANCE.getPtNet_Annotation();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ARCS = eINSTANCE.getPtNet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__FINAL_MARKING = eINSTANCE.getPtNet_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Transition
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Node
		 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
		 * @generated
		 */
		public static final EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__ANNOTATION = eINSTANCE.getNode_Annotation();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Marking
		 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
		 * @generated
		 */
		public static final EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MARKING__PLACES = eINSTANCE.getMarking_Places();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceReference
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
		 * @generated
		 */
		public static final EClass PLACE_REFERENCE = eINSTANCE.getPlaceReference();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLACE_REFERENCE__PLACE = eINSTANCE.getPlaceReference_Place();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.RefMarkedPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
		 * @generated
		 */
		public static final EClass REF_MARKED_PLACE = eINSTANCE.getRefMarkedPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REF_MARKED_PLACE__TOKEN = eINSTANCE.getRefMarkedPlace_Token();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Annotation
		 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
		 * @generated
		 */
		public static final EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Arc
		 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
		 * @generated
		 */
		public static final EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE = eINSTANCE.getArcToPlace();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransition
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION = eINSTANCE.getArcToTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.TransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
		 * @generated
		 */
		public static final EClass TRANSITION_EXT = eINSTANCE.getTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__PROBABILITY = eINSTANCE.getTransitionExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MIN_TIME = eINSTANCE.getTransitionExt_MinTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__COST = eINSTANCE.getTransitionExt_Cost();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MAX_TIME = eINSTANCE.getTransitionExt_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__CONFIDENTIALITY = eINSTANCE.getTransitionExt_Confidentiality();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
		 * @generated
		 */
		public static final EClass PLACE_EXT = eINSTANCE.getPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__PROBABILITY = eINSTANCE.getPlaceExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__IS_START = eINSTANCE.getPlaceExt_IsStart();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE_EXT = eINSTANCE.getArcToPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_PLACE_EXT__PROBABILITY = eINSTANCE.getArcToPlaceExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION_EXT = eINSTANCE.getArcToTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_TRANSITION_EXT__PROBABILITY = eINSTANCE.getArcToTransitionExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.NodeType
		 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
		 * @generated
		 */
		public static final EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Confidentiality
		 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
		 * @generated
		 */
		public static final EEnum CONFIDENTIALITY = eINSTANCE.getConfidentiality();

	}

} //PtnetLoLAPackage
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ptnetLoLA.PtnetLoLAFactory
 * @model kind="package"
 * @generated
 */
public class PtnetLoLAPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ptnetLoLA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.informatik.hu-berlin.de/top/tools/editors/petrinets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ptnetLoLA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PtnetLoLAPackage eINSTANCE = ptnetLoLA.PtnetLoLAPackage.init();

	/**
	 * The meta object id for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Node
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
	 * @generated
	 */
	public static final int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Place
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
	 * @generated
	 */
	public static final int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TOKEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__FINAL_MARKING = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PtNet
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
	 * @generated
	 */
	public static final int PT_NET = 1;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__INITIAL_MARKING = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ARCS = 4;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__FINAL_MARKING = 5;

	/**
	 * The number of structural features of the '<em>Pt Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Transition
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TYPE = NODE__TYPE;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Marking
	 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
	 * @generated
	 */
	public static final int MARKING = 4;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING__PLACES = 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceReference
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
	 * @generated
	 */
	public static final int PLACE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Place Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.RefMarkedPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
	 * @generated
	 */
	public static final int REF_MARKED_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__PLACE = PLACE_REFERENCE__PLACE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__TOKEN = PLACE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Marked Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE_FEATURE_COUNT = PLACE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Annotation
	 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
	 * @generated
	 */
	public static final int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Arc
	 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
	 * @generated
	 */
	public static final int ARC = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
	 * @generated
	 */
	public static final int ARC_TO_PLACE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransition
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.TransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
	 * @generated
	 */
	public static final int TRANSITION_EXT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__ANNOTATION = TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__INCOMING = TRANSITION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__OUTGOING = TRANSITION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__TYPE = TRANSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MIN_TIME = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__COST = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MAX_TIME = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__CONFIDENTIALITY = TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
	 * @generated
	 */
	public static final int PLACE_EXT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__ANNOTATION = PLACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__INCOMING = PLACE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__OUTGOING = PLACE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TYPE = PLACE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TOKEN = PLACE__TOKEN;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__FINAL_MARKING = PLACE__FINAL_MARKING;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__PROBABILITY = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__IS_START = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT_FEATURE_COUNT = PLACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
	 * @generated
	 */
	public static final int ARC_TO_PLACE_EXT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__SOURCE = ARC_TO_PLACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__TARGET = ARC_TO_PLACE__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__WEIGHT = ARC_TO_PLACE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__PROBABILITY = ARC_TO_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT_FEATURE_COUNT = ARC_TO_PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION_EXT = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__SOURCE = ARC_TO_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__TARGET = ARC_TO_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__WEIGHT = ARC_TO_TRANSITION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__PROBABILITY = ARC_TO_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT_FEATURE_COUNT = ARC_TO_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.NodeType
	 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
	 * @generated
	 */
	public static final int NODE_TYPE = 15;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Confidentiality
	 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
	 * @generated
	 */
	public static final int CONFIDENTIALITY = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetEClass = null;

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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refMarkedPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityEEnum = null;

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
	 * @see ptnetLoLA.PtnetLoLAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetLoLAPackage()
	{
		super(eNS_URI, PtnetLoLAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PtnetLoLAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetLoLAPackage init()
	{
		if (isInited) return (PtnetLoLAPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetLoLAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPtnetLoLAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PtnetLoLAPackage thePtnetLoLAPackage = registeredPtnetLoLAPackage instanceof PtnetLoLAPackage ? (PtnetLoLAPackage)registeredPtnetLoLAPackage : new PtnetLoLAPackage();

		isInited = true;

		// Create package meta-data objects
		thePtnetLoLAPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetLoLAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetLoLAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetLoLAPackage.eNS_URI, thePtnetLoLAPackage);
		return thePtnetLoLAPackage;
	}


	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see ptnetLoLA.Place
	 * @generated
	 */
	public EClass getPlace()
	{
		return placeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_Token()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Marking</em>'.
	 * @see ptnetLoLA.Place#getFinalMarking()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_FinalMarking()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PtNet <em>Pt Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pt Net</em>'.
	 * @see ptnetLoLA.PtNet
	 * @generated
	 */
	public EClass getPtNet()
	{
		return ptNetEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.PtNet#getPlaces()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Places()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ptnetLoLA.PtNet#getTransitions()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Transitions()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see ptnetLoLA.PtNet#getInitialMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_InitialMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.PtNet#getAnnotation()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Annotation()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see ptnetLoLA.PtNet#getArcs()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Arcs()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Marking</em>'.
	 * @see ptnetLoLA.PtNet#getFinalMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_FinalMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ptnetLoLA.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ptnetLoLA.Node
	 * @generated
	 */
	public EClass getNode()
	{
		return nodeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ptnetLoLA.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Name()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.Node#getAnnotation()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Annotation()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see ptnetLoLA.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Incoming()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see ptnetLoLA.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Outgoing()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ptnetLoLA.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Type()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see ptnetLoLA.Marking
	 * @generated
	 */
	public EClass getMarking()
	{
		return markingEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.Marking#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.Marking#getPlaces()
	 * @see #getMarking()
	 * @generated
	 */
	public EReference getMarking_Places()
	{
		return (EReference)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Reference</em>'.
	 * @see ptnetLoLA.PlaceReference
	 * @generated
	 */
	public EClass getPlaceReference()
	{
		return placeReferenceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.PlaceReference#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ptnetLoLA.PlaceReference#getPlace()
	 * @see #getPlaceReference()
	 * @generated
	 */
	public EReference getPlaceReference_Place()
	{
		return (EReference)placeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Marked Place</em>'.
	 * @see ptnetLoLA.RefMarkedPlace
	 * @generated
	 */
	public EClass getRefMarkedPlace()
	{
		return refMarkedPlaceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.RefMarkedPlace#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.RefMarkedPlace#getToken()
	 * @see #getRefMarkedPlace()
	 * @generated
	 */
	public EAttribute getRefMarkedPlace_Token()
	{
		return (EAttribute)refMarkedPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ptnetLoLA.Annotation
	 * @generated
	 */
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ptnetLoLA.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	public EAttribute getAnnotation_Text()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see ptnetLoLA.Arc
	 * @generated
	 */
	public EClass getArc()
	{
		return arcEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ptnetLoLA.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Source()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ptnetLoLA.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Target()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ptnetLoLA.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	public EAttribute getArc_Weight()
	{
		return (EAttribute)arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place</em>'.
	 * @see ptnetLoLA.ArcToPlace
	 * @generated
	 */
	public EClass getArcToPlace()
	{
		return arcToPlaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition</em>'.
	 * @see ptnetLoLA.ArcToTransition
	 * @generated
	 */
	public EClass getArcToTransition()
	{
		return arcToTransitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Ext</em>'.
	 * @see ptnetLoLA.TransitionExt
	 * @generated
	 */
	public EClass getTransitionExt()
	{
		return transitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.TransitionExt#getProbability()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Probability()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMinTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MinTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see ptnetLoLA.TransitionExt#getCost()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Cost()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMaxTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MaxTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.TransitionExt#getConfidentiality()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Confidentiality()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Ext</em>'.
	 * @see ptnetLoLA.PlaceExt
	 * @generated
	 */
	public EClass getPlaceExt()
	{
		return placeExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.PlaceExt#getProbability()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_Probability()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see ptnetLoLA.PlaceExt#isIsStart()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_IsStart()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place Ext</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @generated
	 */
	public EClass getArcToPlaceExt()
	{
		return arcToPlaceExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToPlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt#getProbability()
	 * @see #getArcToPlaceExt()
	 * @generated
	 */
	public EAttribute getArcToPlaceExt_Probability()
	{
		return (EAttribute)arcToPlaceExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition Ext</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @generated
	 */
	public EClass getArcToTransitionExt()
	{
		return arcToTransitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToTransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt#getProbability()
	 * @see #getArcToTransitionExt()
	 * @generated
	 */
	public EAttribute getArcToTransitionExt_Probability()
	{
		return (EAttribute)arcToTransitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see ptnetLoLA.NodeType
	 * @generated
	 */
	public EEnum getNodeType()
	{
		return nodeTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.Confidentiality
	 * @generated
	 */
	public EEnum getConfidentiality()
	{
		return confidentialityEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PtnetLoLAFactory getPtnetLoLAFactory()
	{
		return (PtnetLoLAFactory)getEFactoryInstance();
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
		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__TOKEN);
		createEAttribute(placeEClass, PLACE__FINAL_MARKING);

		ptNetEClass = createEClass(PT_NET);
		createEReference(ptNetEClass, PT_NET__PLACES);
		createEReference(ptNetEClass, PT_NET__TRANSITIONS);
		createEReference(ptNetEClass, PT_NET__INITIAL_MARKING);
		createEReference(ptNetEClass, PT_NET__ANNOTATION);
		createEReference(ptNetEClass, PT_NET__ARCS);
		createEReference(ptNetEClass, PT_NET__FINAL_MARKING);

		transitionEClass = createEClass(TRANSITION);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__ANNOTATION);
		createEReference(nodeEClass, NODE__INCOMING);
		createEReference(nodeEClass, NODE__OUTGOING);
		createEAttribute(nodeEClass, NODE__TYPE);

		markingEClass = createEClass(MARKING);
		createEReference(markingEClass, MARKING__PLACES);

		placeReferenceEClass = createEClass(PLACE_REFERENCE);
		createEReference(placeReferenceEClass, PLACE_REFERENCE__PLACE);

		refMarkedPlaceEClass = createEClass(REF_MARKED_PLACE);
		createEAttribute(refMarkedPlaceEClass, REF_MARKED_PLACE__TOKEN);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__TEXT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);
		createEAttribute(arcEClass, ARC__WEIGHT);

		arcToPlaceEClass = createEClass(ARC_TO_PLACE);

		arcToTransitionEClass = createEClass(ARC_TO_TRANSITION);

		transitionExtEClass = createEClass(TRANSITION_EXT);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__PROBABILITY);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MIN_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__COST);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MAX_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__CONFIDENTIALITY);

		placeExtEClass = createEClass(PLACE_EXT);
		createEAttribute(placeExtEClass, PLACE_EXT__PROBABILITY);
		createEAttribute(placeExtEClass, PLACE_EXT__IS_START);

		arcToPlaceExtEClass = createEClass(ARC_TO_PLACE_EXT);
		createEAttribute(arcToPlaceExtEClass, ARC_TO_PLACE_EXT__PROBABILITY);

		arcToTransitionExtEClass = createEClass(ARC_TO_TRANSITION_EXT);
		createEAttribute(arcToTransitionExtEClass, ARC_TO_TRANSITION_EXT__PROBABILITY);

		// Create enums
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		confidentialityEEnum = createEEnum(CONFIDENTIALITY);
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
		placeEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getNode());
		refMarkedPlaceEClass.getESuperTypes().add(this.getPlaceReference());
		arcToPlaceEClass.getESuperTypes().add(this.getArc());
		arcToTransitionEClass.getESuperTypes().add(this.getArc());
		transitionExtEClass.getESuperTypes().add(this.getTransition());
		placeExtEClass.getESuperTypes().add(this.getPlace());
		arcToPlaceExtEClass.getESuperTypes().add(this.getArcToPlace());
		arcToTransitionExtEClass.getESuperTypes().add(this.getArcToTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Token(), ecorePackage.getEInt(), "token", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_FinalMarking(), ecorePackage.getEInt(), "finalMarking", "0", 1, 1, Place.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ptNetEClass, PtNet.class, "PtNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPtNet_Places(), this.getPlace(), null, "places", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_InitialMarking(), this.getMarking(), null, "initialMarking", null, 1, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Arcs(), this.getArc(), null, "arcs", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_FinalMarking(), this.getMarking(), null, "finalMarking", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Incoming(), this.getArc(), this.getArc_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Outgoing(), this.getArc(), this.getArc_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type(), this.getNodeType(), "type", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarking_Places(), this.getRefMarkedPlace(), null, "places", null, 0, -1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeReferenceEClass, PlaceReference.class, "PlaceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceReference_Place(), this.getPlace(), null, "place", null, 1, 1, PlaceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refMarkedPlaceEClass, RefMarkedPlace.class, "RefMarkedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefMarkedPlace_Token(), ecorePackage.getEInt(), "token", "1", 1, 1, RefMarkedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_Weight(), ecorePackage.getEInt(), "weight", "1", 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceEClass, ArcToPlace.class, "ArcToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcToTransitionEClass, ArcToTransition.class, "ArcToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionExtEClass, TransitionExt.class, "TransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MinTime(), ecorePackage.getEInt(), "minTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Cost(), ecorePackage.getEDouble(), "cost", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MaxTime(), ecorePackage.getEInt(), "maxTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Confidentiality(), this.getConfidentiality(), "confidentiality", null, 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeExtEClass, PlaceExt.class, "PlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceExt_IsStart(), ecorePackage.getEBoolean(), "isStart", "False", 1, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceExtEClass, ArcToPlaceExt.class, "ArcToPlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToPlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToTransitionExtEClass, ArcToTransitionExt.class, "ArcToTransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToTransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.INTERNAL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.OUTPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INOUT);

		initEEnum(confidentialityEEnum, Confidentiality.class, "Confidentiality");
		addEEnumLiteral(confidentialityEEnum, Confidentiality.UNKNOWN);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.LOW);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.HIGH);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Place
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
		 * @generated
		 */
		public static final EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__FINAL_MARKING = eINSTANCE.getPlace_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PtNet
		 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
		 * @generated
		 */
		public static final EClass PT_NET = eINSTANCE.getPtNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__PLACES = eINSTANCE.getPtNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__TRANSITIONS = eINSTANCE.getPtNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__INITIAL_MARKING = eINSTANCE.getPtNet_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ANNOTATION = eINSTANCE.getPtNet_Annotation();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ARCS = eINSTANCE.getPtNet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__FINAL_MARKING = eINSTANCE.getPtNet_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Transition
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Node
		 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
		 * @generated
		 */
		public static final EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__ANNOTATION = eINSTANCE.getNode_Annotation();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Marking
		 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
		 * @generated
		 */
		public static final EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MARKING__PLACES = eINSTANCE.getMarking_Places();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceReference
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
		 * @generated
		 */
		public static final EClass PLACE_REFERENCE = eINSTANCE.getPlaceReference();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLACE_REFERENCE__PLACE = eINSTANCE.getPlaceReference_Place();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.RefMarkedPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
		 * @generated
		 */
		public static final EClass REF_MARKED_PLACE = eINSTANCE.getRefMarkedPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REF_MARKED_PLACE__TOKEN = eINSTANCE.getRefMarkedPlace_Token();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Annotation
		 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
		 * @generated
		 */
		public static final EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Arc
		 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
		 * @generated
		 */
		public static final EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE = eINSTANCE.getArcToPlace();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransition
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION = eINSTANCE.getArcToTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.TransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
		 * @generated
		 */
		public static final EClass TRANSITION_EXT = eINSTANCE.getTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__PROBABILITY = eINSTANCE.getTransitionExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MIN_TIME = eINSTANCE.getTransitionExt_MinTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__COST = eINSTANCE.getTransitionExt_Cost();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MAX_TIME = eINSTANCE.getTransitionExt_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__CONFIDENTIALITY = eINSTANCE.getTransitionExt_Confidentiality();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
		 * @generated
		 */
		public static final EClass PLACE_EXT = eINSTANCE.getPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__PROBABILITY = eINSTANCE.getPlaceExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__IS_START = eINSTANCE.getPlaceExt_IsStart();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE_EXT = eINSTANCE.getArcToPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_PLACE_EXT__PROBABILITY = eINSTANCE.getArcToPlaceExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION_EXT = eINSTANCE.getArcToTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_TRANSITION_EXT__PROBABILITY = eINSTANCE.getArcToTransitionExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.NodeType
		 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
		 * @generated
		 */
		public static final EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Confidentiality
		 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
		 * @generated
		 */
		public static final EEnum CONFIDENTIALITY = eINSTANCE.getConfidentiality();

	}

} //PtnetLoLAPackage
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ptnetLoLA.PtnetLoLAFactory
 * @model kind="package"
 * @generated
 */
public class PtnetLoLAPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ptnetLoLA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.informatik.hu-berlin.de/top/tools/editors/petrinets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ptnetLoLA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PtnetLoLAPackage eINSTANCE = ptnetLoLA.PtnetLoLAPackage.init();

	/**
	 * The meta object id for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Node
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
	 * @generated
	 */
	public static final int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Place
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
	 * @generated
	 */
	public static final int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TOKEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__FINAL_MARKING = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PtNet
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
	 * @generated
	 */
	public static final int PT_NET = 1;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__INITIAL_MARKING = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ARCS = 4;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__FINAL_MARKING = 5;

	/**
	 * The number of structural features of the '<em>Pt Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Transition
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TYPE = NODE__TYPE;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Marking
	 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
	 * @generated
	 */
	public static final int MARKING = 4;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING__PLACES = 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceReference
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
	 * @generated
	 */
	public static final int PLACE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Place Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.RefMarkedPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
	 * @generated
	 */
	public static final int REF_MARKED_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__PLACE = PLACE_REFERENCE__PLACE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__TOKEN = PLACE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Marked Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE_FEATURE_COUNT = PLACE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Annotation
	 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
	 * @generated
	 */
	public static final int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Arc
	 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
	 * @generated
	 */
	public static final int ARC = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
	 * @generated
	 */
	public static final int ARC_TO_PLACE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransition
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.TransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
	 * @generated
	 */
	public static final int TRANSITION_EXT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__ANNOTATION = TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__INCOMING = TRANSITION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__OUTGOING = TRANSITION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__TYPE = TRANSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MIN_TIME = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__COST = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MAX_TIME = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__CONFIDENTIALITY = TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
	 * @generated
	 */
	public static final int PLACE_EXT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__ANNOTATION = PLACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__INCOMING = PLACE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__OUTGOING = PLACE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TYPE = PLACE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TOKEN = PLACE__TOKEN;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__FINAL_MARKING = PLACE__FINAL_MARKING;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__PROBABILITY = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__IS_START = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT_FEATURE_COUNT = PLACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
	 * @generated
	 */
	public static final int ARC_TO_PLACE_EXT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__SOURCE = ARC_TO_PLACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__TARGET = ARC_TO_PLACE__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__WEIGHT = ARC_TO_PLACE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__PROBABILITY = ARC_TO_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT_FEATURE_COUNT = ARC_TO_PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION_EXT = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__SOURCE = ARC_TO_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__TARGET = ARC_TO_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__WEIGHT = ARC_TO_TRANSITION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__PROBABILITY = ARC_TO_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT_FEATURE_COUNT = ARC_TO_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.NodeType
	 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
	 * @generated
	 */
	public static final int NODE_TYPE = 15;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Confidentiality
	 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
	 * @generated
	 */
	public static final int CONFIDENTIALITY = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetEClass = null;

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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refMarkedPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityEEnum = null;

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
	 * @see ptnetLoLA.PtnetLoLAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetLoLAPackage()
	{
		super(eNS_URI, PtnetLoLAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PtnetLoLAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetLoLAPackage init()
	{
		if (isInited) return (PtnetLoLAPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetLoLAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPtnetLoLAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PtnetLoLAPackage thePtnetLoLAPackage = registeredPtnetLoLAPackage instanceof PtnetLoLAPackage ? (PtnetLoLAPackage)registeredPtnetLoLAPackage : new PtnetLoLAPackage();

		isInited = true;

		// Create package meta-data objects
		thePtnetLoLAPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetLoLAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetLoLAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetLoLAPackage.eNS_URI, thePtnetLoLAPackage);
		return thePtnetLoLAPackage;
	}


	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see ptnetLoLA.Place
	 * @generated
	 */
	public EClass getPlace()
	{
		return placeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_Token()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Marking</em>'.
	 * @see ptnetLoLA.Place#getFinalMarking()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_FinalMarking()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PtNet <em>Pt Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pt Net</em>'.
	 * @see ptnetLoLA.PtNet
	 * @generated
	 */
	public EClass getPtNet()
	{
		return ptNetEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.PtNet#getPlaces()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Places()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ptnetLoLA.PtNet#getTransitions()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Transitions()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see ptnetLoLA.PtNet#getInitialMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_InitialMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.PtNet#getAnnotation()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Annotation()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see ptnetLoLA.PtNet#getArcs()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Arcs()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Marking</em>'.
	 * @see ptnetLoLA.PtNet#getFinalMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_FinalMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ptnetLoLA.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ptnetLoLA.Node
	 * @generated
	 */
	public EClass getNode()
	{
		return nodeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ptnetLoLA.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Name()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.Node#getAnnotation()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Annotation()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see ptnetLoLA.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Incoming()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see ptnetLoLA.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Outgoing()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ptnetLoLA.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Type()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see ptnetLoLA.Marking
	 * @generated
	 */
	public EClass getMarking()
	{
		return markingEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.Marking#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.Marking#getPlaces()
	 * @see #getMarking()
	 * @generated
	 */
	public EReference getMarking_Places()
	{
		return (EReference)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Reference</em>'.
	 * @see ptnetLoLA.PlaceReference
	 * @generated
	 */
	public EClass getPlaceReference()
	{
		return placeReferenceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.PlaceReference#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ptnetLoLA.PlaceReference#getPlace()
	 * @see #getPlaceReference()
	 * @generated
	 */
	public EReference getPlaceReference_Place()
	{
		return (EReference)placeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Marked Place</em>'.
	 * @see ptnetLoLA.RefMarkedPlace
	 * @generated
	 */
	public EClass getRefMarkedPlace()
	{
		return refMarkedPlaceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.RefMarkedPlace#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.RefMarkedPlace#getToken()
	 * @see #getRefMarkedPlace()
	 * @generated
	 */
	public EAttribute getRefMarkedPlace_Token()
	{
		return (EAttribute)refMarkedPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ptnetLoLA.Annotation
	 * @generated
	 */
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ptnetLoLA.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	public EAttribute getAnnotation_Text()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see ptnetLoLA.Arc
	 * @generated
	 */
	public EClass getArc()
	{
		return arcEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ptnetLoLA.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Source()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ptnetLoLA.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Target()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ptnetLoLA.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	public EAttribute getArc_Weight()
	{
		return (EAttribute)arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place</em>'.
	 * @see ptnetLoLA.ArcToPlace
	 * @generated
	 */
	public EClass getArcToPlace()
	{
		return arcToPlaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition</em>'.
	 * @see ptnetLoLA.ArcToTransition
	 * @generated
	 */
	public EClass getArcToTransition()
	{
		return arcToTransitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Ext</em>'.
	 * @see ptnetLoLA.TransitionExt
	 * @generated
	 */
	public EClass getTransitionExt()
	{
		return transitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.TransitionExt#getProbability()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Probability()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMinTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MinTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see ptnetLoLA.TransitionExt#getCost()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Cost()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMaxTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MaxTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.TransitionExt#getConfidentiality()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Confidentiality()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Ext</em>'.
	 * @see ptnetLoLA.PlaceExt
	 * @generated
	 */
	public EClass getPlaceExt()
	{
		return placeExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.PlaceExt#getProbability()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_Probability()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see ptnetLoLA.PlaceExt#isIsStart()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_IsStart()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place Ext</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @generated
	 */
	public EClass getArcToPlaceExt()
	{
		return arcToPlaceExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToPlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt#getProbability()
	 * @see #getArcToPlaceExt()
	 * @generated
	 */
	public EAttribute getArcToPlaceExt_Probability()
	{
		return (EAttribute)arcToPlaceExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition Ext</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @generated
	 */
	public EClass getArcToTransitionExt()
	{
		return arcToTransitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToTransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt#getProbability()
	 * @see #getArcToTransitionExt()
	 * @generated
	 */
	public EAttribute getArcToTransitionExt_Probability()
	{
		return (EAttribute)arcToTransitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see ptnetLoLA.NodeType
	 * @generated
	 */
	public EEnum getNodeType()
	{
		return nodeTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.Confidentiality
	 * @generated
	 */
	public EEnum getConfidentiality()
	{
		return confidentialityEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PtnetLoLAFactory getPtnetLoLAFactory()
	{
		return (PtnetLoLAFactory)getEFactoryInstance();
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
		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__TOKEN);
		createEAttribute(placeEClass, PLACE__FINAL_MARKING);

		ptNetEClass = createEClass(PT_NET);
		createEReference(ptNetEClass, PT_NET__PLACES);
		createEReference(ptNetEClass, PT_NET__TRANSITIONS);
		createEReference(ptNetEClass, PT_NET__INITIAL_MARKING);
		createEReference(ptNetEClass, PT_NET__ANNOTATION);
		createEReference(ptNetEClass, PT_NET__ARCS);
		createEReference(ptNetEClass, PT_NET__FINAL_MARKING);

		transitionEClass = createEClass(TRANSITION);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__ANNOTATION);
		createEReference(nodeEClass, NODE__INCOMING);
		createEReference(nodeEClass, NODE__OUTGOING);
		createEAttribute(nodeEClass, NODE__TYPE);

		markingEClass = createEClass(MARKING);
		createEReference(markingEClass, MARKING__PLACES);

		placeReferenceEClass = createEClass(PLACE_REFERENCE);
		createEReference(placeReferenceEClass, PLACE_REFERENCE__PLACE);

		refMarkedPlaceEClass = createEClass(REF_MARKED_PLACE);
		createEAttribute(refMarkedPlaceEClass, REF_MARKED_PLACE__TOKEN);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__TEXT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);
		createEAttribute(arcEClass, ARC__WEIGHT);

		arcToPlaceEClass = createEClass(ARC_TO_PLACE);

		arcToTransitionEClass = createEClass(ARC_TO_TRANSITION);

		transitionExtEClass = createEClass(TRANSITION_EXT);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__PROBABILITY);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MIN_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__COST);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MAX_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__CONFIDENTIALITY);

		placeExtEClass = createEClass(PLACE_EXT);
		createEAttribute(placeExtEClass, PLACE_EXT__PROBABILITY);
		createEAttribute(placeExtEClass, PLACE_EXT__IS_START);

		arcToPlaceExtEClass = createEClass(ARC_TO_PLACE_EXT);
		createEAttribute(arcToPlaceExtEClass, ARC_TO_PLACE_EXT__PROBABILITY);

		arcToTransitionExtEClass = createEClass(ARC_TO_TRANSITION_EXT);
		createEAttribute(arcToTransitionExtEClass, ARC_TO_TRANSITION_EXT__PROBABILITY);

		// Create enums
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		confidentialityEEnum = createEEnum(CONFIDENTIALITY);
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
		placeEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getNode());
		refMarkedPlaceEClass.getESuperTypes().add(this.getPlaceReference());
		arcToPlaceEClass.getESuperTypes().add(this.getArc());
		arcToTransitionEClass.getESuperTypes().add(this.getArc());
		transitionExtEClass.getESuperTypes().add(this.getTransition());
		placeExtEClass.getESuperTypes().add(this.getPlace());
		arcToPlaceExtEClass.getESuperTypes().add(this.getArcToPlace());
		arcToTransitionExtEClass.getESuperTypes().add(this.getArcToTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Token(), ecorePackage.getEInt(), "token", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_FinalMarking(), ecorePackage.getEInt(), "finalMarking", "0", 1, 1, Place.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ptNetEClass, PtNet.class, "PtNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPtNet_Places(), this.getPlace(), null, "places", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_InitialMarking(), this.getMarking(), null, "initialMarking", null, 1, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Arcs(), this.getArc(), null, "arcs", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_FinalMarking(), this.getMarking(), null, "finalMarking", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Incoming(), this.getArc(), this.getArc_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Outgoing(), this.getArc(), this.getArc_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type(), this.getNodeType(), "type", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarking_Places(), this.getRefMarkedPlace(), null, "places", null, 0, -1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeReferenceEClass, PlaceReference.class, "PlaceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceReference_Place(), this.getPlace(), null, "place", null, 1, 1, PlaceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refMarkedPlaceEClass, RefMarkedPlace.class, "RefMarkedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefMarkedPlace_Token(), ecorePackage.getEInt(), "token", "1", 1, 1, RefMarkedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_Weight(), ecorePackage.getEInt(), "weight", "1", 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceEClass, ArcToPlace.class, "ArcToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcToTransitionEClass, ArcToTransition.class, "ArcToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionExtEClass, TransitionExt.class, "TransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MinTime(), ecorePackage.getEInt(), "minTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Cost(), ecorePackage.getEDouble(), "cost", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MaxTime(), ecorePackage.getEInt(), "maxTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Confidentiality(), this.getConfidentiality(), "confidentiality", null, 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeExtEClass, PlaceExt.class, "PlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceExt_IsStart(), ecorePackage.getEBoolean(), "isStart", "False", 1, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceExtEClass, ArcToPlaceExt.class, "ArcToPlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToPlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToTransitionExtEClass, ArcToTransitionExt.class, "ArcToTransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToTransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.INTERNAL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.OUTPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INOUT);

		initEEnum(confidentialityEEnum, Confidentiality.class, "Confidentiality");
		addEEnumLiteral(confidentialityEEnum, Confidentiality.UNKNOWN);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.LOW);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.HIGH);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Place
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
		 * @generated
		 */
		public static final EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__FINAL_MARKING = eINSTANCE.getPlace_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PtNet
		 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
		 * @generated
		 */
		public static final EClass PT_NET = eINSTANCE.getPtNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__PLACES = eINSTANCE.getPtNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__TRANSITIONS = eINSTANCE.getPtNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__INITIAL_MARKING = eINSTANCE.getPtNet_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ANNOTATION = eINSTANCE.getPtNet_Annotation();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ARCS = eINSTANCE.getPtNet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__FINAL_MARKING = eINSTANCE.getPtNet_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Transition
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Node
		 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
		 * @generated
		 */
		public static final EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__ANNOTATION = eINSTANCE.getNode_Annotation();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Marking
		 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
		 * @generated
		 */
		public static final EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MARKING__PLACES = eINSTANCE.getMarking_Places();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceReference
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
		 * @generated
		 */
		public static final EClass PLACE_REFERENCE = eINSTANCE.getPlaceReference();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLACE_REFERENCE__PLACE = eINSTANCE.getPlaceReference_Place();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.RefMarkedPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
		 * @generated
		 */
		public static final EClass REF_MARKED_PLACE = eINSTANCE.getRefMarkedPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REF_MARKED_PLACE__TOKEN = eINSTANCE.getRefMarkedPlace_Token();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Annotation
		 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
		 * @generated
		 */
		public static final EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Arc
		 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
		 * @generated
		 */
		public static final EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE = eINSTANCE.getArcToPlace();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransition
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION = eINSTANCE.getArcToTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.TransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
		 * @generated
		 */
		public static final EClass TRANSITION_EXT = eINSTANCE.getTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__PROBABILITY = eINSTANCE.getTransitionExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MIN_TIME = eINSTANCE.getTransitionExt_MinTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__COST = eINSTANCE.getTransitionExt_Cost();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MAX_TIME = eINSTANCE.getTransitionExt_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__CONFIDENTIALITY = eINSTANCE.getTransitionExt_Confidentiality();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
		 * @generated
		 */
		public static final EClass PLACE_EXT = eINSTANCE.getPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__PROBABILITY = eINSTANCE.getPlaceExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__IS_START = eINSTANCE.getPlaceExt_IsStart();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE_EXT = eINSTANCE.getArcToPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_PLACE_EXT__PROBABILITY = eINSTANCE.getArcToPlaceExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION_EXT = eINSTANCE.getArcToTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_TRANSITION_EXT__PROBABILITY = eINSTANCE.getArcToTransitionExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.NodeType
		 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
		 * @generated
		 */
		public static final EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Confidentiality
		 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
		 * @generated
		 */
		public static final EEnum CONFIDENTIALITY = eINSTANCE.getConfidentiality();

	}

} //PtnetLoLAPackage
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ptnetLoLA.PtnetLoLAFactory
 * @model kind="package"
 * @generated
 */
public class PtnetLoLAPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ptnetLoLA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.informatik.hu-berlin.de/top/tools/editors/petrinets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ptnetLoLA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PtnetLoLAPackage eINSTANCE = ptnetLoLA.PtnetLoLAPackage.init();

	/**
	 * The meta object id for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Node
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
	 * @generated
	 */
	public static final int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Place
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
	 * @generated
	 */
	public static final int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TOKEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__FINAL_MARKING = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PtNet
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
	 * @generated
	 */
	public static final int PT_NET = 1;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__INITIAL_MARKING = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ARCS = 4;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__FINAL_MARKING = 5;

	/**
	 * The number of structural features of the '<em>Pt Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Transition
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TYPE = NODE__TYPE;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Marking
	 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
	 * @generated
	 */
	public static final int MARKING = 4;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING__PLACES = 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceReference
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
	 * @generated
	 */
	public static final int PLACE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Place Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.RefMarkedPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
	 * @generated
	 */
	public static final int REF_MARKED_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__PLACE = PLACE_REFERENCE__PLACE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__TOKEN = PLACE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Marked Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE_FEATURE_COUNT = PLACE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Annotation
	 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
	 * @generated
	 */
	public static final int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Arc
	 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
	 * @generated
	 */
	public static final int ARC = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
	 * @generated
	 */
	public static final int ARC_TO_PLACE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransition
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.TransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
	 * @generated
	 */
	public static final int TRANSITION_EXT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__ANNOTATION = TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__INCOMING = TRANSITION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__OUTGOING = TRANSITION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__TYPE = TRANSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MIN_TIME = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__COST = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MAX_TIME = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__CONFIDENTIALITY = TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
	 * @generated
	 */
	public static final int PLACE_EXT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__ANNOTATION = PLACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__INCOMING = PLACE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__OUTGOING = PLACE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TYPE = PLACE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TOKEN = PLACE__TOKEN;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__FINAL_MARKING = PLACE__FINAL_MARKING;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__PROBABILITY = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__IS_START = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT_FEATURE_COUNT = PLACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
	 * @generated
	 */
	public static final int ARC_TO_PLACE_EXT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__SOURCE = ARC_TO_PLACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__TARGET = ARC_TO_PLACE__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__WEIGHT = ARC_TO_PLACE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__PROBABILITY = ARC_TO_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT_FEATURE_COUNT = ARC_TO_PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION_EXT = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__SOURCE = ARC_TO_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__TARGET = ARC_TO_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__WEIGHT = ARC_TO_TRANSITION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__PROBABILITY = ARC_TO_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT_FEATURE_COUNT = ARC_TO_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.NodeType
	 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
	 * @generated
	 */
	public static final int NODE_TYPE = 15;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Confidentiality
	 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
	 * @generated
	 */
	public static final int CONFIDENTIALITY = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetEClass = null;

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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refMarkedPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityEEnum = null;

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
	 * @see ptnetLoLA.PtnetLoLAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetLoLAPackage()
	{
		super(eNS_URI, PtnetLoLAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PtnetLoLAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetLoLAPackage init()
	{
		if (isInited) return (PtnetLoLAPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetLoLAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPtnetLoLAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PtnetLoLAPackage thePtnetLoLAPackage = registeredPtnetLoLAPackage instanceof PtnetLoLAPackage ? (PtnetLoLAPackage)registeredPtnetLoLAPackage : new PtnetLoLAPackage();

		isInited = true;

		// Create package meta-data objects
		thePtnetLoLAPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetLoLAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetLoLAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetLoLAPackage.eNS_URI, thePtnetLoLAPackage);
		return thePtnetLoLAPackage;
	}


	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see ptnetLoLA.Place
	 * @generated
	 */
	public EClass getPlace()
	{
		return placeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_Token()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Marking</em>'.
	 * @see ptnetLoLA.Place#getFinalMarking()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_FinalMarking()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PtNet <em>Pt Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pt Net</em>'.
	 * @see ptnetLoLA.PtNet
	 * @generated
	 */
	public EClass getPtNet()
	{
		return ptNetEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.PtNet#getPlaces()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Places()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ptnetLoLA.PtNet#getTransitions()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Transitions()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see ptnetLoLA.PtNet#getInitialMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_InitialMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.PtNet#getAnnotation()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Annotation()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see ptnetLoLA.PtNet#getArcs()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Arcs()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Marking</em>'.
	 * @see ptnetLoLA.PtNet#getFinalMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_FinalMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ptnetLoLA.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ptnetLoLA.Node
	 * @generated
	 */
	public EClass getNode()
	{
		return nodeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ptnetLoLA.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Name()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.Node#getAnnotation()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Annotation()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see ptnetLoLA.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Incoming()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see ptnetLoLA.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Outgoing()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ptnetLoLA.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Type()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see ptnetLoLA.Marking
	 * @generated
	 */
	public EClass getMarking()
	{
		return markingEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.Marking#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.Marking#getPlaces()
	 * @see #getMarking()
	 * @generated
	 */
	public EReference getMarking_Places()
	{
		return (EReference)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Reference</em>'.
	 * @see ptnetLoLA.PlaceReference
	 * @generated
	 */
	public EClass getPlaceReference()
	{
		return placeReferenceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.PlaceReference#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ptnetLoLA.PlaceReference#getPlace()
	 * @see #getPlaceReference()
	 * @generated
	 */
	public EReference getPlaceReference_Place()
	{
		return (EReference)placeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Marked Place</em>'.
	 * @see ptnetLoLA.RefMarkedPlace
	 * @generated
	 */
	public EClass getRefMarkedPlace()
	{
		return refMarkedPlaceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.RefMarkedPlace#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.RefMarkedPlace#getToken()
	 * @see #getRefMarkedPlace()
	 * @generated
	 */
	public EAttribute getRefMarkedPlace_Token()
	{
		return (EAttribute)refMarkedPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ptnetLoLA.Annotation
	 * @generated
	 */
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ptnetLoLA.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	public EAttribute getAnnotation_Text()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see ptnetLoLA.Arc
	 * @generated
	 */
	public EClass getArc()
	{
		return arcEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ptnetLoLA.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Source()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ptnetLoLA.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Target()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ptnetLoLA.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	public EAttribute getArc_Weight()
	{
		return (EAttribute)arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place</em>'.
	 * @see ptnetLoLA.ArcToPlace
	 * @generated
	 */
	public EClass getArcToPlace()
	{
		return arcToPlaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition</em>'.
	 * @see ptnetLoLA.ArcToTransition
	 * @generated
	 */
	public EClass getArcToTransition()
	{
		return arcToTransitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Ext</em>'.
	 * @see ptnetLoLA.TransitionExt
	 * @generated
	 */
	public EClass getTransitionExt()
	{
		return transitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.TransitionExt#getProbability()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Probability()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMinTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MinTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see ptnetLoLA.TransitionExt#getCost()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Cost()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMaxTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MaxTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.TransitionExt#getConfidentiality()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Confidentiality()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Ext</em>'.
	 * @see ptnetLoLA.PlaceExt
	 * @generated
	 */
	public EClass getPlaceExt()
	{
		return placeExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.PlaceExt#getProbability()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_Probability()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see ptnetLoLA.PlaceExt#isIsStart()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_IsStart()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place Ext</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @generated
	 */
	public EClass getArcToPlaceExt()
	{
		return arcToPlaceExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToPlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt#getProbability()
	 * @see #getArcToPlaceExt()
	 * @generated
	 */
	public EAttribute getArcToPlaceExt_Probability()
	{
		return (EAttribute)arcToPlaceExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition Ext</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @generated
	 */
	public EClass getArcToTransitionExt()
	{
		return arcToTransitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToTransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt#getProbability()
	 * @see #getArcToTransitionExt()
	 * @generated
	 */
	public EAttribute getArcToTransitionExt_Probability()
	{
		return (EAttribute)arcToTransitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see ptnetLoLA.NodeType
	 * @generated
	 */
	public EEnum getNodeType()
	{
		return nodeTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.Confidentiality
	 * @generated
	 */
	public EEnum getConfidentiality()
	{
		return confidentialityEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PtnetLoLAFactory getPtnetLoLAFactory()
	{
		return (PtnetLoLAFactory)getEFactoryInstance();
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
		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__TOKEN);
		createEAttribute(placeEClass, PLACE__FINAL_MARKING);

		ptNetEClass = createEClass(PT_NET);
		createEReference(ptNetEClass, PT_NET__PLACES);
		createEReference(ptNetEClass, PT_NET__TRANSITIONS);
		createEReference(ptNetEClass, PT_NET__INITIAL_MARKING);
		createEReference(ptNetEClass, PT_NET__ANNOTATION);
		createEReference(ptNetEClass, PT_NET__ARCS);
		createEReference(ptNetEClass, PT_NET__FINAL_MARKING);

		transitionEClass = createEClass(TRANSITION);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__ANNOTATION);
		createEReference(nodeEClass, NODE__INCOMING);
		createEReference(nodeEClass, NODE__OUTGOING);
		createEAttribute(nodeEClass, NODE__TYPE);

		markingEClass = createEClass(MARKING);
		createEReference(markingEClass, MARKING__PLACES);

		placeReferenceEClass = createEClass(PLACE_REFERENCE);
		createEReference(placeReferenceEClass, PLACE_REFERENCE__PLACE);

		refMarkedPlaceEClass = createEClass(REF_MARKED_PLACE);
		createEAttribute(refMarkedPlaceEClass, REF_MARKED_PLACE__TOKEN);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__TEXT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);
		createEAttribute(arcEClass, ARC__WEIGHT);

		arcToPlaceEClass = createEClass(ARC_TO_PLACE);

		arcToTransitionEClass = createEClass(ARC_TO_TRANSITION);

		transitionExtEClass = createEClass(TRANSITION_EXT);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__PROBABILITY);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MIN_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__COST);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MAX_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__CONFIDENTIALITY);

		placeExtEClass = createEClass(PLACE_EXT);
		createEAttribute(placeExtEClass, PLACE_EXT__PROBABILITY);
		createEAttribute(placeExtEClass, PLACE_EXT__IS_START);

		arcToPlaceExtEClass = createEClass(ARC_TO_PLACE_EXT);
		createEAttribute(arcToPlaceExtEClass, ARC_TO_PLACE_EXT__PROBABILITY);

		arcToTransitionExtEClass = createEClass(ARC_TO_TRANSITION_EXT);
		createEAttribute(arcToTransitionExtEClass, ARC_TO_TRANSITION_EXT__PROBABILITY);

		// Create enums
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		confidentialityEEnum = createEEnum(CONFIDENTIALITY);
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
		placeEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getNode());
		refMarkedPlaceEClass.getESuperTypes().add(this.getPlaceReference());
		arcToPlaceEClass.getESuperTypes().add(this.getArc());
		arcToTransitionEClass.getESuperTypes().add(this.getArc());
		transitionExtEClass.getESuperTypes().add(this.getTransition());
		placeExtEClass.getESuperTypes().add(this.getPlace());
		arcToPlaceExtEClass.getESuperTypes().add(this.getArcToPlace());
		arcToTransitionExtEClass.getESuperTypes().add(this.getArcToTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Token(), ecorePackage.getEInt(), "token", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_FinalMarking(), ecorePackage.getEInt(), "finalMarking", "0", 1, 1, Place.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ptNetEClass, PtNet.class, "PtNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPtNet_Places(), this.getPlace(), null, "places", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_InitialMarking(), this.getMarking(), null, "initialMarking", null, 1, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Arcs(), this.getArc(), null, "arcs", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_FinalMarking(), this.getMarking(), null, "finalMarking", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Incoming(), this.getArc(), this.getArc_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Outgoing(), this.getArc(), this.getArc_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type(), this.getNodeType(), "type", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarking_Places(), this.getRefMarkedPlace(), null, "places", null, 0, -1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeReferenceEClass, PlaceReference.class, "PlaceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceReference_Place(), this.getPlace(), null, "place", null, 1, 1, PlaceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refMarkedPlaceEClass, RefMarkedPlace.class, "RefMarkedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefMarkedPlace_Token(), ecorePackage.getEInt(), "token", "1", 1, 1, RefMarkedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_Weight(), ecorePackage.getEInt(), "weight", "1", 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceEClass, ArcToPlace.class, "ArcToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcToTransitionEClass, ArcToTransition.class, "ArcToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionExtEClass, TransitionExt.class, "TransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MinTime(), ecorePackage.getEInt(), "minTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Cost(), ecorePackage.getEDouble(), "cost", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MaxTime(), ecorePackage.getEInt(), "maxTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Confidentiality(), this.getConfidentiality(), "confidentiality", null, 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeExtEClass, PlaceExt.class, "PlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceExt_IsStart(), ecorePackage.getEBoolean(), "isStart", "False", 1, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceExtEClass, ArcToPlaceExt.class, "ArcToPlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToPlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToTransitionExtEClass, ArcToTransitionExt.class, "ArcToTransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToTransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.INTERNAL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.OUTPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INOUT);

		initEEnum(confidentialityEEnum, Confidentiality.class, "Confidentiality");
		addEEnumLiteral(confidentialityEEnum, Confidentiality.UNKNOWN);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.LOW);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.HIGH);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Place
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
		 * @generated
		 */
		public static final EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__FINAL_MARKING = eINSTANCE.getPlace_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PtNet
		 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
		 * @generated
		 */
		public static final EClass PT_NET = eINSTANCE.getPtNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__PLACES = eINSTANCE.getPtNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__TRANSITIONS = eINSTANCE.getPtNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__INITIAL_MARKING = eINSTANCE.getPtNet_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ANNOTATION = eINSTANCE.getPtNet_Annotation();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ARCS = eINSTANCE.getPtNet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__FINAL_MARKING = eINSTANCE.getPtNet_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Transition
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Node
		 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
		 * @generated
		 */
		public static final EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__ANNOTATION = eINSTANCE.getNode_Annotation();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Marking
		 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
		 * @generated
		 */
		public static final EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MARKING__PLACES = eINSTANCE.getMarking_Places();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceReference
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
		 * @generated
		 */
		public static final EClass PLACE_REFERENCE = eINSTANCE.getPlaceReference();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLACE_REFERENCE__PLACE = eINSTANCE.getPlaceReference_Place();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.RefMarkedPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
		 * @generated
		 */
		public static final EClass REF_MARKED_PLACE = eINSTANCE.getRefMarkedPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REF_MARKED_PLACE__TOKEN = eINSTANCE.getRefMarkedPlace_Token();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Annotation
		 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
		 * @generated
		 */
		public static final EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Arc
		 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
		 * @generated
		 */
		public static final EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE = eINSTANCE.getArcToPlace();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransition
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION = eINSTANCE.getArcToTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.TransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
		 * @generated
		 */
		public static final EClass TRANSITION_EXT = eINSTANCE.getTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__PROBABILITY = eINSTANCE.getTransitionExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MIN_TIME = eINSTANCE.getTransitionExt_MinTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__COST = eINSTANCE.getTransitionExt_Cost();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MAX_TIME = eINSTANCE.getTransitionExt_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__CONFIDENTIALITY = eINSTANCE.getTransitionExt_Confidentiality();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
		 * @generated
		 */
		public static final EClass PLACE_EXT = eINSTANCE.getPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__PROBABILITY = eINSTANCE.getPlaceExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__IS_START = eINSTANCE.getPlaceExt_IsStart();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE_EXT = eINSTANCE.getArcToPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_PLACE_EXT__PROBABILITY = eINSTANCE.getArcToPlaceExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION_EXT = eINSTANCE.getArcToTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_TRANSITION_EXT__PROBABILITY = eINSTANCE.getArcToTransitionExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.NodeType
		 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
		 * @generated
		 */
		public static final EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Confidentiality
		 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
		 * @generated
		 */
		public static final EEnum CONFIDENTIALITY = eINSTANCE.getConfidentiality();

	}

} //PtnetLoLAPackage
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ptnetLoLA.PtnetLoLAFactory
 * @model kind="package"
 * @generated
 */
public class PtnetLoLAPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ptnetLoLA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.informatik.hu-berlin.de/top/tools/editors/petrinets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ptnetLoLA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PtnetLoLAPackage eINSTANCE = ptnetLoLA.PtnetLoLAPackage.init();

	/**
	 * The meta object id for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Node
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
	 * @generated
	 */
	public static final int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Place
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
	 * @generated
	 */
	public static final int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TOKEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__FINAL_MARKING = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PtNet
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
	 * @generated
	 */
	public static final int PT_NET = 1;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__INITIAL_MARKING = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ARCS = 4;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__FINAL_MARKING = 5;

	/**
	 * The number of structural features of the '<em>Pt Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Transition
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TYPE = NODE__TYPE;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Marking
	 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
	 * @generated
	 */
	public static final int MARKING = 4;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING__PLACES = 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceReference
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
	 * @generated
	 */
	public static final int PLACE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Place Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.RefMarkedPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
	 * @generated
	 */
	public static final int REF_MARKED_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__PLACE = PLACE_REFERENCE__PLACE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__TOKEN = PLACE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Marked Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE_FEATURE_COUNT = PLACE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Annotation
	 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
	 * @generated
	 */
	public static final int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Arc
	 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
	 * @generated
	 */
	public static final int ARC = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
	 * @generated
	 */
	public static final int ARC_TO_PLACE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransition
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.TransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
	 * @generated
	 */
	public static final int TRANSITION_EXT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__ANNOTATION = TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__INCOMING = TRANSITION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__OUTGOING = TRANSITION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__TYPE = TRANSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MIN_TIME = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__COST = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MAX_TIME = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__CONFIDENTIALITY = TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
	 * @generated
	 */
	public static final int PLACE_EXT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__ANNOTATION = PLACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__INCOMING = PLACE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__OUTGOING = PLACE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TYPE = PLACE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TOKEN = PLACE__TOKEN;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__FINAL_MARKING = PLACE__FINAL_MARKING;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__PROBABILITY = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__IS_START = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT_FEATURE_COUNT = PLACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
	 * @generated
	 */
	public static final int ARC_TO_PLACE_EXT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__SOURCE = ARC_TO_PLACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__TARGET = ARC_TO_PLACE__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__WEIGHT = ARC_TO_PLACE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__PROBABILITY = ARC_TO_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT_FEATURE_COUNT = ARC_TO_PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION_EXT = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__SOURCE = ARC_TO_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__TARGET = ARC_TO_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__WEIGHT = ARC_TO_TRANSITION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__PROBABILITY = ARC_TO_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT_FEATURE_COUNT = ARC_TO_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.NodeType
	 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
	 * @generated
	 */
	public static final int NODE_TYPE = 15;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Confidentiality
	 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
	 * @generated
	 */
	public static final int CONFIDENTIALITY = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetEClass = null;

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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refMarkedPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityEEnum = null;

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
	 * @see ptnetLoLA.PtnetLoLAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetLoLAPackage()
	{
		super(eNS_URI, PtnetLoLAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PtnetLoLAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetLoLAPackage init()
	{
		if (isInited) return (PtnetLoLAPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetLoLAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPtnetLoLAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PtnetLoLAPackage thePtnetLoLAPackage = registeredPtnetLoLAPackage instanceof PtnetLoLAPackage ? (PtnetLoLAPackage)registeredPtnetLoLAPackage : new PtnetLoLAPackage();

		isInited = true;

		// Create package meta-data objects
		thePtnetLoLAPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetLoLAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetLoLAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetLoLAPackage.eNS_URI, thePtnetLoLAPackage);
		return thePtnetLoLAPackage;
	}


	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see ptnetLoLA.Place
	 * @generated
	 */
	public EClass getPlace()
	{
		return placeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_Token()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Marking</em>'.
	 * @see ptnetLoLA.Place#getFinalMarking()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_FinalMarking()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PtNet <em>Pt Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pt Net</em>'.
	 * @see ptnetLoLA.PtNet
	 * @generated
	 */
	public EClass getPtNet()
	{
		return ptNetEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.PtNet#getPlaces()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Places()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ptnetLoLA.PtNet#getTransitions()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Transitions()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see ptnetLoLA.PtNet#getInitialMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_InitialMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.PtNet#getAnnotation()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Annotation()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see ptnetLoLA.PtNet#getArcs()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Arcs()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Marking</em>'.
	 * @see ptnetLoLA.PtNet#getFinalMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_FinalMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ptnetLoLA.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ptnetLoLA.Node
	 * @generated
	 */
	public EClass getNode()
	{
		return nodeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ptnetLoLA.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Name()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.Node#getAnnotation()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Annotation()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see ptnetLoLA.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Incoming()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see ptnetLoLA.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Outgoing()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ptnetLoLA.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Type()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see ptnetLoLA.Marking
	 * @generated
	 */
	public EClass getMarking()
	{
		return markingEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.Marking#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.Marking#getPlaces()
	 * @see #getMarking()
	 * @generated
	 */
	public EReference getMarking_Places()
	{
		return (EReference)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Reference</em>'.
	 * @see ptnetLoLA.PlaceReference
	 * @generated
	 */
	public EClass getPlaceReference()
	{
		return placeReferenceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.PlaceReference#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ptnetLoLA.PlaceReference#getPlace()
	 * @see #getPlaceReference()
	 * @generated
	 */
	public EReference getPlaceReference_Place()
	{
		return (EReference)placeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Marked Place</em>'.
	 * @see ptnetLoLA.RefMarkedPlace
	 * @generated
	 */
	public EClass getRefMarkedPlace()
	{
		return refMarkedPlaceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.RefMarkedPlace#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.RefMarkedPlace#getToken()
	 * @see #getRefMarkedPlace()
	 * @generated
	 */
	public EAttribute getRefMarkedPlace_Token()
	{
		return (EAttribute)refMarkedPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ptnetLoLA.Annotation
	 * @generated
	 */
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ptnetLoLA.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	public EAttribute getAnnotation_Text()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see ptnetLoLA.Arc
	 * @generated
	 */
	public EClass getArc()
	{
		return arcEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ptnetLoLA.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Source()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ptnetLoLA.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Target()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ptnetLoLA.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	public EAttribute getArc_Weight()
	{
		return (EAttribute)arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place</em>'.
	 * @see ptnetLoLA.ArcToPlace
	 * @generated
	 */
	public EClass getArcToPlace()
	{
		return arcToPlaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition</em>'.
	 * @see ptnetLoLA.ArcToTransition
	 * @generated
	 */
	public EClass getArcToTransition()
	{
		return arcToTransitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Ext</em>'.
	 * @see ptnetLoLA.TransitionExt
	 * @generated
	 */
	public EClass getTransitionExt()
	{
		return transitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.TransitionExt#getProbability()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Probability()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMinTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MinTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see ptnetLoLA.TransitionExt#getCost()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Cost()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMaxTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MaxTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.TransitionExt#getConfidentiality()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Confidentiality()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Ext</em>'.
	 * @see ptnetLoLA.PlaceExt
	 * @generated
	 */
	public EClass getPlaceExt()
	{
		return placeExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.PlaceExt#getProbability()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_Probability()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see ptnetLoLA.PlaceExt#isIsStart()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_IsStart()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place Ext</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @generated
	 */
	public EClass getArcToPlaceExt()
	{
		return arcToPlaceExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToPlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt#getProbability()
	 * @see #getArcToPlaceExt()
	 * @generated
	 */
	public EAttribute getArcToPlaceExt_Probability()
	{
		return (EAttribute)arcToPlaceExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition Ext</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @generated
	 */
	public EClass getArcToTransitionExt()
	{
		return arcToTransitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToTransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt#getProbability()
	 * @see #getArcToTransitionExt()
	 * @generated
	 */
	public EAttribute getArcToTransitionExt_Probability()
	{
		return (EAttribute)arcToTransitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see ptnetLoLA.NodeType
	 * @generated
	 */
	public EEnum getNodeType()
	{
		return nodeTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.Confidentiality
	 * @generated
	 */
	public EEnum getConfidentiality()
	{
		return confidentialityEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PtnetLoLAFactory getPtnetLoLAFactory()
	{
		return (PtnetLoLAFactory)getEFactoryInstance();
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
		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__TOKEN);
		createEAttribute(placeEClass, PLACE__FINAL_MARKING);

		ptNetEClass = createEClass(PT_NET);
		createEReference(ptNetEClass, PT_NET__PLACES);
		createEReference(ptNetEClass, PT_NET__TRANSITIONS);
		createEReference(ptNetEClass, PT_NET__INITIAL_MARKING);
		createEReference(ptNetEClass, PT_NET__ANNOTATION);
		createEReference(ptNetEClass, PT_NET__ARCS);
		createEReference(ptNetEClass, PT_NET__FINAL_MARKING);

		transitionEClass = createEClass(TRANSITION);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__ANNOTATION);
		createEReference(nodeEClass, NODE__INCOMING);
		createEReference(nodeEClass, NODE__OUTGOING);
		createEAttribute(nodeEClass, NODE__TYPE);

		markingEClass = createEClass(MARKING);
		createEReference(markingEClass, MARKING__PLACES);

		placeReferenceEClass = createEClass(PLACE_REFERENCE);
		createEReference(placeReferenceEClass, PLACE_REFERENCE__PLACE);

		refMarkedPlaceEClass = createEClass(REF_MARKED_PLACE);
		createEAttribute(refMarkedPlaceEClass, REF_MARKED_PLACE__TOKEN);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__TEXT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);
		createEAttribute(arcEClass, ARC__WEIGHT);

		arcToPlaceEClass = createEClass(ARC_TO_PLACE);

		arcToTransitionEClass = createEClass(ARC_TO_TRANSITION);

		transitionExtEClass = createEClass(TRANSITION_EXT);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__PROBABILITY);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MIN_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__COST);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MAX_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__CONFIDENTIALITY);

		placeExtEClass = createEClass(PLACE_EXT);
		createEAttribute(placeExtEClass, PLACE_EXT__PROBABILITY);
		createEAttribute(placeExtEClass, PLACE_EXT__IS_START);

		arcToPlaceExtEClass = createEClass(ARC_TO_PLACE_EXT);
		createEAttribute(arcToPlaceExtEClass, ARC_TO_PLACE_EXT__PROBABILITY);

		arcToTransitionExtEClass = createEClass(ARC_TO_TRANSITION_EXT);
		createEAttribute(arcToTransitionExtEClass, ARC_TO_TRANSITION_EXT__PROBABILITY);

		// Create enums
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		confidentialityEEnum = createEEnum(CONFIDENTIALITY);
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
		placeEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getNode());
		refMarkedPlaceEClass.getESuperTypes().add(this.getPlaceReference());
		arcToPlaceEClass.getESuperTypes().add(this.getArc());
		arcToTransitionEClass.getESuperTypes().add(this.getArc());
		transitionExtEClass.getESuperTypes().add(this.getTransition());
		placeExtEClass.getESuperTypes().add(this.getPlace());
		arcToPlaceExtEClass.getESuperTypes().add(this.getArcToPlace());
		arcToTransitionExtEClass.getESuperTypes().add(this.getArcToTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Token(), ecorePackage.getEInt(), "token", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_FinalMarking(), ecorePackage.getEInt(), "finalMarking", "0", 1, 1, Place.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ptNetEClass, PtNet.class, "PtNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPtNet_Places(), this.getPlace(), null, "places", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_InitialMarking(), this.getMarking(), null, "initialMarking", null, 1, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Arcs(), this.getArc(), null, "arcs", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_FinalMarking(), this.getMarking(), null, "finalMarking", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Incoming(), this.getArc(), this.getArc_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Outgoing(), this.getArc(), this.getArc_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type(), this.getNodeType(), "type", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarking_Places(), this.getRefMarkedPlace(), null, "places", null, 0, -1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeReferenceEClass, PlaceReference.class, "PlaceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceReference_Place(), this.getPlace(), null, "place", null, 1, 1, PlaceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refMarkedPlaceEClass, RefMarkedPlace.class, "RefMarkedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefMarkedPlace_Token(), ecorePackage.getEInt(), "token", "1", 1, 1, RefMarkedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_Weight(), ecorePackage.getEInt(), "weight", "1", 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceEClass, ArcToPlace.class, "ArcToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcToTransitionEClass, ArcToTransition.class, "ArcToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionExtEClass, TransitionExt.class, "TransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MinTime(), ecorePackage.getEInt(), "minTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Cost(), ecorePackage.getEDouble(), "cost", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MaxTime(), ecorePackage.getEInt(), "maxTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Confidentiality(), this.getConfidentiality(), "confidentiality", null, 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeExtEClass, PlaceExt.class, "PlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceExt_IsStart(), ecorePackage.getEBoolean(), "isStart", "False", 1, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceExtEClass, ArcToPlaceExt.class, "ArcToPlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToPlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToTransitionExtEClass, ArcToTransitionExt.class, "ArcToTransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToTransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.INTERNAL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.OUTPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INOUT);

		initEEnum(confidentialityEEnum, Confidentiality.class, "Confidentiality");
		addEEnumLiteral(confidentialityEEnum, Confidentiality.UNKNOWN);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.LOW);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.HIGH);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Place
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
		 * @generated
		 */
		public static final EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__FINAL_MARKING = eINSTANCE.getPlace_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PtNet
		 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
		 * @generated
		 */
		public static final EClass PT_NET = eINSTANCE.getPtNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__PLACES = eINSTANCE.getPtNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__TRANSITIONS = eINSTANCE.getPtNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__INITIAL_MARKING = eINSTANCE.getPtNet_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ANNOTATION = eINSTANCE.getPtNet_Annotation();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ARCS = eINSTANCE.getPtNet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__FINAL_MARKING = eINSTANCE.getPtNet_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Transition
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Node
		 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
		 * @generated
		 */
		public static final EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__ANNOTATION = eINSTANCE.getNode_Annotation();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Marking
		 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
		 * @generated
		 */
		public static final EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MARKING__PLACES = eINSTANCE.getMarking_Places();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceReference
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
		 * @generated
		 */
		public static final EClass PLACE_REFERENCE = eINSTANCE.getPlaceReference();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLACE_REFERENCE__PLACE = eINSTANCE.getPlaceReference_Place();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.RefMarkedPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
		 * @generated
		 */
		public static final EClass REF_MARKED_PLACE = eINSTANCE.getRefMarkedPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REF_MARKED_PLACE__TOKEN = eINSTANCE.getRefMarkedPlace_Token();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Annotation
		 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
		 * @generated
		 */
		public static final EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Arc
		 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
		 * @generated
		 */
		public static final EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE = eINSTANCE.getArcToPlace();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransition
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION = eINSTANCE.getArcToTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.TransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
		 * @generated
		 */
		public static final EClass TRANSITION_EXT = eINSTANCE.getTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__PROBABILITY = eINSTANCE.getTransitionExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MIN_TIME = eINSTANCE.getTransitionExt_MinTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__COST = eINSTANCE.getTransitionExt_Cost();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MAX_TIME = eINSTANCE.getTransitionExt_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__CONFIDENTIALITY = eINSTANCE.getTransitionExt_Confidentiality();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
		 * @generated
		 */
		public static final EClass PLACE_EXT = eINSTANCE.getPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__PROBABILITY = eINSTANCE.getPlaceExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__IS_START = eINSTANCE.getPlaceExt_IsStart();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE_EXT = eINSTANCE.getArcToPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_PLACE_EXT__PROBABILITY = eINSTANCE.getArcToPlaceExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION_EXT = eINSTANCE.getArcToTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_TRANSITION_EXT__PROBABILITY = eINSTANCE.getArcToTransitionExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.NodeType
		 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
		 * @generated
		 */
		public static final EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Confidentiality
		 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
		 * @generated
		 */
		public static final EEnum CONFIDENTIALITY = eINSTANCE.getConfidentiality();

	}

} //PtnetLoLAPackage
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ptnetLoLA.PtnetLoLAFactory
 * @model kind="package"
 * @generated
 */
public class PtnetLoLAPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ptnetLoLA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.informatik.hu-berlin.de/top/tools/editors/petrinets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ptnetLoLA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PtnetLoLAPackage eINSTANCE = ptnetLoLA.PtnetLoLAPackage.init();

	/**
	 * The meta object id for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Node
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
	 * @generated
	 */
	public static final int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Place
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
	 * @generated
	 */
	public static final int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TOKEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__FINAL_MARKING = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PtNet
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
	 * @generated
	 */
	public static final int PT_NET = 1;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__INITIAL_MARKING = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ARCS = 4;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__FINAL_MARKING = 5;

	/**
	 * The number of structural features of the '<em>Pt Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Transition
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TYPE = NODE__TYPE;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Marking
	 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
	 * @generated
	 */
	public static final int MARKING = 4;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING__PLACES = 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceReference
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
	 * @generated
	 */
	public static final int PLACE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Place Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.RefMarkedPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
	 * @generated
	 */
	public static final int REF_MARKED_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__PLACE = PLACE_REFERENCE__PLACE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__TOKEN = PLACE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Marked Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE_FEATURE_COUNT = PLACE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Annotation
	 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
	 * @generated
	 */
	public static final int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Arc
	 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
	 * @generated
	 */
	public static final int ARC = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
	 * @generated
	 */
	public static final int ARC_TO_PLACE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransition
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.TransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
	 * @generated
	 */
	public static final int TRANSITION_EXT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__ANNOTATION = TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__INCOMING = TRANSITION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__OUTGOING = TRANSITION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__TYPE = TRANSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MIN_TIME = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__COST = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MAX_TIME = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__CONFIDENTIALITY = TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
	 * @generated
	 */
	public static final int PLACE_EXT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__ANNOTATION = PLACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__INCOMING = PLACE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__OUTGOING = PLACE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TYPE = PLACE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TOKEN = PLACE__TOKEN;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__FINAL_MARKING = PLACE__FINAL_MARKING;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__PROBABILITY = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__IS_START = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT_FEATURE_COUNT = PLACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
	 * @generated
	 */
	public static final int ARC_TO_PLACE_EXT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__SOURCE = ARC_TO_PLACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__TARGET = ARC_TO_PLACE__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__WEIGHT = ARC_TO_PLACE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__PROBABILITY = ARC_TO_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT_FEATURE_COUNT = ARC_TO_PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION_EXT = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__SOURCE = ARC_TO_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__TARGET = ARC_TO_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__WEIGHT = ARC_TO_TRANSITION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__PROBABILITY = ARC_TO_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT_FEATURE_COUNT = ARC_TO_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.NodeType
	 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
	 * @generated
	 */
	public static final int NODE_TYPE = 15;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Confidentiality
	 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
	 * @generated
	 */
	public static final int CONFIDENTIALITY = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetEClass = null;

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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refMarkedPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityEEnum = null;

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
	 * @see ptnetLoLA.PtnetLoLAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetLoLAPackage()
	{
		super(eNS_URI, PtnetLoLAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PtnetLoLAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetLoLAPackage init()
	{
		if (isInited) return (PtnetLoLAPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetLoLAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPtnetLoLAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PtnetLoLAPackage thePtnetLoLAPackage = registeredPtnetLoLAPackage instanceof PtnetLoLAPackage ? (PtnetLoLAPackage)registeredPtnetLoLAPackage : new PtnetLoLAPackage();

		isInited = true;

		// Create package meta-data objects
		thePtnetLoLAPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetLoLAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetLoLAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetLoLAPackage.eNS_URI, thePtnetLoLAPackage);
		return thePtnetLoLAPackage;
	}


	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see ptnetLoLA.Place
	 * @generated
	 */
	public EClass getPlace()
	{
		return placeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_Token()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Marking</em>'.
	 * @see ptnetLoLA.Place#getFinalMarking()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_FinalMarking()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PtNet <em>Pt Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pt Net</em>'.
	 * @see ptnetLoLA.PtNet
	 * @generated
	 */
	public EClass getPtNet()
	{
		return ptNetEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.PtNet#getPlaces()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Places()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ptnetLoLA.PtNet#getTransitions()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Transitions()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see ptnetLoLA.PtNet#getInitialMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_InitialMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.PtNet#getAnnotation()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Annotation()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see ptnetLoLA.PtNet#getArcs()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Arcs()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Marking</em>'.
	 * @see ptnetLoLA.PtNet#getFinalMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_FinalMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ptnetLoLA.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ptnetLoLA.Node
	 * @generated
	 */
	public EClass getNode()
	{
		return nodeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ptnetLoLA.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Name()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.Node#getAnnotation()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Annotation()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see ptnetLoLA.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Incoming()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see ptnetLoLA.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Outgoing()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ptnetLoLA.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Type()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see ptnetLoLA.Marking
	 * @generated
	 */
	public EClass getMarking()
	{
		return markingEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.Marking#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.Marking#getPlaces()
	 * @see #getMarking()
	 * @generated
	 */
	public EReference getMarking_Places()
	{
		return (EReference)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Reference</em>'.
	 * @see ptnetLoLA.PlaceReference
	 * @generated
	 */
	public EClass getPlaceReference()
	{
		return placeReferenceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.PlaceReference#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ptnetLoLA.PlaceReference#getPlace()
	 * @see #getPlaceReference()
	 * @generated
	 */
	public EReference getPlaceReference_Place()
	{
		return (EReference)placeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Marked Place</em>'.
	 * @see ptnetLoLA.RefMarkedPlace
	 * @generated
	 */
	public EClass getRefMarkedPlace()
	{
		return refMarkedPlaceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.RefMarkedPlace#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.RefMarkedPlace#getToken()
	 * @see #getRefMarkedPlace()
	 * @generated
	 */
	public EAttribute getRefMarkedPlace_Token()
	{
		return (EAttribute)refMarkedPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ptnetLoLA.Annotation
	 * @generated
	 */
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ptnetLoLA.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	public EAttribute getAnnotation_Text()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see ptnetLoLA.Arc
	 * @generated
	 */
	public EClass getArc()
	{
		return arcEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ptnetLoLA.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Source()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ptnetLoLA.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Target()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ptnetLoLA.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	public EAttribute getArc_Weight()
	{
		return (EAttribute)arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place</em>'.
	 * @see ptnetLoLA.ArcToPlace
	 * @generated
	 */
	public EClass getArcToPlace()
	{
		return arcToPlaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition</em>'.
	 * @see ptnetLoLA.ArcToTransition
	 * @generated
	 */
	public EClass getArcToTransition()
	{
		return arcToTransitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Ext</em>'.
	 * @see ptnetLoLA.TransitionExt
	 * @generated
	 */
	public EClass getTransitionExt()
	{
		return transitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.TransitionExt#getProbability()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Probability()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMinTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MinTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see ptnetLoLA.TransitionExt#getCost()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Cost()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMaxTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MaxTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.TransitionExt#getConfidentiality()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Confidentiality()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Ext</em>'.
	 * @see ptnetLoLA.PlaceExt
	 * @generated
	 */
	public EClass getPlaceExt()
	{
		return placeExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.PlaceExt#getProbability()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_Probability()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see ptnetLoLA.PlaceExt#isIsStart()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_IsStart()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place Ext</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @generated
	 */
	public EClass getArcToPlaceExt()
	{
		return arcToPlaceExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToPlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt#getProbability()
	 * @see #getArcToPlaceExt()
	 * @generated
	 */
	public EAttribute getArcToPlaceExt_Probability()
	{
		return (EAttribute)arcToPlaceExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition Ext</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @generated
	 */
	public EClass getArcToTransitionExt()
	{
		return arcToTransitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToTransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt#getProbability()
	 * @see #getArcToTransitionExt()
	 * @generated
	 */
	public EAttribute getArcToTransitionExt_Probability()
	{
		return (EAttribute)arcToTransitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see ptnetLoLA.NodeType
	 * @generated
	 */
	public EEnum getNodeType()
	{
		return nodeTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.Confidentiality
	 * @generated
	 */
	public EEnum getConfidentiality()
	{
		return confidentialityEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PtnetLoLAFactory getPtnetLoLAFactory()
	{
		return (PtnetLoLAFactory)getEFactoryInstance();
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
		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__TOKEN);
		createEAttribute(placeEClass, PLACE__FINAL_MARKING);

		ptNetEClass = createEClass(PT_NET);
		createEReference(ptNetEClass, PT_NET__PLACES);
		createEReference(ptNetEClass, PT_NET__TRANSITIONS);
		createEReference(ptNetEClass, PT_NET__INITIAL_MARKING);
		createEReference(ptNetEClass, PT_NET__ANNOTATION);
		createEReference(ptNetEClass, PT_NET__ARCS);
		createEReference(ptNetEClass, PT_NET__FINAL_MARKING);

		transitionEClass = createEClass(TRANSITION);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__ANNOTATION);
		createEReference(nodeEClass, NODE__INCOMING);
		createEReference(nodeEClass, NODE__OUTGOING);
		createEAttribute(nodeEClass, NODE__TYPE);

		markingEClass = createEClass(MARKING);
		createEReference(markingEClass, MARKING__PLACES);

		placeReferenceEClass = createEClass(PLACE_REFERENCE);
		createEReference(placeReferenceEClass, PLACE_REFERENCE__PLACE);

		refMarkedPlaceEClass = createEClass(REF_MARKED_PLACE);
		createEAttribute(refMarkedPlaceEClass, REF_MARKED_PLACE__TOKEN);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__TEXT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);
		createEAttribute(arcEClass, ARC__WEIGHT);

		arcToPlaceEClass = createEClass(ARC_TO_PLACE);

		arcToTransitionEClass = createEClass(ARC_TO_TRANSITION);

		transitionExtEClass = createEClass(TRANSITION_EXT);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__PROBABILITY);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MIN_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__COST);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MAX_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__CONFIDENTIALITY);

		placeExtEClass = createEClass(PLACE_EXT);
		createEAttribute(placeExtEClass, PLACE_EXT__PROBABILITY);
		createEAttribute(placeExtEClass, PLACE_EXT__IS_START);

		arcToPlaceExtEClass = createEClass(ARC_TO_PLACE_EXT);
		createEAttribute(arcToPlaceExtEClass, ARC_TO_PLACE_EXT__PROBABILITY);

		arcToTransitionExtEClass = createEClass(ARC_TO_TRANSITION_EXT);
		createEAttribute(arcToTransitionExtEClass, ARC_TO_TRANSITION_EXT__PROBABILITY);

		// Create enums
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		confidentialityEEnum = createEEnum(CONFIDENTIALITY);
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
		placeEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getNode());
		refMarkedPlaceEClass.getESuperTypes().add(this.getPlaceReference());
		arcToPlaceEClass.getESuperTypes().add(this.getArc());
		arcToTransitionEClass.getESuperTypes().add(this.getArc());
		transitionExtEClass.getESuperTypes().add(this.getTransition());
		placeExtEClass.getESuperTypes().add(this.getPlace());
		arcToPlaceExtEClass.getESuperTypes().add(this.getArcToPlace());
		arcToTransitionExtEClass.getESuperTypes().add(this.getArcToTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Token(), ecorePackage.getEInt(), "token", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_FinalMarking(), ecorePackage.getEInt(), "finalMarking", "0", 1, 1, Place.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ptNetEClass, PtNet.class, "PtNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPtNet_Places(), this.getPlace(), null, "places", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_InitialMarking(), this.getMarking(), null, "initialMarking", null, 1, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Arcs(), this.getArc(), null, "arcs", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_FinalMarking(), this.getMarking(), null, "finalMarking", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Incoming(), this.getArc(), this.getArc_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Outgoing(), this.getArc(), this.getArc_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type(), this.getNodeType(), "type", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarking_Places(), this.getRefMarkedPlace(), null, "places", null, 0, -1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeReferenceEClass, PlaceReference.class, "PlaceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceReference_Place(), this.getPlace(), null, "place", null, 1, 1, PlaceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refMarkedPlaceEClass, RefMarkedPlace.class, "RefMarkedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefMarkedPlace_Token(), ecorePackage.getEInt(), "token", "1", 1, 1, RefMarkedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_Weight(), ecorePackage.getEInt(), "weight", "1", 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceEClass, ArcToPlace.class, "ArcToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcToTransitionEClass, ArcToTransition.class, "ArcToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionExtEClass, TransitionExt.class, "TransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MinTime(), ecorePackage.getEInt(), "minTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Cost(), ecorePackage.getEDouble(), "cost", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MaxTime(), ecorePackage.getEInt(), "maxTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Confidentiality(), this.getConfidentiality(), "confidentiality", null, 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeExtEClass, PlaceExt.class, "PlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceExt_IsStart(), ecorePackage.getEBoolean(), "isStart", "False", 1, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceExtEClass, ArcToPlaceExt.class, "ArcToPlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToPlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToTransitionExtEClass, ArcToTransitionExt.class, "ArcToTransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToTransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.INTERNAL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.OUTPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INOUT);

		initEEnum(confidentialityEEnum, Confidentiality.class, "Confidentiality");
		addEEnumLiteral(confidentialityEEnum, Confidentiality.UNKNOWN);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.LOW);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.HIGH);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Place
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
		 * @generated
		 */
		public static final EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__FINAL_MARKING = eINSTANCE.getPlace_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PtNet
		 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
		 * @generated
		 */
		public static final EClass PT_NET = eINSTANCE.getPtNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__PLACES = eINSTANCE.getPtNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__TRANSITIONS = eINSTANCE.getPtNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__INITIAL_MARKING = eINSTANCE.getPtNet_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ANNOTATION = eINSTANCE.getPtNet_Annotation();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ARCS = eINSTANCE.getPtNet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__FINAL_MARKING = eINSTANCE.getPtNet_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Transition
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Node
		 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
		 * @generated
		 */
		public static final EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__ANNOTATION = eINSTANCE.getNode_Annotation();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Marking
		 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
		 * @generated
		 */
		public static final EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MARKING__PLACES = eINSTANCE.getMarking_Places();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceReference
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
		 * @generated
		 */
		public static final EClass PLACE_REFERENCE = eINSTANCE.getPlaceReference();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLACE_REFERENCE__PLACE = eINSTANCE.getPlaceReference_Place();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.RefMarkedPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
		 * @generated
		 */
		public static final EClass REF_MARKED_PLACE = eINSTANCE.getRefMarkedPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REF_MARKED_PLACE__TOKEN = eINSTANCE.getRefMarkedPlace_Token();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Annotation
		 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
		 * @generated
		 */
		public static final EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Arc
		 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
		 * @generated
		 */
		public static final EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE = eINSTANCE.getArcToPlace();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransition
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION = eINSTANCE.getArcToTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.TransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
		 * @generated
		 */
		public static final EClass TRANSITION_EXT = eINSTANCE.getTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__PROBABILITY = eINSTANCE.getTransitionExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MIN_TIME = eINSTANCE.getTransitionExt_MinTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__COST = eINSTANCE.getTransitionExt_Cost();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MAX_TIME = eINSTANCE.getTransitionExt_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__CONFIDENTIALITY = eINSTANCE.getTransitionExt_Confidentiality();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
		 * @generated
		 */
		public static final EClass PLACE_EXT = eINSTANCE.getPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__PROBABILITY = eINSTANCE.getPlaceExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__IS_START = eINSTANCE.getPlaceExt_IsStart();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE_EXT = eINSTANCE.getArcToPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_PLACE_EXT__PROBABILITY = eINSTANCE.getArcToPlaceExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION_EXT = eINSTANCE.getArcToTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_TRANSITION_EXT__PROBABILITY = eINSTANCE.getArcToTransitionExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.NodeType
		 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
		 * @generated
		 */
		public static final EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Confidentiality
		 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
		 * @generated
		 */
		public static final EEnum CONFIDENTIALITY = eINSTANCE.getConfidentiality();

	}

} //PtnetLoLAPackage
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ptnetLoLA.PtnetLoLAFactory
 * @model kind="package"
 * @generated
 */
public class PtnetLoLAPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ptnetLoLA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.informatik.hu-berlin.de/top/tools/editors/petrinets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ptnetLoLA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PtnetLoLAPackage eINSTANCE = ptnetLoLA.PtnetLoLAPackage.init();

	/**
	 * The meta object id for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Node
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
	 * @generated
	 */
	public static final int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Place
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
	 * @generated
	 */
	public static final int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TOKEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__FINAL_MARKING = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PtNet
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
	 * @generated
	 */
	public static final int PT_NET = 1;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__INITIAL_MARKING = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ARCS = 4;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__FINAL_MARKING = 5;

	/**
	 * The number of structural features of the '<em>Pt Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Transition
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TYPE = NODE__TYPE;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Marking
	 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
	 * @generated
	 */
	public static final int MARKING = 4;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING__PLACES = 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceReference
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
	 * @generated
	 */
	public static final int PLACE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Place Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.RefMarkedPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
	 * @generated
	 */
	public static final int REF_MARKED_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__PLACE = PLACE_REFERENCE__PLACE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__TOKEN = PLACE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Marked Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE_FEATURE_COUNT = PLACE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Annotation
	 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
	 * @generated
	 */
	public static final int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Arc
	 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
	 * @generated
	 */
	public static final int ARC = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
	 * @generated
	 */
	public static final int ARC_TO_PLACE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransition
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.TransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
	 * @generated
	 */
	public static final int TRANSITION_EXT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__ANNOTATION = TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__INCOMING = TRANSITION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__OUTGOING = TRANSITION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__TYPE = TRANSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MIN_TIME = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__COST = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MAX_TIME = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__CONFIDENTIALITY = TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
	 * @generated
	 */
	public static final int PLACE_EXT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__ANNOTATION = PLACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__INCOMING = PLACE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__OUTGOING = PLACE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TYPE = PLACE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TOKEN = PLACE__TOKEN;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__FINAL_MARKING = PLACE__FINAL_MARKING;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__PROBABILITY = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__IS_START = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT_FEATURE_COUNT = PLACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
	 * @generated
	 */
	public static final int ARC_TO_PLACE_EXT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__SOURCE = ARC_TO_PLACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__TARGET = ARC_TO_PLACE__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__WEIGHT = ARC_TO_PLACE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__PROBABILITY = ARC_TO_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT_FEATURE_COUNT = ARC_TO_PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION_EXT = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__SOURCE = ARC_TO_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__TARGET = ARC_TO_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__WEIGHT = ARC_TO_TRANSITION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__PROBABILITY = ARC_TO_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT_FEATURE_COUNT = ARC_TO_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.NodeType
	 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
	 * @generated
	 */
	public static final int NODE_TYPE = 15;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Confidentiality
	 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
	 * @generated
	 */
	public static final int CONFIDENTIALITY = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetEClass = null;

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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refMarkedPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityEEnum = null;

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
	 * @see ptnetLoLA.PtnetLoLAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetLoLAPackage()
	{
		super(eNS_URI, PtnetLoLAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PtnetLoLAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetLoLAPackage init()
	{
		if (isInited) return (PtnetLoLAPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetLoLAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPtnetLoLAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PtnetLoLAPackage thePtnetLoLAPackage = registeredPtnetLoLAPackage instanceof PtnetLoLAPackage ? (PtnetLoLAPackage)registeredPtnetLoLAPackage : new PtnetLoLAPackage();

		isInited = true;

		// Create package meta-data objects
		thePtnetLoLAPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetLoLAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetLoLAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetLoLAPackage.eNS_URI, thePtnetLoLAPackage);
		return thePtnetLoLAPackage;
	}


	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see ptnetLoLA.Place
	 * @generated
	 */
	public EClass getPlace()
	{
		return placeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_Token()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Marking</em>'.
	 * @see ptnetLoLA.Place#getFinalMarking()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_FinalMarking()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PtNet <em>Pt Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pt Net</em>'.
	 * @see ptnetLoLA.PtNet
	 * @generated
	 */
	public EClass getPtNet()
	{
		return ptNetEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.PtNet#getPlaces()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Places()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ptnetLoLA.PtNet#getTransitions()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Transitions()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see ptnetLoLA.PtNet#getInitialMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_InitialMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.PtNet#getAnnotation()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Annotation()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see ptnetLoLA.PtNet#getArcs()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Arcs()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Marking</em>'.
	 * @see ptnetLoLA.PtNet#getFinalMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_FinalMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ptnetLoLA.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ptnetLoLA.Node
	 * @generated
	 */
	public EClass getNode()
	{
		return nodeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ptnetLoLA.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Name()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.Node#getAnnotation()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Annotation()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see ptnetLoLA.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Incoming()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see ptnetLoLA.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Outgoing()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ptnetLoLA.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Type()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see ptnetLoLA.Marking
	 * @generated
	 */
	public EClass getMarking()
	{
		return markingEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.Marking#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.Marking#getPlaces()
	 * @see #getMarking()
	 * @generated
	 */
	public EReference getMarking_Places()
	{
		return (EReference)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Reference</em>'.
	 * @see ptnetLoLA.PlaceReference
	 * @generated
	 */
	public EClass getPlaceReference()
	{
		return placeReferenceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.PlaceReference#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ptnetLoLA.PlaceReference#getPlace()
	 * @see #getPlaceReference()
	 * @generated
	 */
	public EReference getPlaceReference_Place()
	{
		return (EReference)placeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Marked Place</em>'.
	 * @see ptnetLoLA.RefMarkedPlace
	 * @generated
	 */
	public EClass getRefMarkedPlace()
	{
		return refMarkedPlaceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.RefMarkedPlace#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.RefMarkedPlace#getToken()
	 * @see #getRefMarkedPlace()
	 * @generated
	 */
	public EAttribute getRefMarkedPlace_Token()
	{
		return (EAttribute)refMarkedPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ptnetLoLA.Annotation
	 * @generated
	 */
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ptnetLoLA.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	public EAttribute getAnnotation_Text()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see ptnetLoLA.Arc
	 * @generated
	 */
	public EClass getArc()
	{
		return arcEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ptnetLoLA.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Source()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ptnetLoLA.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Target()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ptnetLoLA.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	public EAttribute getArc_Weight()
	{
		return (EAttribute)arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place</em>'.
	 * @see ptnetLoLA.ArcToPlace
	 * @generated
	 */
	public EClass getArcToPlace()
	{
		return arcToPlaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition</em>'.
	 * @see ptnetLoLA.ArcToTransition
	 * @generated
	 */
	public EClass getArcToTransition()
	{
		return arcToTransitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Ext</em>'.
	 * @see ptnetLoLA.TransitionExt
	 * @generated
	 */
	public EClass getTransitionExt()
	{
		return transitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.TransitionExt#getProbability()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Probability()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMinTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MinTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see ptnetLoLA.TransitionExt#getCost()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Cost()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMaxTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MaxTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.TransitionExt#getConfidentiality()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Confidentiality()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Ext</em>'.
	 * @see ptnetLoLA.PlaceExt
	 * @generated
	 */
	public EClass getPlaceExt()
	{
		return placeExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.PlaceExt#getProbability()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_Probability()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see ptnetLoLA.PlaceExt#isIsStart()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_IsStart()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place Ext</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @generated
	 */
	public EClass getArcToPlaceExt()
	{
		return arcToPlaceExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToPlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt#getProbability()
	 * @see #getArcToPlaceExt()
	 * @generated
	 */
	public EAttribute getArcToPlaceExt_Probability()
	{
		return (EAttribute)arcToPlaceExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition Ext</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @generated
	 */
	public EClass getArcToTransitionExt()
	{
		return arcToTransitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToTransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt#getProbability()
	 * @see #getArcToTransitionExt()
	 * @generated
	 */
	public EAttribute getArcToTransitionExt_Probability()
	{
		return (EAttribute)arcToTransitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see ptnetLoLA.NodeType
	 * @generated
	 */
	public EEnum getNodeType()
	{
		return nodeTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.Confidentiality
	 * @generated
	 */
	public EEnum getConfidentiality()
	{
		return confidentialityEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PtnetLoLAFactory getPtnetLoLAFactory()
	{
		return (PtnetLoLAFactory)getEFactoryInstance();
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
		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__TOKEN);
		createEAttribute(placeEClass, PLACE__FINAL_MARKING);

		ptNetEClass = createEClass(PT_NET);
		createEReference(ptNetEClass, PT_NET__PLACES);
		createEReference(ptNetEClass, PT_NET__TRANSITIONS);
		createEReference(ptNetEClass, PT_NET__INITIAL_MARKING);
		createEReference(ptNetEClass, PT_NET__ANNOTATION);
		createEReference(ptNetEClass, PT_NET__ARCS);
		createEReference(ptNetEClass, PT_NET__FINAL_MARKING);

		transitionEClass = createEClass(TRANSITION);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__ANNOTATION);
		createEReference(nodeEClass, NODE__INCOMING);
		createEReference(nodeEClass, NODE__OUTGOING);
		createEAttribute(nodeEClass, NODE__TYPE);

		markingEClass = createEClass(MARKING);
		createEReference(markingEClass, MARKING__PLACES);

		placeReferenceEClass = createEClass(PLACE_REFERENCE);
		createEReference(placeReferenceEClass, PLACE_REFERENCE__PLACE);

		refMarkedPlaceEClass = createEClass(REF_MARKED_PLACE);
		createEAttribute(refMarkedPlaceEClass, REF_MARKED_PLACE__TOKEN);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__TEXT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);
		createEAttribute(arcEClass, ARC__WEIGHT);

		arcToPlaceEClass = createEClass(ARC_TO_PLACE);

		arcToTransitionEClass = createEClass(ARC_TO_TRANSITION);

		transitionExtEClass = createEClass(TRANSITION_EXT);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__PROBABILITY);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MIN_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__COST);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MAX_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__CONFIDENTIALITY);

		placeExtEClass = createEClass(PLACE_EXT);
		createEAttribute(placeExtEClass, PLACE_EXT__PROBABILITY);
		createEAttribute(placeExtEClass, PLACE_EXT__IS_START);

		arcToPlaceExtEClass = createEClass(ARC_TO_PLACE_EXT);
		createEAttribute(arcToPlaceExtEClass, ARC_TO_PLACE_EXT__PROBABILITY);

		arcToTransitionExtEClass = createEClass(ARC_TO_TRANSITION_EXT);
		createEAttribute(arcToTransitionExtEClass, ARC_TO_TRANSITION_EXT__PROBABILITY);

		// Create enums
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		confidentialityEEnum = createEEnum(CONFIDENTIALITY);
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
		placeEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getNode());
		refMarkedPlaceEClass.getESuperTypes().add(this.getPlaceReference());
		arcToPlaceEClass.getESuperTypes().add(this.getArc());
		arcToTransitionEClass.getESuperTypes().add(this.getArc());
		transitionExtEClass.getESuperTypes().add(this.getTransition());
		placeExtEClass.getESuperTypes().add(this.getPlace());
		arcToPlaceExtEClass.getESuperTypes().add(this.getArcToPlace());
		arcToTransitionExtEClass.getESuperTypes().add(this.getArcToTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Token(), ecorePackage.getEInt(), "token", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_FinalMarking(), ecorePackage.getEInt(), "finalMarking", "0", 1, 1, Place.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ptNetEClass, PtNet.class, "PtNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPtNet_Places(), this.getPlace(), null, "places", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_InitialMarking(), this.getMarking(), null, "initialMarking", null, 1, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Arcs(), this.getArc(), null, "arcs", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_FinalMarking(), this.getMarking(), null, "finalMarking", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Incoming(), this.getArc(), this.getArc_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Outgoing(), this.getArc(), this.getArc_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type(), this.getNodeType(), "type", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarking_Places(), this.getRefMarkedPlace(), null, "places", null, 0, -1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeReferenceEClass, PlaceReference.class, "PlaceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceReference_Place(), this.getPlace(), null, "place", null, 1, 1, PlaceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refMarkedPlaceEClass, RefMarkedPlace.class, "RefMarkedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefMarkedPlace_Token(), ecorePackage.getEInt(), "token", "1", 1, 1, RefMarkedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_Weight(), ecorePackage.getEInt(), "weight", "1", 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceEClass, ArcToPlace.class, "ArcToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcToTransitionEClass, ArcToTransition.class, "ArcToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionExtEClass, TransitionExt.class, "TransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MinTime(), ecorePackage.getEInt(), "minTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Cost(), ecorePackage.getEDouble(), "cost", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MaxTime(), ecorePackage.getEInt(), "maxTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Confidentiality(), this.getConfidentiality(), "confidentiality", null, 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeExtEClass, PlaceExt.class, "PlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceExt_IsStart(), ecorePackage.getEBoolean(), "isStart", "False", 1, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceExtEClass, ArcToPlaceExt.class, "ArcToPlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToPlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToTransitionExtEClass, ArcToTransitionExt.class, "ArcToTransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToTransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.INTERNAL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.OUTPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INOUT);

		initEEnum(confidentialityEEnum, Confidentiality.class, "Confidentiality");
		addEEnumLiteral(confidentialityEEnum, Confidentiality.UNKNOWN);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.LOW);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.HIGH);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Place
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
		 * @generated
		 */
		public static final EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__FINAL_MARKING = eINSTANCE.getPlace_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PtNet
		 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
		 * @generated
		 */
		public static final EClass PT_NET = eINSTANCE.getPtNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__PLACES = eINSTANCE.getPtNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__TRANSITIONS = eINSTANCE.getPtNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__INITIAL_MARKING = eINSTANCE.getPtNet_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ANNOTATION = eINSTANCE.getPtNet_Annotation();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ARCS = eINSTANCE.getPtNet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__FINAL_MARKING = eINSTANCE.getPtNet_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Transition
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Node
		 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
		 * @generated
		 */
		public static final EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__ANNOTATION = eINSTANCE.getNode_Annotation();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Marking
		 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
		 * @generated
		 */
		public static final EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MARKING__PLACES = eINSTANCE.getMarking_Places();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceReference
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
		 * @generated
		 */
		public static final EClass PLACE_REFERENCE = eINSTANCE.getPlaceReference();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLACE_REFERENCE__PLACE = eINSTANCE.getPlaceReference_Place();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.RefMarkedPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
		 * @generated
		 */
		public static final EClass REF_MARKED_PLACE = eINSTANCE.getRefMarkedPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REF_MARKED_PLACE__TOKEN = eINSTANCE.getRefMarkedPlace_Token();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Annotation
		 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
		 * @generated
		 */
		public static final EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Arc
		 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
		 * @generated
		 */
		public static final EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE = eINSTANCE.getArcToPlace();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransition
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION = eINSTANCE.getArcToTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.TransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
		 * @generated
		 */
		public static final EClass TRANSITION_EXT = eINSTANCE.getTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__PROBABILITY = eINSTANCE.getTransitionExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MIN_TIME = eINSTANCE.getTransitionExt_MinTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__COST = eINSTANCE.getTransitionExt_Cost();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MAX_TIME = eINSTANCE.getTransitionExt_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__CONFIDENTIALITY = eINSTANCE.getTransitionExt_Confidentiality();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
		 * @generated
		 */
		public static final EClass PLACE_EXT = eINSTANCE.getPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__PROBABILITY = eINSTANCE.getPlaceExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__IS_START = eINSTANCE.getPlaceExt_IsStart();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE_EXT = eINSTANCE.getArcToPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_PLACE_EXT__PROBABILITY = eINSTANCE.getArcToPlaceExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION_EXT = eINSTANCE.getArcToTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_TRANSITION_EXT__PROBABILITY = eINSTANCE.getArcToTransitionExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.NodeType
		 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
		 * @generated
		 */
		public static final EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Confidentiality
		 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
		 * @generated
		 */
		public static final EEnum CONFIDENTIALITY = eINSTANCE.getConfidentiality();

	}

} //PtnetLoLAPackage
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ptnetLoLA.PtnetLoLAFactory
 * @model kind="package"
 * @generated
 */
public class PtnetLoLAPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ptnetLoLA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.informatik.hu-berlin.de/top/tools/editors/petrinets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ptnetLoLA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PtnetLoLAPackage eINSTANCE = ptnetLoLA.PtnetLoLAPackage.init();

	/**
	 * The meta object id for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Node
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
	 * @generated
	 */
	public static final int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Place
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
	 * @generated
	 */
	public static final int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TOKEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__FINAL_MARKING = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PtNet
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
	 * @generated
	 */
	public static final int PT_NET = 1;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__INITIAL_MARKING = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ARCS = 4;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__FINAL_MARKING = 5;

	/**
	 * The number of structural features of the '<em>Pt Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Transition
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TYPE = NODE__TYPE;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Marking
	 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
	 * @generated
	 */
	public static final int MARKING = 4;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING__PLACES = 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceReference
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
	 * @generated
	 */
	public static final int PLACE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Place Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.RefMarkedPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
	 * @generated
	 */
	public static final int REF_MARKED_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__PLACE = PLACE_REFERENCE__PLACE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__TOKEN = PLACE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Marked Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE_FEATURE_COUNT = PLACE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Annotation
	 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
	 * @generated
	 */
	public static final int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Arc
	 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
	 * @generated
	 */
	public static final int ARC = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
	 * @generated
	 */
	public static final int ARC_TO_PLACE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransition
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.TransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
	 * @generated
	 */
	public static final int TRANSITION_EXT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__ANNOTATION = TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__INCOMING = TRANSITION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__OUTGOING = TRANSITION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__TYPE = TRANSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MIN_TIME = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__COST = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MAX_TIME = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__CONFIDENTIALITY = TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
	 * @generated
	 */
	public static final int PLACE_EXT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__ANNOTATION = PLACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__INCOMING = PLACE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__OUTGOING = PLACE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TYPE = PLACE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TOKEN = PLACE__TOKEN;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__FINAL_MARKING = PLACE__FINAL_MARKING;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__PROBABILITY = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__IS_START = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT_FEATURE_COUNT = PLACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
	 * @generated
	 */
	public static final int ARC_TO_PLACE_EXT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__SOURCE = ARC_TO_PLACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__TARGET = ARC_TO_PLACE__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__WEIGHT = ARC_TO_PLACE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__PROBABILITY = ARC_TO_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT_FEATURE_COUNT = ARC_TO_PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION_EXT = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__SOURCE = ARC_TO_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__TARGET = ARC_TO_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__WEIGHT = ARC_TO_TRANSITION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__PROBABILITY = ARC_TO_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT_FEATURE_COUNT = ARC_TO_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.NodeType
	 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
	 * @generated
	 */
	public static final int NODE_TYPE = 15;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Confidentiality
	 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
	 * @generated
	 */
	public static final int CONFIDENTIALITY = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetEClass = null;

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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refMarkedPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityEEnum = null;

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
	 * @see ptnetLoLA.PtnetLoLAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetLoLAPackage()
	{
		super(eNS_URI, PtnetLoLAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PtnetLoLAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetLoLAPackage init()
	{
		if (isInited) return (PtnetLoLAPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetLoLAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPtnetLoLAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PtnetLoLAPackage thePtnetLoLAPackage = registeredPtnetLoLAPackage instanceof PtnetLoLAPackage ? (PtnetLoLAPackage)registeredPtnetLoLAPackage : new PtnetLoLAPackage();

		isInited = true;

		// Create package meta-data objects
		thePtnetLoLAPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetLoLAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetLoLAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetLoLAPackage.eNS_URI, thePtnetLoLAPackage);
		return thePtnetLoLAPackage;
	}


	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see ptnetLoLA.Place
	 * @generated
	 */
	public EClass getPlace()
	{
		return placeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_Token()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Marking</em>'.
	 * @see ptnetLoLA.Place#getFinalMarking()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_FinalMarking()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PtNet <em>Pt Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pt Net</em>'.
	 * @see ptnetLoLA.PtNet
	 * @generated
	 */
	public EClass getPtNet()
	{
		return ptNetEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.PtNet#getPlaces()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Places()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ptnetLoLA.PtNet#getTransitions()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Transitions()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see ptnetLoLA.PtNet#getInitialMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_InitialMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.PtNet#getAnnotation()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Annotation()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see ptnetLoLA.PtNet#getArcs()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Arcs()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Marking</em>'.
	 * @see ptnetLoLA.PtNet#getFinalMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_FinalMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ptnetLoLA.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ptnetLoLA.Node
	 * @generated
	 */
	public EClass getNode()
	{
		return nodeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ptnetLoLA.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Name()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.Node#getAnnotation()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Annotation()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see ptnetLoLA.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Incoming()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see ptnetLoLA.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Outgoing()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ptnetLoLA.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Type()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see ptnetLoLA.Marking
	 * @generated
	 */
	public EClass getMarking()
	{
		return markingEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.Marking#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.Marking#getPlaces()
	 * @see #getMarking()
	 * @generated
	 */
	public EReference getMarking_Places()
	{
		return (EReference)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Reference</em>'.
	 * @see ptnetLoLA.PlaceReference
	 * @generated
	 */
	public EClass getPlaceReference()
	{
		return placeReferenceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.PlaceReference#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ptnetLoLA.PlaceReference#getPlace()
	 * @see #getPlaceReference()
	 * @generated
	 */
	public EReference getPlaceReference_Place()
	{
		return (EReference)placeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Marked Place</em>'.
	 * @see ptnetLoLA.RefMarkedPlace
	 * @generated
	 */
	public EClass getRefMarkedPlace()
	{
		return refMarkedPlaceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.RefMarkedPlace#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.RefMarkedPlace#getToken()
	 * @see #getRefMarkedPlace()
	 * @generated
	 */
	public EAttribute getRefMarkedPlace_Token()
	{
		return (EAttribute)refMarkedPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ptnetLoLA.Annotation
	 * @generated
	 */
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ptnetLoLA.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	public EAttribute getAnnotation_Text()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see ptnetLoLA.Arc
	 * @generated
	 */
	public EClass getArc()
	{
		return arcEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ptnetLoLA.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Source()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ptnetLoLA.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Target()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ptnetLoLA.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	public EAttribute getArc_Weight()
	{
		return (EAttribute)arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place</em>'.
	 * @see ptnetLoLA.ArcToPlace
	 * @generated
	 */
	public EClass getArcToPlace()
	{
		return arcToPlaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition</em>'.
	 * @see ptnetLoLA.ArcToTransition
	 * @generated
	 */
	public EClass getArcToTransition()
	{
		return arcToTransitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Ext</em>'.
	 * @see ptnetLoLA.TransitionExt
	 * @generated
	 */
	public EClass getTransitionExt()
	{
		return transitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.TransitionExt#getProbability()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Probability()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMinTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MinTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see ptnetLoLA.TransitionExt#getCost()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Cost()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMaxTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MaxTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.TransitionExt#getConfidentiality()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Confidentiality()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Ext</em>'.
	 * @see ptnetLoLA.PlaceExt
	 * @generated
	 */
	public EClass getPlaceExt()
	{
		return placeExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.PlaceExt#getProbability()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_Probability()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see ptnetLoLA.PlaceExt#isIsStart()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_IsStart()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place Ext</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @generated
	 */
	public EClass getArcToPlaceExt()
	{
		return arcToPlaceExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToPlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt#getProbability()
	 * @see #getArcToPlaceExt()
	 * @generated
	 */
	public EAttribute getArcToPlaceExt_Probability()
	{
		return (EAttribute)arcToPlaceExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition Ext</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @generated
	 */
	public EClass getArcToTransitionExt()
	{
		return arcToTransitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToTransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt#getProbability()
	 * @see #getArcToTransitionExt()
	 * @generated
	 */
	public EAttribute getArcToTransitionExt_Probability()
	{
		return (EAttribute)arcToTransitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see ptnetLoLA.NodeType
	 * @generated
	 */
	public EEnum getNodeType()
	{
		return nodeTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.Confidentiality
	 * @generated
	 */
	public EEnum getConfidentiality()
	{
		return confidentialityEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PtnetLoLAFactory getPtnetLoLAFactory()
	{
		return (PtnetLoLAFactory)getEFactoryInstance();
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
		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__TOKEN);
		createEAttribute(placeEClass, PLACE__FINAL_MARKING);

		ptNetEClass = createEClass(PT_NET);
		createEReference(ptNetEClass, PT_NET__PLACES);
		createEReference(ptNetEClass, PT_NET__TRANSITIONS);
		createEReference(ptNetEClass, PT_NET__INITIAL_MARKING);
		createEReference(ptNetEClass, PT_NET__ANNOTATION);
		createEReference(ptNetEClass, PT_NET__ARCS);
		createEReference(ptNetEClass, PT_NET__FINAL_MARKING);

		transitionEClass = createEClass(TRANSITION);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__ANNOTATION);
		createEReference(nodeEClass, NODE__INCOMING);
		createEReference(nodeEClass, NODE__OUTGOING);
		createEAttribute(nodeEClass, NODE__TYPE);

		markingEClass = createEClass(MARKING);
		createEReference(markingEClass, MARKING__PLACES);

		placeReferenceEClass = createEClass(PLACE_REFERENCE);
		createEReference(placeReferenceEClass, PLACE_REFERENCE__PLACE);

		refMarkedPlaceEClass = createEClass(REF_MARKED_PLACE);
		createEAttribute(refMarkedPlaceEClass, REF_MARKED_PLACE__TOKEN);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__TEXT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);
		createEAttribute(arcEClass, ARC__WEIGHT);

		arcToPlaceEClass = createEClass(ARC_TO_PLACE);

		arcToTransitionEClass = createEClass(ARC_TO_TRANSITION);

		transitionExtEClass = createEClass(TRANSITION_EXT);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__PROBABILITY);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MIN_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__COST);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MAX_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__CONFIDENTIALITY);

		placeExtEClass = createEClass(PLACE_EXT);
		createEAttribute(placeExtEClass, PLACE_EXT__PROBABILITY);
		createEAttribute(placeExtEClass, PLACE_EXT__IS_START);

		arcToPlaceExtEClass = createEClass(ARC_TO_PLACE_EXT);
		createEAttribute(arcToPlaceExtEClass, ARC_TO_PLACE_EXT__PROBABILITY);

		arcToTransitionExtEClass = createEClass(ARC_TO_TRANSITION_EXT);
		createEAttribute(arcToTransitionExtEClass, ARC_TO_TRANSITION_EXT__PROBABILITY);

		// Create enums
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		confidentialityEEnum = createEEnum(CONFIDENTIALITY);
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
		placeEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getNode());
		refMarkedPlaceEClass.getESuperTypes().add(this.getPlaceReference());
		arcToPlaceEClass.getESuperTypes().add(this.getArc());
		arcToTransitionEClass.getESuperTypes().add(this.getArc());
		transitionExtEClass.getESuperTypes().add(this.getTransition());
		placeExtEClass.getESuperTypes().add(this.getPlace());
		arcToPlaceExtEClass.getESuperTypes().add(this.getArcToPlace());
		arcToTransitionExtEClass.getESuperTypes().add(this.getArcToTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Token(), ecorePackage.getEInt(), "token", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_FinalMarking(), ecorePackage.getEInt(), "finalMarking", "0", 1, 1, Place.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ptNetEClass, PtNet.class, "PtNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPtNet_Places(), this.getPlace(), null, "places", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_InitialMarking(), this.getMarking(), null, "initialMarking", null, 1, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Arcs(), this.getArc(), null, "arcs", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_FinalMarking(), this.getMarking(), null, "finalMarking", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Incoming(), this.getArc(), this.getArc_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Outgoing(), this.getArc(), this.getArc_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type(), this.getNodeType(), "type", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarking_Places(), this.getRefMarkedPlace(), null, "places", null, 0, -1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeReferenceEClass, PlaceReference.class, "PlaceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceReference_Place(), this.getPlace(), null, "place", null, 1, 1, PlaceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refMarkedPlaceEClass, RefMarkedPlace.class, "RefMarkedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefMarkedPlace_Token(), ecorePackage.getEInt(), "token", "1", 1, 1, RefMarkedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_Weight(), ecorePackage.getEInt(), "weight", "1", 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceEClass, ArcToPlace.class, "ArcToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcToTransitionEClass, ArcToTransition.class, "ArcToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionExtEClass, TransitionExt.class, "TransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MinTime(), ecorePackage.getEInt(), "minTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Cost(), ecorePackage.getEDouble(), "cost", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MaxTime(), ecorePackage.getEInt(), "maxTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Confidentiality(), this.getConfidentiality(), "confidentiality", null, 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeExtEClass, PlaceExt.class, "PlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceExt_IsStart(), ecorePackage.getEBoolean(), "isStart", "False", 1, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceExtEClass, ArcToPlaceExt.class, "ArcToPlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToPlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToTransitionExtEClass, ArcToTransitionExt.class, "ArcToTransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToTransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.INTERNAL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.OUTPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INOUT);

		initEEnum(confidentialityEEnum, Confidentiality.class, "Confidentiality");
		addEEnumLiteral(confidentialityEEnum, Confidentiality.UNKNOWN);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.LOW);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.HIGH);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Place
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
		 * @generated
		 */
		public static final EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__FINAL_MARKING = eINSTANCE.getPlace_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PtNet
		 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
		 * @generated
		 */
		public static final EClass PT_NET = eINSTANCE.getPtNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__PLACES = eINSTANCE.getPtNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__TRANSITIONS = eINSTANCE.getPtNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__INITIAL_MARKING = eINSTANCE.getPtNet_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ANNOTATION = eINSTANCE.getPtNet_Annotation();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ARCS = eINSTANCE.getPtNet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__FINAL_MARKING = eINSTANCE.getPtNet_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Transition
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Node
		 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
		 * @generated
		 */
		public static final EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__ANNOTATION = eINSTANCE.getNode_Annotation();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Marking
		 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
		 * @generated
		 */
		public static final EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MARKING__PLACES = eINSTANCE.getMarking_Places();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceReference
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
		 * @generated
		 */
		public static final EClass PLACE_REFERENCE = eINSTANCE.getPlaceReference();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLACE_REFERENCE__PLACE = eINSTANCE.getPlaceReference_Place();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.RefMarkedPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
		 * @generated
		 */
		public static final EClass REF_MARKED_PLACE = eINSTANCE.getRefMarkedPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REF_MARKED_PLACE__TOKEN = eINSTANCE.getRefMarkedPlace_Token();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Annotation
		 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
		 * @generated
		 */
		public static final EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Arc
		 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
		 * @generated
		 */
		public static final EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE = eINSTANCE.getArcToPlace();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransition
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION = eINSTANCE.getArcToTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.TransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
		 * @generated
		 */
		public static final EClass TRANSITION_EXT = eINSTANCE.getTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__PROBABILITY = eINSTANCE.getTransitionExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MIN_TIME = eINSTANCE.getTransitionExt_MinTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__COST = eINSTANCE.getTransitionExt_Cost();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MAX_TIME = eINSTANCE.getTransitionExt_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__CONFIDENTIALITY = eINSTANCE.getTransitionExt_Confidentiality();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
		 * @generated
		 */
		public static final EClass PLACE_EXT = eINSTANCE.getPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__PROBABILITY = eINSTANCE.getPlaceExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__IS_START = eINSTANCE.getPlaceExt_IsStart();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE_EXT = eINSTANCE.getArcToPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_PLACE_EXT__PROBABILITY = eINSTANCE.getArcToPlaceExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION_EXT = eINSTANCE.getArcToTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_TRANSITION_EXT__PROBABILITY = eINSTANCE.getArcToTransitionExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.NodeType
		 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
		 * @generated
		 */
		public static final EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Confidentiality
		 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
		 * @generated
		 */
		public static final EEnum CONFIDENTIALITY = eINSTANCE.getConfidentiality();

	}

} //PtnetLoLAPackage
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ptnetLoLA.PtnetLoLAFactory
 * @model kind="package"
 * @generated
 */
public class PtnetLoLAPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ptnetLoLA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.informatik.hu-berlin.de/top/tools/editors/petrinets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ptnetLoLA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PtnetLoLAPackage eINSTANCE = ptnetLoLA.PtnetLoLAPackage.init();

	/**
	 * The meta object id for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Node
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
	 * @generated
	 */
	public static final int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Place
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
	 * @generated
	 */
	public static final int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__TOKEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE__FINAL_MARKING = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PtNet
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
	 * @generated
	 */
	public static final int PT_NET = 1;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__INITIAL_MARKING = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__ARCS = 4;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET__FINAL_MARKING = 5;

	/**
	 * The number of structural features of the '<em>Pt Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PT_NET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Transition
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
	 * @generated
	 */
	public static final int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__ANNOTATION = NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION__TYPE = NODE__TYPE;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Marking
	 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
	 * @generated
	 */
	public static final int MARKING = 4;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING__PLACES = 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceReference
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
	 * @generated
	 */
	public static final int PLACE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Place Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.RefMarkedPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
	 * @generated
	 */
	public static final int REF_MARKED_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__PLACE = PLACE_REFERENCE__PLACE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE__TOKEN = PLACE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Marked Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REF_MARKED_PLACE_FEATURE_COUNT = PLACE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Annotation
	 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
	 * @generated
	 */
	public static final int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Arc
	 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
	 * @generated
	 */
	public static final int ARC = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlace
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
	 * @generated
	 */
	public static final int ARC_TO_PLACE = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransition
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__SOURCE = ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__TARGET = ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION__WEIGHT = ARC__WEIGHT;

	/**
	 * The number of structural features of the '<em>Arc To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.TransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
	 * @generated
	 */
	public static final int TRANSITION_EXT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__ANNOTATION = TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__INCOMING = TRANSITION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__OUTGOING = TRANSITION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__TYPE = TRANSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MIN_TIME = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__COST = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__MAX_TIME = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT__CONFIDENTIALITY = TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_EXT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.PlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
	 * @generated
	 */
	public static final int PLACE_EXT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__ANNOTATION = PLACE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__INCOMING = PLACE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__OUTGOING = PLACE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TYPE = PLACE__TYPE;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__TOKEN = PLACE__TOKEN;

	/**
	 * The feature id for the '<em><b>Final Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__FINAL_MARKING = PLACE__FINAL_MARKING;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__PROBABILITY = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT__IS_START = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_EXT_FEATURE_COUNT = PLACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
	 * @generated
	 */
	public static final int ARC_TO_PLACE_EXT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__SOURCE = ARC_TO_PLACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__TARGET = ARC_TO_PLACE__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__WEIGHT = ARC_TO_PLACE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT__PROBABILITY = ARC_TO_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Place Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_PLACE_EXT_FEATURE_COUNT = ARC_TO_PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
	 * @generated
	 */
	public static final int ARC_TO_TRANSITION_EXT = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__SOURCE = ARC_TO_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__TARGET = ARC_TO_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__WEIGHT = ARC_TO_TRANSITION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT__PROBABILITY = ARC_TO_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc To Transition Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARC_TO_TRANSITION_EXT_FEATURE_COUNT = ARC_TO_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.NodeType
	 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
	 * @generated
	 */
	public static final int NODE_TYPE = 15;

	/**
	 * The meta object id for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetLoLA.Confidentiality
	 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
	 * @generated
	 */
	public static final int CONFIDENTIALITY = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetEClass = null;

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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refMarkedPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToPlaceExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcToTransitionExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityEEnum = null;

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
	 * @see ptnetLoLA.PtnetLoLAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetLoLAPackage()
	{
		super(eNS_URI, PtnetLoLAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PtnetLoLAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetLoLAPackage init()
	{
		if (isInited) return (PtnetLoLAPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetLoLAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPtnetLoLAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PtnetLoLAPackage thePtnetLoLAPackage = registeredPtnetLoLAPackage instanceof PtnetLoLAPackage ? (PtnetLoLAPackage)registeredPtnetLoLAPackage : new PtnetLoLAPackage();

		isInited = true;

		// Create package meta-data objects
		thePtnetLoLAPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetLoLAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetLoLAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetLoLAPackage.eNS_URI, thePtnetLoLAPackage);
		return thePtnetLoLAPackage;
	}


	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see ptnetLoLA.Place
	 * @generated
	 */
	public EClass getPlace()
	{
		return placeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_Token()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Marking</em>'.
	 * @see ptnetLoLA.Place#getFinalMarking()
	 * @see #getPlace()
	 * @generated
	 */
	public EAttribute getPlace_FinalMarking()
	{
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PtNet <em>Pt Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pt Net</em>'.
	 * @see ptnetLoLA.PtNet
	 * @generated
	 */
	public EClass getPtNet()
	{
		return ptNetEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.PtNet#getPlaces()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Places()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ptnetLoLA.PtNet#getTransitions()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Transitions()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Marking</em>'.
	 * @see ptnetLoLA.PtNet#getInitialMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_InitialMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.PtNet#getAnnotation()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Annotation()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see ptnetLoLA.PtNet#getArcs()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_Arcs()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Marking</em>'.
	 * @see ptnetLoLA.PtNet#getFinalMarking()
	 * @see #getPtNet()
	 * @generated
	 */
	public EReference getPtNet_FinalMarking()
	{
		return (EReference)ptNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ptnetLoLA.Transition
	 * @generated
	 */
	public EClass getTransition()
	{
		return transitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ptnetLoLA.Node
	 * @generated
	 */
	public EClass getNode()
	{
		return nodeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ptnetLoLA.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Name()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see ptnetLoLA.Node#getAnnotation()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Annotation()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see ptnetLoLA.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Incoming()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see ptnetLoLA.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	public EReference getNode_Outgoing()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ptnetLoLA.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	public EAttribute getNode_Type()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see ptnetLoLA.Marking
	 * @generated
	 */
	public EClass getMarking()
	{
		return markingEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link ptnetLoLA.Marking#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see ptnetLoLA.Marking#getPlaces()
	 * @see #getMarking()
	 * @generated
	 */
	public EReference getMarking_Places()
	{
		return (EReference)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Reference</em>'.
	 * @see ptnetLoLA.PlaceReference
	 * @generated
	 */
	public EClass getPlaceReference()
	{
		return placeReferenceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.PlaceReference#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ptnetLoLA.PlaceReference#getPlace()
	 * @see #getPlaceReference()
	 * @generated
	 */
	public EReference getPlaceReference_Place()
	{
		return (EReference)placeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Marked Place</em>'.
	 * @see ptnetLoLA.RefMarkedPlace
	 * @generated
	 */
	public EClass getRefMarkedPlace()
	{
		return refMarkedPlaceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.RefMarkedPlace#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ptnetLoLA.RefMarkedPlace#getToken()
	 * @see #getRefMarkedPlace()
	 * @generated
	 */
	public EAttribute getRefMarkedPlace_Token()
	{
		return (EAttribute)refMarkedPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ptnetLoLA.Annotation
	 * @generated
	 */
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ptnetLoLA.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	public EAttribute getAnnotation_Text()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see ptnetLoLA.Arc
	 * @generated
	 */
	public EClass getArc()
	{
		return arcEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ptnetLoLA.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Source()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ptnetLoLA.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	public EReference getArc_Target()
	{
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ptnetLoLA.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	public EAttribute getArc_Weight()
	{
		return (EAttribute)arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place</em>'.
	 * @see ptnetLoLA.ArcToPlace
	 * @generated
	 */
	public EClass getArcToPlace()
	{
		return arcToPlaceEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition</em>'.
	 * @see ptnetLoLA.ArcToTransition
	 * @generated
	 */
	public EClass getArcToTransition()
	{
		return arcToTransitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Ext</em>'.
	 * @see ptnetLoLA.TransitionExt
	 * @generated
	 */
	public EClass getTransitionExt()
	{
		return transitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.TransitionExt#getProbability()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Probability()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMinTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MinTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see ptnetLoLA.TransitionExt#getCost()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Cost()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see ptnetLoLA.TransitionExt#getMaxTime()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_MaxTime()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.TransitionExt#getConfidentiality()
	 * @see #getTransitionExt()
	 * @generated
	 */
	public EAttribute getTransitionExt_Confidentiality()
	{
		return (EAttribute)transitionExtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Ext</em>'.
	 * @see ptnetLoLA.PlaceExt
	 * @generated
	 */
	public EClass getPlaceExt()
	{
		return placeExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.PlaceExt#getProbability()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_Probability()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.PlaceExt#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see ptnetLoLA.PlaceExt#isIsStart()
	 * @see #getPlaceExt()
	 * @generated
	 */
	public EAttribute getPlaceExt_IsStart()
	{
		return (EAttribute)placeExtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Place Ext</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt
	 * @generated
	 */
	public EClass getArcToPlaceExt()
	{
		return arcToPlaceExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToPlaceExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToPlaceExt#getProbability()
	 * @see #getArcToPlaceExt()
	 * @generated
	 */
	public EAttribute getArcToPlaceExt_Probability()
	{
		return (EAttribute)arcToPlaceExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc To Transition Ext</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt
	 * @generated
	 */
	public EClass getArcToTransitionExt()
	{
		return arcToTransitionExtEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link ptnetLoLA.ArcToTransitionExt#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ptnetLoLA.ArcToTransitionExt#getProbability()
	 * @see #getArcToTransitionExt()
	 * @generated
	 */
	public EAttribute getArcToTransitionExt_Probability()
	{
		return (EAttribute)arcToTransitionExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see ptnetLoLA.NodeType
	 * @generated
	 */
	public EEnum getNodeType()
	{
		return nodeTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality</em>'.
	 * @see ptnetLoLA.Confidentiality
	 * @generated
	 */
	public EEnum getConfidentiality()
	{
		return confidentialityEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PtnetLoLAFactory getPtnetLoLAFactory()
	{
		return (PtnetLoLAFactory)getEFactoryInstance();
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
		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__TOKEN);
		createEAttribute(placeEClass, PLACE__FINAL_MARKING);

		ptNetEClass = createEClass(PT_NET);
		createEReference(ptNetEClass, PT_NET__PLACES);
		createEReference(ptNetEClass, PT_NET__TRANSITIONS);
		createEReference(ptNetEClass, PT_NET__INITIAL_MARKING);
		createEReference(ptNetEClass, PT_NET__ANNOTATION);
		createEReference(ptNetEClass, PT_NET__ARCS);
		createEReference(ptNetEClass, PT_NET__FINAL_MARKING);

		transitionEClass = createEClass(TRANSITION);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__ANNOTATION);
		createEReference(nodeEClass, NODE__INCOMING);
		createEReference(nodeEClass, NODE__OUTGOING);
		createEAttribute(nodeEClass, NODE__TYPE);

		markingEClass = createEClass(MARKING);
		createEReference(markingEClass, MARKING__PLACES);

		placeReferenceEClass = createEClass(PLACE_REFERENCE);
		createEReference(placeReferenceEClass, PLACE_REFERENCE__PLACE);

		refMarkedPlaceEClass = createEClass(REF_MARKED_PLACE);
		createEAttribute(refMarkedPlaceEClass, REF_MARKED_PLACE__TOKEN);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__TEXT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);
		createEAttribute(arcEClass, ARC__WEIGHT);

		arcToPlaceEClass = createEClass(ARC_TO_PLACE);

		arcToTransitionEClass = createEClass(ARC_TO_TRANSITION);

		transitionExtEClass = createEClass(TRANSITION_EXT);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__PROBABILITY);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MIN_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__COST);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__MAX_TIME);
		createEAttribute(transitionExtEClass, TRANSITION_EXT__CONFIDENTIALITY);

		placeExtEClass = createEClass(PLACE_EXT);
		createEAttribute(placeExtEClass, PLACE_EXT__PROBABILITY);
		createEAttribute(placeExtEClass, PLACE_EXT__IS_START);

		arcToPlaceExtEClass = createEClass(ARC_TO_PLACE_EXT);
		createEAttribute(arcToPlaceExtEClass, ARC_TO_PLACE_EXT__PROBABILITY);

		arcToTransitionExtEClass = createEClass(ARC_TO_TRANSITION_EXT);
		createEAttribute(arcToTransitionExtEClass, ARC_TO_TRANSITION_EXT__PROBABILITY);

		// Create enums
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		confidentialityEEnum = createEEnum(CONFIDENTIALITY);
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
		placeEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getNode());
		refMarkedPlaceEClass.getESuperTypes().add(this.getPlaceReference());
		arcToPlaceEClass.getESuperTypes().add(this.getArc());
		arcToTransitionEClass.getESuperTypes().add(this.getArc());
		transitionExtEClass.getESuperTypes().add(this.getTransition());
		placeExtEClass.getESuperTypes().add(this.getPlace());
		arcToPlaceExtEClass.getESuperTypes().add(this.getArcToPlace());
		arcToTransitionExtEClass.getESuperTypes().add(this.getArcToTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Token(), ecorePackage.getEInt(), "token", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_FinalMarking(), ecorePackage.getEInt(), "finalMarking", "0", 1, 1, Place.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ptNetEClass, PtNet.class, "PtNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPtNet_Places(), this.getPlace(), null, "places", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_InitialMarking(), this.getMarking(), null, "initialMarking", null, 1, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_Arcs(), this.getArc(), null, "arcs", null, 0, -1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPtNet_FinalMarking(), this.getMarking(), null, "finalMarking", null, 0, 1, PtNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Incoming(), this.getArc(), this.getArc_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Outgoing(), this.getArc(), this.getArc_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type(), this.getNodeType(), "type", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarking_Places(), this.getRefMarkedPlace(), null, "places", null, 0, -1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeReferenceEClass, PlaceReference.class, "PlaceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceReference_Place(), this.getPlace(), null, "place", null, 1, 1, PlaceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refMarkedPlaceEClass, RefMarkedPlace.class, "RefMarkedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefMarkedPlace_Token(), ecorePackage.getEInt(), "token", "1", 1, 1, RefMarkedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_Weight(), ecorePackage.getEInt(), "weight", "1", 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceEClass, ArcToPlace.class, "ArcToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcToTransitionEClass, ArcToTransition.class, "ArcToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionExtEClass, TransitionExt.class, "TransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MinTime(), ecorePackage.getEInt(), "minTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Cost(), ecorePackage.getEDouble(), "cost", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_MaxTime(), ecorePackage.getEInt(), "maxTime", "0", 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionExt_Confidentiality(), this.getConfidentiality(), "confidentiality", null, 0, 1, TransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeExtEClass, PlaceExt.class, "PlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceExt_IsStart(), ecorePackage.getEBoolean(), "isStart", "False", 1, 1, PlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToPlaceExtEClass, ArcToPlaceExt.class, "ArcToPlaceExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToPlaceExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToPlaceExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcToTransitionExtEClass, ArcToTransitionExt.class, "ArcToTransitionExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcToTransitionExt_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1, ArcToTransitionExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.INTERNAL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.OUTPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INOUT);

		initEEnum(confidentialityEEnum, Confidentiality.class, "Confidentiality");
		addEEnumLiteral(confidentialityEEnum, Confidentiality.UNKNOWN);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.LOW);
		addEEnumLiteral(confidentialityEEnum, Confidentiality.HIGH);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link ptnetLoLA.Place <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Place
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlace()
		 * @generated
		 */
		public static final EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE__FINAL_MARKING = eINSTANCE.getPlace_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PtNet <em>Pt Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PtNet
		 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
		 * @generated
		 */
		public static final EClass PT_NET = eINSTANCE.getPtNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__PLACES = eINSTANCE.getPtNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__TRANSITIONS = eINSTANCE.getPtNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__INITIAL_MARKING = eINSTANCE.getPtNet_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ANNOTATION = eINSTANCE.getPtNet_Annotation();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__ARCS = eINSTANCE.getPtNet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Final Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PT_NET__FINAL_MARKING = eINSTANCE.getPtNet_FinalMarking();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Transition
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransition()
		 * @generated
		 */
		public static final EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Node
		 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
		 * @generated
		 */
		public static final EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__ANNOTATION = eINSTANCE.getNode_Annotation();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Marking <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Marking
		 * @see ptnetLoLA.PtnetLoLAPackage#getMarking()
		 * @generated
		 */
		public static final EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MARKING__PLACES = eINSTANCE.getMarking_Places();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceReference <em>Place Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceReference
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceReference()
		 * @generated
		 */
		public static final EClass PLACE_REFERENCE = eINSTANCE.getPlaceReference();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLACE_REFERENCE__PLACE = eINSTANCE.getPlaceReference_Place();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.RefMarkedPlace <em>Ref Marked Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.RefMarkedPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getRefMarkedPlace()
		 * @generated
		 */
		public static final EClass REF_MARKED_PLACE = eINSTANCE.getRefMarkedPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REF_MARKED_PLACE__TOKEN = eINSTANCE.getRefMarkedPlace_Token();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Annotation <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Annotation
		 * @see ptnetLoLA.PtnetLoLAPackage#getAnnotation()
		 * @generated
		 */
		public static final EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Arc <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Arc
		 * @see ptnetLoLA.PtnetLoLAPackage#getArc()
		 * @generated
		 */
		public static final EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlace <em>Arc To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlace
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlace()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE = eINSTANCE.getArcToPlace();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransition <em>Arc To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransition
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransition()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION = eINSTANCE.getArcToTransition();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.TransitionExt <em>Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.TransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
		 * @generated
		 */
		public static final EClass TRANSITION_EXT = eINSTANCE.getTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__PROBABILITY = eINSTANCE.getTransitionExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MIN_TIME = eINSTANCE.getTransitionExt_MinTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__COST = eINSTANCE.getTransitionExt_Cost();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__MAX_TIME = eINSTANCE.getTransitionExt_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSITION_EXT__CONFIDENTIALITY = eINSTANCE.getTransitionExt_Confidentiality();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.PlaceExt <em>Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.PlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getPlaceExt()
		 * @generated
		 */
		public static final EClass PLACE_EXT = eINSTANCE.getPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__PROBABILITY = eINSTANCE.getPlaceExt_Probability();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLACE_EXT__IS_START = eINSTANCE.getPlaceExt_IsStart();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToPlaceExt <em>Arc To Place Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToPlaceExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToPlaceExt()
		 * @generated
		 */
		public static final EClass ARC_TO_PLACE_EXT = eINSTANCE.getArcToPlaceExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_PLACE_EXT__PROBABILITY = eINSTANCE.getArcToPlaceExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.ArcToTransitionExt <em>Arc To Transition Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.ArcToTransitionExt
		 * @see ptnetLoLA.PtnetLoLAPackage#getArcToTransitionExt()
		 * @generated
		 */
		public static final EClass ARC_TO_TRANSITION_EXT = eINSTANCE.getArcToTransitionExt();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARC_TO_TRANSITION_EXT__PROBABILITY = eINSTANCE.getArcToTransitionExt_Probability();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.NodeType
		 * @see ptnetLoLA.PtnetLoLAPackage#getNodeType()
		 * @generated
		 */
		public static final EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link ptnetLoLA.Confidentiality <em>Confidentiality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetLoLA.Confidentiality
		 * @see ptnetLoLA.PtnetLoLAPackage#getConfidentiality()
		 * @generated
		 */
		public static final EEnum CONFIDENTIALITY = eINSTANCE.getConfidentiality();

	}

} //PtnetLoLAPackage
