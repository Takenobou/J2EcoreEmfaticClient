/**
 */
package ptnetLoLA;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * @extends Object
 * @generated
 */
public class PtNet extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking initialMarking;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getFinalMarking() <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking finalMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtNet()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PtnetLoLAPackage.Literals.PT_NET;
	}

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @generated
	 */
	public List<Place> getPlaces()
	{
		if (places == null)
		{
			places = new BasicInternalEList<Place>(Place.class);
		}
		return places;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @generated
	 */
	public List<Transition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new BasicInternalEList<Transition>(Transition.class);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @generated
	 */
	public Marking getInitialMarking()
	{
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(Marking newInitialMarking, NotificationChain msgs)
	{
		Marking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newInitialMarking the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	public void setInitialMarking(Marking newInitialMarking)
	{
		if (newInitialMarking != initialMarking)
		{
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = initialMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = newInitialMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @generated
	 */
	public Annotation getAnnotation()
	{
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
	{
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAnnotation the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation)
	{
		if (newAnnotation != annotation)
		{
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @generated
	 */
	public List<Arc> getArcs()
	{
		if (arcs == null)
		{
			arcs = new BasicInternalEList<Arc>(Arc.class);
		}
		return arcs;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @generated
	 */
	public Marking getFinalMarking()
	{
		return finalMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalMarking(Marking newFinalMarking, NotificationChain msgs)
	{
		Marking oldFinalMarking = finalMarking;
		finalMarking = newFinalMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(Marking newFinalMarking)
	{
		if (newFinalMarking != finalMarking)
		{
			NotificationChain msgs = null;
			if (finalMarking != null)
				msgs = finalMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			if (newFinalMarking != null)
				msgs = newFinalMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			msgs = basicSetFinalMarking(newFinalMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.PT_NET__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return basicSetFinalMarking(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return getPlaces();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return getTransitions();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return getInitialMarking();
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.PT_NET__ARCS:
				return getArcs();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return getFinalMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)null);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return places != null && !places.isEmpty();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return initialMarking != null;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.PT_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return finalMarking != null;
		}
		return super.eIsSet(featureID);
	}

} // PtNet
/**
 */
package ptnetLoLA;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * @extends Object
 * @generated
 */
public class PtNet extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking initialMarking;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getFinalMarking() <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking finalMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtNet()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PtnetLoLAPackage.Literals.PT_NET;
	}

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @generated
	 */
	public List<Place> getPlaces()
	{
		if (places == null)
		{
			places = new BasicInternalEList<Place>(Place.class);
		}
		return places;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @generated
	 */
	public List<Transition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new BasicInternalEList<Transition>(Transition.class);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @generated
	 */
	public Marking getInitialMarking()
	{
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(Marking newInitialMarking, NotificationChain msgs)
	{
		Marking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newInitialMarking the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	public void setInitialMarking(Marking newInitialMarking)
	{
		if (newInitialMarking != initialMarking)
		{
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = initialMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = newInitialMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @generated
	 */
	public Annotation getAnnotation()
	{
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
	{
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAnnotation the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation)
	{
		if (newAnnotation != annotation)
		{
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @generated
	 */
	public List<Arc> getArcs()
	{
		if (arcs == null)
		{
			arcs = new BasicInternalEList<Arc>(Arc.class);
		}
		return arcs;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @generated
	 */
	public Marking getFinalMarking()
	{
		return finalMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalMarking(Marking newFinalMarking, NotificationChain msgs)
	{
		Marking oldFinalMarking = finalMarking;
		finalMarking = newFinalMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(Marking newFinalMarking)
	{
		if (newFinalMarking != finalMarking)
		{
			NotificationChain msgs = null;
			if (finalMarking != null)
				msgs = finalMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			if (newFinalMarking != null)
				msgs = newFinalMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			msgs = basicSetFinalMarking(newFinalMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.PT_NET__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return basicSetFinalMarking(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return getPlaces();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return getTransitions();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return getInitialMarking();
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.PT_NET__ARCS:
				return getArcs();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return getFinalMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)null);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return places != null && !places.isEmpty();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return initialMarking != null;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.PT_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return finalMarking != null;
		}
		return super.eIsSet(featureID);
	}

} // PtNet
/**
 */
package ptnetLoLA;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * @extends Object
 * @generated
 */
public class PtNet extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking initialMarking;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getFinalMarking() <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking finalMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtNet()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PtnetLoLAPackage.Literals.PT_NET;
	}

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @generated
	 */
	public List<Place> getPlaces()
	{
		if (places == null)
		{
			places = new BasicInternalEList<Place>(Place.class);
		}
		return places;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @generated
	 */
	public List<Transition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new BasicInternalEList<Transition>(Transition.class);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @generated
	 */
	public Marking getInitialMarking()
	{
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(Marking newInitialMarking, NotificationChain msgs)
	{
		Marking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newInitialMarking the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	public void setInitialMarking(Marking newInitialMarking)
	{
		if (newInitialMarking != initialMarking)
		{
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = initialMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = newInitialMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @generated
	 */
	public Annotation getAnnotation()
	{
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
	{
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAnnotation the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation)
	{
		if (newAnnotation != annotation)
		{
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @generated
	 */
	public List<Arc> getArcs()
	{
		if (arcs == null)
		{
			arcs = new BasicInternalEList<Arc>(Arc.class);
		}
		return arcs;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @generated
	 */
	public Marking getFinalMarking()
	{
		return finalMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalMarking(Marking newFinalMarking, NotificationChain msgs)
	{
		Marking oldFinalMarking = finalMarking;
		finalMarking = newFinalMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(Marking newFinalMarking)
	{
		if (newFinalMarking != finalMarking)
		{
			NotificationChain msgs = null;
			if (finalMarking != null)
				msgs = finalMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			if (newFinalMarking != null)
				msgs = newFinalMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			msgs = basicSetFinalMarking(newFinalMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.PT_NET__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return basicSetFinalMarking(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return getPlaces();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return getTransitions();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return getInitialMarking();
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.PT_NET__ARCS:
				return getArcs();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return getFinalMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)null);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return places != null && !places.isEmpty();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return initialMarking != null;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.PT_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return finalMarking != null;
		}
		return super.eIsSet(featureID);
	}

} // PtNet
/**
 */
package ptnetLoLA;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * @extends Object
 * @generated
 */
public class PtNet extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking initialMarking;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getFinalMarking() <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking finalMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtNet()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PtnetLoLAPackage.Literals.PT_NET;
	}

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @generated
	 */
	public List<Place> getPlaces()
	{
		if (places == null)
		{
			places = new BasicInternalEList<Place>(Place.class);
		}
		return places;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @generated
	 */
	public List<Transition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new BasicInternalEList<Transition>(Transition.class);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @generated
	 */
	public Marking getInitialMarking()
	{
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(Marking newInitialMarking, NotificationChain msgs)
	{
		Marking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newInitialMarking the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	public void setInitialMarking(Marking newInitialMarking)
	{
		if (newInitialMarking != initialMarking)
		{
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = initialMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = newInitialMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @generated
	 */
	public Annotation getAnnotation()
	{
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
	{
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAnnotation the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation)
	{
		if (newAnnotation != annotation)
		{
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @generated
	 */
	public List<Arc> getArcs()
	{
		if (arcs == null)
		{
			arcs = new BasicInternalEList<Arc>(Arc.class);
		}
		return arcs;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @generated
	 */
	public Marking getFinalMarking()
	{
		return finalMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalMarking(Marking newFinalMarking, NotificationChain msgs)
	{
		Marking oldFinalMarking = finalMarking;
		finalMarking = newFinalMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(Marking newFinalMarking)
	{
		if (newFinalMarking != finalMarking)
		{
			NotificationChain msgs = null;
			if (finalMarking != null)
				msgs = finalMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			if (newFinalMarking != null)
				msgs = newFinalMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			msgs = basicSetFinalMarking(newFinalMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.PT_NET__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return basicSetFinalMarking(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return getPlaces();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return getTransitions();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return getInitialMarking();
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.PT_NET__ARCS:
				return getArcs();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return getFinalMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)null);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return places != null && !places.isEmpty();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return initialMarking != null;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.PT_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return finalMarking != null;
		}
		return super.eIsSet(featureID);
	}

} // PtNet
/**
 */
package ptnetLoLA;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * @extends Object
 * @generated
 */
public class PtNet extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking initialMarking;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getFinalMarking() <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking finalMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtNet()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PtnetLoLAPackage.Literals.PT_NET;
	}

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @generated
	 */
	public List<Place> getPlaces()
	{
		if (places == null)
		{
			places = new BasicInternalEList<Place>(Place.class);
		}
		return places;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @generated
	 */
	public List<Transition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new BasicInternalEList<Transition>(Transition.class);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @generated
	 */
	public Marking getInitialMarking()
	{
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(Marking newInitialMarking, NotificationChain msgs)
	{
		Marking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newInitialMarking the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	public void setInitialMarking(Marking newInitialMarking)
	{
		if (newInitialMarking != initialMarking)
		{
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = initialMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = newInitialMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @generated
	 */
	public Annotation getAnnotation()
	{
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
	{
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAnnotation the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation)
	{
		if (newAnnotation != annotation)
		{
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @generated
	 */
	public List<Arc> getArcs()
	{
		if (arcs == null)
		{
			arcs = new BasicInternalEList<Arc>(Arc.class);
		}
		return arcs;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @generated
	 */
	public Marking getFinalMarking()
	{
		return finalMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalMarking(Marking newFinalMarking, NotificationChain msgs)
	{
		Marking oldFinalMarking = finalMarking;
		finalMarking = newFinalMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(Marking newFinalMarking)
	{
		if (newFinalMarking != finalMarking)
		{
			NotificationChain msgs = null;
			if (finalMarking != null)
				msgs = finalMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			if (newFinalMarking != null)
				msgs = newFinalMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			msgs = basicSetFinalMarking(newFinalMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.PT_NET__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return basicSetFinalMarking(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return getPlaces();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return getTransitions();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return getInitialMarking();
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.PT_NET__ARCS:
				return getArcs();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return getFinalMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)null);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return places != null && !places.isEmpty();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return initialMarking != null;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.PT_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return finalMarking != null;
		}
		return super.eIsSet(featureID);
	}

} // PtNet
/**
 */
package ptnetLoLA;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * @extends Object
 * @generated
 */
public class PtNet extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking initialMarking;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getFinalMarking() <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking finalMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtNet()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PtnetLoLAPackage.Literals.PT_NET;
	}

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @generated
	 */
	public List<Place> getPlaces()
	{
		if (places == null)
		{
			places = new BasicInternalEList<Place>(Place.class);
		}
		return places;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @generated
	 */
	public List<Transition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new BasicInternalEList<Transition>(Transition.class);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @generated
	 */
	public Marking getInitialMarking()
	{
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(Marking newInitialMarking, NotificationChain msgs)
	{
		Marking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newInitialMarking the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	public void setInitialMarking(Marking newInitialMarking)
	{
		if (newInitialMarking != initialMarking)
		{
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = initialMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = newInitialMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @generated
	 */
	public Annotation getAnnotation()
	{
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
	{
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAnnotation the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation)
	{
		if (newAnnotation != annotation)
		{
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @generated
	 */
	public List<Arc> getArcs()
	{
		if (arcs == null)
		{
			arcs = new BasicInternalEList<Arc>(Arc.class);
		}
		return arcs;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @generated
	 */
	public Marking getFinalMarking()
	{
		return finalMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalMarking(Marking newFinalMarking, NotificationChain msgs)
	{
		Marking oldFinalMarking = finalMarking;
		finalMarking = newFinalMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(Marking newFinalMarking)
	{
		if (newFinalMarking != finalMarking)
		{
			NotificationChain msgs = null;
			if (finalMarking != null)
				msgs = finalMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			if (newFinalMarking != null)
				msgs = newFinalMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			msgs = basicSetFinalMarking(newFinalMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.PT_NET__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return basicSetFinalMarking(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return getPlaces();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return getTransitions();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return getInitialMarking();
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.PT_NET__ARCS:
				return getArcs();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return getFinalMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)null);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return places != null && !places.isEmpty();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return initialMarking != null;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.PT_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return finalMarking != null;
		}
		return super.eIsSet(featureID);
	}

} // PtNet
/**
 */
package ptnetLoLA;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * @extends Object
 * @generated
 */
public class PtNet extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking initialMarking;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getFinalMarking() <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking finalMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtNet()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PtnetLoLAPackage.Literals.PT_NET;
	}

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @generated
	 */
	public List<Place> getPlaces()
	{
		if (places == null)
		{
			places = new BasicInternalEList<Place>(Place.class);
		}
		return places;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @generated
	 */
	public List<Transition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new BasicInternalEList<Transition>(Transition.class);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @generated
	 */
	public Marking getInitialMarking()
	{
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(Marking newInitialMarking, NotificationChain msgs)
	{
		Marking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newInitialMarking the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	public void setInitialMarking(Marking newInitialMarking)
	{
		if (newInitialMarking != initialMarking)
		{
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = initialMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = newInitialMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @generated
	 */
	public Annotation getAnnotation()
	{
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
	{
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAnnotation the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation)
	{
		if (newAnnotation != annotation)
		{
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @generated
	 */
	public List<Arc> getArcs()
	{
		if (arcs == null)
		{
			arcs = new BasicInternalEList<Arc>(Arc.class);
		}
		return arcs;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @generated
	 */
	public Marking getFinalMarking()
	{
		return finalMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalMarking(Marking newFinalMarking, NotificationChain msgs)
	{
		Marking oldFinalMarking = finalMarking;
		finalMarking = newFinalMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(Marking newFinalMarking)
	{
		if (newFinalMarking != finalMarking)
		{
			NotificationChain msgs = null;
			if (finalMarking != null)
				msgs = finalMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			if (newFinalMarking != null)
				msgs = newFinalMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			msgs = basicSetFinalMarking(newFinalMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.PT_NET__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return basicSetFinalMarking(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return getPlaces();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return getTransitions();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return getInitialMarking();
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.PT_NET__ARCS:
				return getArcs();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return getFinalMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)null);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return places != null && !places.isEmpty();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return initialMarking != null;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.PT_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return finalMarking != null;
		}
		return super.eIsSet(featureID);
	}

} // PtNet
/**
 */
package ptnetLoLA;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * @extends Object
 * @generated
 */
public class PtNet extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking initialMarking;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getFinalMarking() <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking finalMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtNet()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PtnetLoLAPackage.Literals.PT_NET;
	}

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @generated
	 */
	public List<Place> getPlaces()
	{
		if (places == null)
		{
			places = new BasicInternalEList<Place>(Place.class);
		}
		return places;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @generated
	 */
	public List<Transition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new BasicInternalEList<Transition>(Transition.class);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @generated
	 */
	public Marking getInitialMarking()
	{
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(Marking newInitialMarking, NotificationChain msgs)
	{
		Marking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newInitialMarking the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	public void setInitialMarking(Marking newInitialMarking)
	{
		if (newInitialMarking != initialMarking)
		{
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = initialMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = newInitialMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @generated
	 */
	public Annotation getAnnotation()
	{
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
	{
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAnnotation the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation)
	{
		if (newAnnotation != annotation)
		{
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @generated
	 */
	public List<Arc> getArcs()
	{
		if (arcs == null)
		{
			arcs = new BasicInternalEList<Arc>(Arc.class);
		}
		return arcs;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @generated
	 */
	public Marking getFinalMarking()
	{
		return finalMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalMarking(Marking newFinalMarking, NotificationChain msgs)
	{
		Marking oldFinalMarking = finalMarking;
		finalMarking = newFinalMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(Marking newFinalMarking)
	{
		if (newFinalMarking != finalMarking)
		{
			NotificationChain msgs = null;
			if (finalMarking != null)
				msgs = finalMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			if (newFinalMarking != null)
				msgs = newFinalMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			msgs = basicSetFinalMarking(newFinalMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.PT_NET__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return basicSetFinalMarking(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return getPlaces();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return getTransitions();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return getInitialMarking();
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.PT_NET__ARCS:
				return getArcs();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return getFinalMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)null);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return places != null && !places.isEmpty();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return initialMarking != null;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.PT_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return finalMarking != null;
		}
		return super.eIsSet(featureID);
	}

} // PtNet
/**
 */
package ptnetLoLA;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * @extends Object
 * @generated
 */
public class PtNet extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking initialMarking;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getFinalMarking() <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking finalMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtNet()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PtnetLoLAPackage.Literals.PT_NET;
	}

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @generated
	 */
	public List<Place> getPlaces()
	{
		if (places == null)
		{
			places = new BasicInternalEList<Place>(Place.class);
		}
		return places;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @generated
	 */
	public List<Transition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new BasicInternalEList<Transition>(Transition.class);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @generated
	 */
	public Marking getInitialMarking()
	{
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(Marking newInitialMarking, NotificationChain msgs)
	{
		Marking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newInitialMarking the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	public void setInitialMarking(Marking newInitialMarking)
	{
		if (newInitialMarking != initialMarking)
		{
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = initialMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = newInitialMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @generated
	 */
	public Annotation getAnnotation()
	{
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
	{
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAnnotation the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation)
	{
		if (newAnnotation != annotation)
		{
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @generated
	 */
	public List<Arc> getArcs()
	{
		if (arcs == null)
		{
			arcs = new BasicInternalEList<Arc>(Arc.class);
		}
		return arcs;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @generated
	 */
	public Marking getFinalMarking()
	{
		return finalMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalMarking(Marking newFinalMarking, NotificationChain msgs)
	{
		Marking oldFinalMarking = finalMarking;
		finalMarking = newFinalMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(Marking newFinalMarking)
	{
		if (newFinalMarking != finalMarking)
		{
			NotificationChain msgs = null;
			if (finalMarking != null)
				msgs = finalMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			if (newFinalMarking != null)
				msgs = newFinalMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			msgs = basicSetFinalMarking(newFinalMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.PT_NET__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return basicSetFinalMarking(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return getPlaces();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return getTransitions();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return getInitialMarking();
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.PT_NET__ARCS:
				return getArcs();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return getFinalMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)null);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return places != null && !places.isEmpty();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return initialMarking != null;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.PT_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return finalMarking != null;
		}
		return super.eIsSet(featureID);
	}

} // PtNet
/**
 */
package ptnetLoLA;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * @extends Object
 * @generated
 */
public class PtNet extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking initialMarking;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getFinalMarking() <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking finalMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtNet()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PtnetLoLAPackage.Literals.PT_NET;
	}

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @generated
	 */
	public List<Place> getPlaces()
	{
		if (places == null)
		{
			places = new BasicInternalEList<Place>(Place.class);
		}
		return places;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @generated
	 */
	public List<Transition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new BasicInternalEList<Transition>(Transition.class);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @generated
	 */
	public Marking getInitialMarking()
	{
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(Marking newInitialMarking, NotificationChain msgs)
	{
		Marking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newInitialMarking the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	public void setInitialMarking(Marking newInitialMarking)
	{
		if (newInitialMarking != initialMarking)
		{
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = initialMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = newInitialMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @generated
	 */
	public Annotation getAnnotation()
	{
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
	{
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAnnotation the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation)
	{
		if (newAnnotation != annotation)
		{
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @generated
	 */
	public List<Arc> getArcs()
	{
		if (arcs == null)
		{
			arcs = new BasicInternalEList<Arc>(Arc.class);
		}
		return arcs;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @generated
	 */
	public Marking getFinalMarking()
	{
		return finalMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalMarking(Marking newFinalMarking, NotificationChain msgs)
	{
		Marking oldFinalMarking = finalMarking;
		finalMarking = newFinalMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(Marking newFinalMarking)
	{
		if (newFinalMarking != finalMarking)
		{
			NotificationChain msgs = null;
			if (finalMarking != null)
				msgs = finalMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			if (newFinalMarking != null)
				msgs = newFinalMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			msgs = basicSetFinalMarking(newFinalMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.PT_NET__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return basicSetFinalMarking(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return getPlaces();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return getTransitions();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return getInitialMarking();
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.PT_NET__ARCS:
				return getArcs();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return getFinalMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)null);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return places != null && !places.isEmpty();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return initialMarking != null;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.PT_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return finalMarking != null;
		}
		return super.eIsSet(featureID);
	}

} // PtNet
/**
 */
package ptnetLoLA;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * @extends Object
 * @generated
 */
public class PtNet extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking initialMarking;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getFinalMarking() <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking finalMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtNet()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PtnetLoLAPackage.Literals.PT_NET;
	}

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @generated
	 */
	public List<Place> getPlaces()
	{
		if (places == null)
		{
			places = new BasicInternalEList<Place>(Place.class);
		}
		return places;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @generated
	 */
	public List<Transition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new BasicInternalEList<Transition>(Transition.class);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @generated
	 */
	public Marking getInitialMarking()
	{
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(Marking newInitialMarking, NotificationChain msgs)
	{
		Marking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newInitialMarking the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	public void setInitialMarking(Marking newInitialMarking)
	{
		if (newInitialMarking != initialMarking)
		{
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = initialMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = newInitialMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @generated
	 */
	public Annotation getAnnotation()
	{
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
	{
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAnnotation the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation)
	{
		if (newAnnotation != annotation)
		{
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @generated
	 */
	public List<Arc> getArcs()
	{
		if (arcs == null)
		{
			arcs = new BasicInternalEList<Arc>(Arc.class);
		}
		return arcs;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @generated
	 */
	public Marking getFinalMarking()
	{
		return finalMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalMarking(Marking newFinalMarking, NotificationChain msgs)
	{
		Marking oldFinalMarking = finalMarking;
		finalMarking = newFinalMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(Marking newFinalMarking)
	{
		if (newFinalMarking != finalMarking)
		{
			NotificationChain msgs = null;
			if (finalMarking != null)
				msgs = finalMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			if (newFinalMarking != null)
				msgs = newFinalMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			msgs = basicSetFinalMarking(newFinalMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.PT_NET__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return basicSetFinalMarking(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return getPlaces();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return getTransitions();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return getInitialMarking();
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.PT_NET__ARCS:
				return getArcs();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return getFinalMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)null);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return places != null && !places.isEmpty();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return initialMarking != null;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.PT_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return finalMarking != null;
		}
		return super.eIsSet(featureID);
	}

} // PtNet
/**
 */
package ptnetLoLA;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * @extends Object
 * @generated
 */
public class PtNet extends Object implements Object
{
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking initialMarking;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getFinalMarking() <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking finalMarking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtNet()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PtnetLoLAPackage.Literals.PT_NET;
	}

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @generated
	 */
	public List<Place> getPlaces()
	{
		if (places == null)
		{
			places = new BasicInternalEList<Place>(Place.class);
		}
		return places;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @generated
	 */
	public List<Transition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new BasicInternalEList<Transition>(Transition.class);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Marking</em>' containment reference.
	 * @see #setInitialMarking(Marking)
	 * @generated
	 */
	public Marking getInitialMarking()
	{
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialMarking(Marking newInitialMarking, NotificationChain msgs)
	{
		Marking oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getInitialMarking <em>Initial Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newInitialMarking the new value of the '<em>Initial Marking</em>' containment reference.
	 * @see #getInitialMarking()
	 * @generated
	 */
	public void setInitialMarking(Marking newInitialMarking)
	{
		if (newInitialMarking != initialMarking)
		{
			NotificationChain msgs = null;
			if (initialMarking != null)
				msgs = initialMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			if (newInitialMarking != null)
				msgs = newInitialMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__INITIAL_MARKING, null, msgs);
			msgs = basicSetInitialMarking(newInitialMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @generated
	 */
	public Annotation getAnnotation()
	{
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
	{
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAnnotation the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation)
	{
		if (newAnnotation != annotation)
		{
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @generated
	 */
	public List<Arc> getArcs()
	{
		if (arcs == null)
		{
			arcs = new BasicInternalEList<Arc>(Arc.class);
		}
		return arcs;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' containment reference.
	 * @see #setFinalMarking(Marking)
	 * @generated
	 */
	public Marking getFinalMarking()
	{
		return finalMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalMarking(Marking newFinalMarking, NotificationChain msgs)
	{
		Marking oldFinalMarking = finalMarking;
		finalMarking = newFinalMarking;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.PtNet#getFinalMarking <em>Final Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' containment reference.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(Marking newFinalMarking)
	{
		if (newFinalMarking != finalMarking)
		{
			NotificationChain msgs = null;
			if (finalMarking != null)
				msgs = finalMarking.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			if (newFinalMarking != null)
				msgs = newFinalMarking.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.PT_NET__FINAL_MARKING, null, msgs);
			msgs = basicSetFinalMarking(newFinalMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return basicSetInitialMarking(null, msgs);
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.PT_NET__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return basicSetFinalMarking(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return getPlaces();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return getTransitions();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return getInitialMarking();
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.PT_NET__ARCS:
				return getArcs();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return getFinalMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				getPlaces().clear();
				return;
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				setInitialMarking((Marking)null);
				return;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.PT_NET__ARCS:
				getArcs().clear();
				return;
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				setFinalMarking((Marking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.PT_NET__PLACES:
				return places != null && !places.isEmpty();
			case PtnetLoLAPackage.PT_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PtnetLoLAPackage.PT_NET__INITIAL_MARKING:
				return initialMarking != null;
			case PtnetLoLAPackage.PT_NET__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.PT_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PtnetLoLAPackage.PT_NET__FINAL_MARKING:
				return finalMarking != null;
		}
		return super.eIsSet(featureID);
	}

} // PtNet
