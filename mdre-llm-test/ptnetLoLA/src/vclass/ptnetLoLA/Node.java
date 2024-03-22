/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Node#getName <em>Name</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
 * @model kind="class"
 * @generated
 */
public class Node extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outgoing;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType TYPE_EDEFAULT = NodeType.INTERNAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NodeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node()
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
		return PtnetLoLAPackage.Literals.NODE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Annotation()
	 * @model containment="true"
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}' containment reference.
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
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Incoming()
	 * @see ptnetLoLA.Arc#getTarget
	 * @model opposite="target" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getIncoming()
	{
		if (incoming == null)
		{
			incoming = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__INCOMING, PtnetLoLAPackage.ARC__TARGET);
		}
		return incoming;
	}

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Outgoing()
	 * @see ptnetLoLA.Arc#getSource
	 * @model opposite="source" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getOutgoing()
	{
		if (outgoing == null)
		{
			outgoing = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__OUTGOING, PtnetLoLAPackage.ARC__SOURCE);
		}
		return outgoing;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link ptnetLoLA.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #setType(NodeType)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Type()
	 * @model default="0" required="true"
	 * @generated
	 */
	public NodeType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newType the new value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #getType()
	 * @generated
	 */
	public void setType(NodeType newType)
	{
		NodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case PtnetLoLAPackage.NODE__NAME:
				return getName();
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.NODE__INCOMING:
				return getIncoming();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return getOutgoing();
			case PtnetLoLAPackage.NODE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType((NodeType)newValue);
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
			case PtnetLoLAPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case PtnetLoLAPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case PtnetLoLAPackage.NODE__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // Node
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Node#getName <em>Name</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
 * @model kind="class"
 * @generated
 */
public class Node extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outgoing;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType TYPE_EDEFAULT = NodeType.INTERNAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NodeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node()
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
		return PtnetLoLAPackage.Literals.NODE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Annotation()
	 * @model containment="true"
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}' containment reference.
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
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Incoming()
	 * @see ptnetLoLA.Arc#getTarget
	 * @model opposite="target" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getIncoming()
	{
		if (incoming == null)
		{
			incoming = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__INCOMING, PtnetLoLAPackage.ARC__TARGET);
		}
		return incoming;
	}

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Outgoing()
	 * @see ptnetLoLA.Arc#getSource
	 * @model opposite="source" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getOutgoing()
	{
		if (outgoing == null)
		{
			outgoing = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__OUTGOING, PtnetLoLAPackage.ARC__SOURCE);
		}
		return outgoing;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link ptnetLoLA.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #setType(NodeType)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Type()
	 * @model default="0" required="true"
	 * @generated
	 */
	public NodeType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newType the new value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #getType()
	 * @generated
	 */
	public void setType(NodeType newType)
	{
		NodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case PtnetLoLAPackage.NODE__NAME:
				return getName();
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.NODE__INCOMING:
				return getIncoming();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return getOutgoing();
			case PtnetLoLAPackage.NODE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType((NodeType)newValue);
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
			case PtnetLoLAPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case PtnetLoLAPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case PtnetLoLAPackage.NODE__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // Node
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Node#getName <em>Name</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
 * @model kind="class"
 * @generated
 */
public class Node extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outgoing;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType TYPE_EDEFAULT = NodeType.INTERNAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NodeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node()
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
		return PtnetLoLAPackage.Literals.NODE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Annotation()
	 * @model containment="true"
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}' containment reference.
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
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Incoming()
	 * @see ptnetLoLA.Arc#getTarget
	 * @model opposite="target" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getIncoming()
	{
		if (incoming == null)
		{
			incoming = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__INCOMING, PtnetLoLAPackage.ARC__TARGET);
		}
		return incoming;
	}

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Outgoing()
	 * @see ptnetLoLA.Arc#getSource
	 * @model opposite="source" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getOutgoing()
	{
		if (outgoing == null)
		{
			outgoing = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__OUTGOING, PtnetLoLAPackage.ARC__SOURCE);
		}
		return outgoing;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link ptnetLoLA.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #setType(NodeType)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Type()
	 * @model default="0" required="true"
	 * @generated
	 */
	public NodeType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newType the new value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #getType()
	 * @generated
	 */
	public void setType(NodeType newType)
	{
		NodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case PtnetLoLAPackage.NODE__NAME:
				return getName();
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.NODE__INCOMING:
				return getIncoming();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return getOutgoing();
			case PtnetLoLAPackage.NODE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType((NodeType)newValue);
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
			case PtnetLoLAPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case PtnetLoLAPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case PtnetLoLAPackage.NODE__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // Node
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Node#getName <em>Name</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
 * @model kind="class"
 * @generated
 */
public class Node extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outgoing;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType TYPE_EDEFAULT = NodeType.INTERNAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NodeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node()
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
		return PtnetLoLAPackage.Literals.NODE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Annotation()
	 * @model containment="true"
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}' containment reference.
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
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Incoming()
	 * @see ptnetLoLA.Arc#getTarget
	 * @model opposite="target" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getIncoming()
	{
		if (incoming == null)
		{
			incoming = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__INCOMING, PtnetLoLAPackage.ARC__TARGET);
		}
		return incoming;
	}

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Outgoing()
	 * @see ptnetLoLA.Arc#getSource
	 * @model opposite="source" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getOutgoing()
	{
		if (outgoing == null)
		{
			outgoing = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__OUTGOING, PtnetLoLAPackage.ARC__SOURCE);
		}
		return outgoing;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link ptnetLoLA.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #setType(NodeType)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Type()
	 * @model default="0" required="true"
	 * @generated
	 */
	public NodeType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newType the new value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #getType()
	 * @generated
	 */
	public void setType(NodeType newType)
	{
		NodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case PtnetLoLAPackage.NODE__NAME:
				return getName();
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.NODE__INCOMING:
				return getIncoming();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return getOutgoing();
			case PtnetLoLAPackage.NODE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType((NodeType)newValue);
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
			case PtnetLoLAPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case PtnetLoLAPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case PtnetLoLAPackage.NODE__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // Node
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Node#getName <em>Name</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
 * @model kind="class"
 * @generated
 */
public class Node extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outgoing;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType TYPE_EDEFAULT = NodeType.INTERNAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NodeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node()
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
		return PtnetLoLAPackage.Literals.NODE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Annotation()
	 * @model containment="true"
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}' containment reference.
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
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Incoming()
	 * @see ptnetLoLA.Arc#getTarget
	 * @model opposite="target" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getIncoming()
	{
		if (incoming == null)
		{
			incoming = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__INCOMING, PtnetLoLAPackage.ARC__TARGET);
		}
		return incoming;
	}

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Outgoing()
	 * @see ptnetLoLA.Arc#getSource
	 * @model opposite="source" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getOutgoing()
	{
		if (outgoing == null)
		{
			outgoing = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__OUTGOING, PtnetLoLAPackage.ARC__SOURCE);
		}
		return outgoing;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link ptnetLoLA.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #setType(NodeType)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Type()
	 * @model default="0" required="true"
	 * @generated
	 */
	public NodeType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newType the new value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #getType()
	 * @generated
	 */
	public void setType(NodeType newType)
	{
		NodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case PtnetLoLAPackage.NODE__NAME:
				return getName();
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.NODE__INCOMING:
				return getIncoming();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return getOutgoing();
			case PtnetLoLAPackage.NODE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType((NodeType)newValue);
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
			case PtnetLoLAPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case PtnetLoLAPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case PtnetLoLAPackage.NODE__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // Node
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Node#getName <em>Name</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
 * @model kind="class"
 * @generated
 */
public class Node extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outgoing;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType TYPE_EDEFAULT = NodeType.INTERNAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NodeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node()
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
		return PtnetLoLAPackage.Literals.NODE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Annotation()
	 * @model containment="true"
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}' containment reference.
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
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Incoming()
	 * @see ptnetLoLA.Arc#getTarget
	 * @model opposite="target" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getIncoming()
	{
		if (incoming == null)
		{
			incoming = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__INCOMING, PtnetLoLAPackage.ARC__TARGET);
		}
		return incoming;
	}

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Outgoing()
	 * @see ptnetLoLA.Arc#getSource
	 * @model opposite="source" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getOutgoing()
	{
		if (outgoing == null)
		{
			outgoing = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__OUTGOING, PtnetLoLAPackage.ARC__SOURCE);
		}
		return outgoing;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link ptnetLoLA.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #setType(NodeType)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Type()
	 * @model default="0" required="true"
	 * @generated
	 */
	public NodeType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newType the new value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #getType()
	 * @generated
	 */
	public void setType(NodeType newType)
	{
		NodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case PtnetLoLAPackage.NODE__NAME:
				return getName();
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.NODE__INCOMING:
				return getIncoming();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return getOutgoing();
			case PtnetLoLAPackage.NODE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType((NodeType)newValue);
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
			case PtnetLoLAPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case PtnetLoLAPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case PtnetLoLAPackage.NODE__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // Node
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Node#getName <em>Name</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
 * @model kind="class"
 * @generated
 */
public class Node extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outgoing;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType TYPE_EDEFAULT = NodeType.INTERNAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NodeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node()
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
		return PtnetLoLAPackage.Literals.NODE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Annotation()
	 * @model containment="true"
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}' containment reference.
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
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Incoming()
	 * @see ptnetLoLA.Arc#getTarget
	 * @model opposite="target" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getIncoming()
	{
		if (incoming == null)
		{
			incoming = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__INCOMING, PtnetLoLAPackage.ARC__TARGET);
		}
		return incoming;
	}

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Outgoing()
	 * @see ptnetLoLA.Arc#getSource
	 * @model opposite="source" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getOutgoing()
	{
		if (outgoing == null)
		{
			outgoing = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__OUTGOING, PtnetLoLAPackage.ARC__SOURCE);
		}
		return outgoing;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link ptnetLoLA.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #setType(NodeType)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Type()
	 * @model default="0" required="true"
	 * @generated
	 */
	public NodeType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newType the new value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #getType()
	 * @generated
	 */
	public void setType(NodeType newType)
	{
		NodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case PtnetLoLAPackage.NODE__NAME:
				return getName();
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.NODE__INCOMING:
				return getIncoming();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return getOutgoing();
			case PtnetLoLAPackage.NODE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType((NodeType)newValue);
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
			case PtnetLoLAPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case PtnetLoLAPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case PtnetLoLAPackage.NODE__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // Node
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Node#getName <em>Name</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
 * @model kind="class"
 * @generated
 */
public class Node extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outgoing;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType TYPE_EDEFAULT = NodeType.INTERNAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NodeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node()
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
		return PtnetLoLAPackage.Literals.NODE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Annotation()
	 * @model containment="true"
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}' containment reference.
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
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Incoming()
	 * @see ptnetLoLA.Arc#getTarget
	 * @model opposite="target" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getIncoming()
	{
		if (incoming == null)
		{
			incoming = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__INCOMING, PtnetLoLAPackage.ARC__TARGET);
		}
		return incoming;
	}

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Outgoing()
	 * @see ptnetLoLA.Arc#getSource
	 * @model opposite="source" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getOutgoing()
	{
		if (outgoing == null)
		{
			outgoing = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__OUTGOING, PtnetLoLAPackage.ARC__SOURCE);
		}
		return outgoing;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link ptnetLoLA.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #setType(NodeType)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Type()
	 * @model default="0" required="true"
	 * @generated
	 */
	public NodeType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newType the new value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #getType()
	 * @generated
	 */
	public void setType(NodeType newType)
	{
		NodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case PtnetLoLAPackage.NODE__NAME:
				return getName();
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.NODE__INCOMING:
				return getIncoming();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return getOutgoing();
			case PtnetLoLAPackage.NODE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType((NodeType)newValue);
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
			case PtnetLoLAPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case PtnetLoLAPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case PtnetLoLAPackage.NODE__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // Node
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Node#getName <em>Name</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
 * @model kind="class"
 * @generated
 */
public class Node extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outgoing;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType TYPE_EDEFAULT = NodeType.INTERNAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NodeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node()
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
		return PtnetLoLAPackage.Literals.NODE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Annotation()
	 * @model containment="true"
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}' containment reference.
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
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Incoming()
	 * @see ptnetLoLA.Arc#getTarget
	 * @model opposite="target" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getIncoming()
	{
		if (incoming == null)
		{
			incoming = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__INCOMING, PtnetLoLAPackage.ARC__TARGET);
		}
		return incoming;
	}

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Outgoing()
	 * @see ptnetLoLA.Arc#getSource
	 * @model opposite="source" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getOutgoing()
	{
		if (outgoing == null)
		{
			outgoing = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__OUTGOING, PtnetLoLAPackage.ARC__SOURCE);
		}
		return outgoing;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link ptnetLoLA.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #setType(NodeType)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Type()
	 * @model default="0" required="true"
	 * @generated
	 */
	public NodeType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newType the new value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #getType()
	 * @generated
	 */
	public void setType(NodeType newType)
	{
		NodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case PtnetLoLAPackage.NODE__NAME:
				return getName();
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.NODE__INCOMING:
				return getIncoming();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return getOutgoing();
			case PtnetLoLAPackage.NODE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType((NodeType)newValue);
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
			case PtnetLoLAPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case PtnetLoLAPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case PtnetLoLAPackage.NODE__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // Node
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Node#getName <em>Name</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
 * @model kind="class"
 * @generated
 */
public class Node extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outgoing;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType TYPE_EDEFAULT = NodeType.INTERNAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NodeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node()
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
		return PtnetLoLAPackage.Literals.NODE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Annotation()
	 * @model containment="true"
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}' containment reference.
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
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Incoming()
	 * @see ptnetLoLA.Arc#getTarget
	 * @model opposite="target" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getIncoming()
	{
		if (incoming == null)
		{
			incoming = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__INCOMING, PtnetLoLAPackage.ARC__TARGET);
		}
		return incoming;
	}

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Outgoing()
	 * @see ptnetLoLA.Arc#getSource
	 * @model opposite="source" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getOutgoing()
	{
		if (outgoing == null)
		{
			outgoing = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__OUTGOING, PtnetLoLAPackage.ARC__SOURCE);
		}
		return outgoing;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link ptnetLoLA.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #setType(NodeType)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Type()
	 * @model default="0" required="true"
	 * @generated
	 */
	public NodeType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newType the new value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #getType()
	 * @generated
	 */
	public void setType(NodeType newType)
	{
		NodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case PtnetLoLAPackage.NODE__NAME:
				return getName();
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.NODE__INCOMING:
				return getIncoming();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return getOutgoing();
			case PtnetLoLAPackage.NODE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType((NodeType)newValue);
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
			case PtnetLoLAPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case PtnetLoLAPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case PtnetLoLAPackage.NODE__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // Node
/**
 */
package ptnetLoLA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Node#getName <em>Name</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ptnetLoLA.Node#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getNode()
 * @model kind="class"
 * @generated
 */
public class Node extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outgoing;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType TYPE_EDEFAULT = NodeType.INTERNAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NodeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node()
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
		return PtnetLoLAPackage.Literals.NODE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Annotation()
	 * @model containment="true"
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
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getAnnotation <em>Annotation</em>}' containment reference.
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
				msgs = annotation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = newAnnotation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PtnetLoLAPackage.NODE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Incoming()
	 * @see ptnetLoLA.Arc#getTarget
	 * @model opposite="target" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getIncoming()
	{
		if (incoming == null)
		{
			incoming = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__INCOMING, PtnetLoLAPackage.ARC__TARGET);
		}
		return incoming;
	}

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ptnetLoLA.Arc}.
	 * It is bidirectional and its opposite is '{@link ptnetLoLA.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Outgoing()
	 * @see ptnetLoLA.Arc#getSource
	 * @model opposite="source" changeable="false" derived="true"
	 * @generated
	 */
	public EList<Arc> getOutgoing()
	{
		if (outgoing == null)
		{
			outgoing = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PtnetLoLAPackage.NODE__OUTGOING, PtnetLoLAPackage.ARC__SOURCE);
		}
		return outgoing;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link ptnetLoLA.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #setType(NodeType)
	 * @see ptnetLoLA.PtnetLoLAPackage#getNode_Type()
	 * @model default="0" required="true"
	 * @generated
	 */
	public NodeType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newType the new value of the '<em>Type</em>' attribute.
	 * @see ptnetLoLA.NodeType
	 * @see #getType()
	 * @generated
	 */
	public void setType(NodeType newType)
	{
		NodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetLoLAPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case PtnetLoLAPackage.NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case PtnetLoLAPackage.NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case PtnetLoLAPackage.NODE__NAME:
				return getName();
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return getAnnotation();
			case PtnetLoLAPackage.NODE__INCOMING:
				return getIncoming();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return getOutgoing();
			case PtnetLoLAPackage.NODE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PtnetLoLAPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType((NodeType)newValue);
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
			case PtnetLoLAPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PtnetLoLAPackage.NODE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case PtnetLoLAPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case PtnetLoLAPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PtnetLoLAPackage.NODE__ANNOTATION:
				return annotation != null;
			case PtnetLoLAPackage.NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case PtnetLoLAPackage.NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case PtnetLoLAPackage.NODE__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // Node
