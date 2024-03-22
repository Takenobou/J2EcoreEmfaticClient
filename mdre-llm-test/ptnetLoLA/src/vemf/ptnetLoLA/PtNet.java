/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pt Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
 * @model
 * @generated
 */
public interface PtNet extends EObject
{
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_InitialMarking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getInitialMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(Marking value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_FinalMarking()
	 * @model containment="true"
	 * @generated
	 */
	Marking getFinalMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	void setFinalMarking(Marking value);

} // PtNet
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pt Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
 * @model
 * @generated
 */
public interface PtNet extends EObject
{
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_InitialMarking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getInitialMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(Marking value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_FinalMarking()
	 * @model containment="true"
	 * @generated
	 */
	Marking getFinalMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	void setFinalMarking(Marking value);

} // PtNet
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pt Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
 * @model
 * @generated
 */
public interface PtNet extends EObject
{
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_InitialMarking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getInitialMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(Marking value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_FinalMarking()
	 * @model containment="true"
	 * @generated
	 */
	Marking getFinalMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	void setFinalMarking(Marking value);

} // PtNet
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pt Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
 * @model
 * @generated
 */
public interface PtNet extends EObject
{
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_InitialMarking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getInitialMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(Marking value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_FinalMarking()
	 * @model containment="true"
	 * @generated
	 */
	Marking getFinalMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	void setFinalMarking(Marking value);

} // PtNet
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pt Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
 * @model
 * @generated
 */
public interface PtNet extends EObject
{
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_InitialMarking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getInitialMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(Marking value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_FinalMarking()
	 * @model containment="true"
	 * @generated
	 */
	Marking getFinalMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	void setFinalMarking(Marking value);

} // PtNet
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pt Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
 * @model
 * @generated
 */
public interface PtNet extends EObject
{
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_InitialMarking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getInitialMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(Marking value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_FinalMarking()
	 * @model containment="true"
	 * @generated
	 */
	Marking getFinalMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	void setFinalMarking(Marking value);

} // PtNet
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pt Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
 * @model
 * @generated
 */
public interface PtNet extends EObject
{
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_InitialMarking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getInitialMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(Marking value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_FinalMarking()
	 * @model containment="true"
	 * @generated
	 */
	Marking getFinalMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	void setFinalMarking(Marking value);

} // PtNet
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pt Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
 * @model
 * @generated
 */
public interface PtNet extends EObject
{
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_InitialMarking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getInitialMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(Marking value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_FinalMarking()
	 * @model containment="true"
	 * @generated
	 */
	Marking getFinalMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	void setFinalMarking(Marking value);

} // PtNet
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pt Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
 * @model
 * @generated
 */
public interface PtNet extends EObject
{
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_InitialMarking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getInitialMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(Marking value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_FinalMarking()
	 * @model containment="true"
	 * @generated
	 */
	Marking getFinalMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	void setFinalMarking(Marking value);

} // PtNet
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pt Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.PtNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet()
 * @model
 * @generated
 */
public interface PtNet extends EObject
{
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_InitialMarking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getInitialMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	void setInitialMarking(Marking value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @see ptnetLoLA.PtnetLoLAPackage#getPtNet_FinalMarking()
	 * @model containment="true"
	 * @generated
	 */
	Marking getFinalMarking();

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	void setFinalMarking(Marking value);

} // PtNet
