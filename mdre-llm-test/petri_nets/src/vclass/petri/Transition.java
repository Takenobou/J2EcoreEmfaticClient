/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
/**
 */
package petri;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.Transition#getIn <em>In</em>}</li>
 *   <li>{@link petri.Transition#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see petri.PetriPackage#getTransition()
 * @model kind="class"
 * @generated
 */
public class Transition extends NamedElement
{
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition()
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
		return PetriPackage.Literals.TRANSITION;
	}

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see petri.PetriPackage#getTransition_In()
	 * @model
	 * @generated
	 */
	public EList<Place> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__IN);
		}
		return in;
	}

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link petri.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see petri.PetriPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	public EList<Place> getOut()
	{
		if (out == null)
		{
			out = new EObjectResolvingEList<Place>(Place.class, this, PetriPackage.TRANSITION__OUT);
		}
		return out;
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
			case PetriPackage.TRANSITION__IN:
				return getIn();
			case PetriPackage.TRANSITION__OUT:
				return getOut();
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Place>)newValue);
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Place>)newValue);
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
			case PetriPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case PetriPackage.TRANSITION__OUT:
				getOut().clear();
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
			case PetriPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case PetriPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Transition
